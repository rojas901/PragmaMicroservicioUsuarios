package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.Role;

public interface IRoleServicePort {

    Role findRoleById(Long id);
}
