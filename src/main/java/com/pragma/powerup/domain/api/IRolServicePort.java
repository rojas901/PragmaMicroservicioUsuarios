package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.Rol;

public interface IRolServicePort {

    Rol guardarRol(Rol rol);

    Rol obtenerRol(Long idRol);
}