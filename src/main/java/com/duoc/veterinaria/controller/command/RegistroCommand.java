package com.duoc.veterinaria.controller.command;

import com.duoc.veterinaria.model.registro.RegistroMedico;

public interface RegistroCommand {

    void ejecutar(RegistroMedico registro);
}