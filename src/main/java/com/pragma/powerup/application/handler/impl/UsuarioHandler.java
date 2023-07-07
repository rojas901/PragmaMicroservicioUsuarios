package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.handler.IUsuarioHandler;
import com.pragma.powerup.application.mapper.*;
import com.pragma.powerup.domain.api.IRolServicePort;
import com.pragma.powerup.domain.api.IUsuarioServicePort;
import com.pragma.powerup.domain.model.Rol;
import com.pragma.powerup.domain.model.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioHandler implements IUsuarioHandler {

    private final IUsuarioServicePort usuarioServicePort;
    private final IRolServicePort rolServicePort;
    private final IUsuarioRequestMapper usuarioRequestMapper;
    private final IUsuarioResponseMapper usuarioResponseMapper;
    private final IRolDtoMapper rolDtoMapper;

    @Override
    public void guardarUsuario(UsuarioRequestDto usuarioRequestDto) {
        Rol rol = rolServicePort.guardarRol(usuarioRequestMapper.toRol(usuarioRequestDto));
        Usuario usuario = usuarioRequestMapper.toUsuario(usuarioRequestDto);
        usuario.setIdRol(rol.getId());
        usuarioServicePort.guardarUsuario(usuario);
    }
}