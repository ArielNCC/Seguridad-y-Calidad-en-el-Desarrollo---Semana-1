package com.duoc.veterinaria.config;

import com.duoc.veterinaria.model.usuario.Usuario;
import com.duoc.veterinaria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    @Value("${SEED_PASSWORD}")
    private String seedPassword;

    public DatabaseSeeder(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        if (usuarioRepository.count() > 0) {
            return;
        }

        String hash = passwordEncoder.encode(seedPassword);

        usuarioRepository.save(new Usuario("user", hash, "USER"));
        usuarioRepository.save(new Usuario("vet", hash, "VET"));
        usuarioRepository.save(new Usuario("admin", hash, "ADMIN"));
    }
}
