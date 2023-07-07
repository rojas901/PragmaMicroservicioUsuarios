package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.Role;
import com.pragma.powerup.infrastructure.out.jpa.entity.RoleEntity;

import java.util.Optional;

public interface IRolePersistencePort {

    Role findRoleById(Long id);
}
