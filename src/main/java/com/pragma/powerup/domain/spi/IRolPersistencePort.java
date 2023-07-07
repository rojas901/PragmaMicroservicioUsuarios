package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.Rol;

public interface IRolPersistencePort {

    Rol guardarRol(Rol rol);

    Rol obtenerRol(Long idRol);
}