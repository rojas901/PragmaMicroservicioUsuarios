package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.Usuario;

public interface IUsuarioPersistencePort {

    void guardarUsuario(Usuario usuario);
}