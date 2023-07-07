package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.Usuario;

public interface IUsuarioServicePort {

    void guardarUsuario(Usuario usuario);
}