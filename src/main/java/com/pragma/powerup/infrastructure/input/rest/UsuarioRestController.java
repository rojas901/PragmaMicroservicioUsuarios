package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.handler.IUsuarioHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuarios")
@RequiredArgsConstructor
public class UsuarioRestController {

    private final IUsuarioHandler usuarioHandler;

    @PostMapping
    public ResponseEntity<Void> guardarUsuario(@RequestBody UsuarioRequestDto usuarioRequestDto) {
        usuarioHandler.guardarUsuario(usuarioRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}