package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.Rol;
import com.pragma.powerup.domain.model.Usuario;
import com.pragma.powerup.domain.spi.IRolPersistencePort;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;
import com.pragma.powerup.infrastructure.exception.RolNotFoundException;
import com.pragma.powerup.infrastructure.exception.UsuarioExistenteException;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IRolEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IUsuarioEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IRolRepository;
import com.pragma.powerup.infrastructure.out.jpa.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RolJpaAdapter implements IRolPersistencePort {

    private final IRolRepository rolRepository;
    private final IRolEntityMapper rolEntityMapper;


    @Override
    public Rol guardarRol(Rol rol) {
        return rolEntityMapper.toRol(rolRepository.save(rolEntityMapper.toEntity(rol)));
    }

    @Override
    public Rol obtenerRol(Long idRol) {
        return rolEntityMapper.toRol(rolRepository.findById(idRol).orElseThrow(RolNotFoundException::new));
    }
}