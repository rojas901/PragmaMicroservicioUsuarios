package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.dto.response.RolDto;
import com.pragma.powerup.application.dto.response.UsuarioResponseDto;
import com.pragma.powerup.domain.model.Rol;
import com.pragma.powerup.domain.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        uses = IRolDtoMapper.class)
public interface IUsuarioResponseMapper {

    IRolDtoMapper INSTANCE = Mappers.getMapper(IRolDtoMapper.class);

    @Mapping(target = "nombre", source = "rolDto.nombre")
    UsuarioResponseDto toResponse(Usuario usuario, RolDto rolDto);
}
