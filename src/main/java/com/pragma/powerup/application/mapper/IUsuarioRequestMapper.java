package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.domain.model.Rol;
import com.pragma.powerup.domain.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUsuarioRequestMapper {
    Usuario toUsuario(UsuarioRequestDto usuarioRequestDto);

    @Mapping(source = "usuarioRequestDto.rol.nombre", target = "nombre")
    Rol toRol(UsuarioRequestDto usuarioRequestDto);
}
