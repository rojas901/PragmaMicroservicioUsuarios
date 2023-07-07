package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRolServicePort;
import com.pragma.powerup.domain.model.Rol;
import com.pragma.powerup.domain.spi.IRolPersistencePort;

public class RolUseCase implements IRolServicePort {

    private final IRolPersistencePort rolPersistencePort;

    public RolUseCase(IRolPersistencePort rolPersistencePort) {
        this.rolPersistencePort = rolPersistencePort;
    }


    @Override
    public Rol guardarRol(Rol rol) {
        return rolPersistencePort.guardarRol(rol);
    }

    @Override
    public Rol obtenerRol(Long idRol) {
        return rolPersistencePort.obtenerRol(idRol);
    }
}