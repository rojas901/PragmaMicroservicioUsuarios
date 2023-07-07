package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.Rol;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UsuarioRequestDto {
    //private Long id;
    private String nombre;
    private String apellido;
    private String documentoDeIdentidad;
    private String celular;
    private Rol rol;
    private Date fechaNacimiento;
    private String correo;
    private String clave;
}
