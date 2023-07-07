package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserRequestDto {
    private String name;
    private String surname;
    private String identificationDocument;
    private String cellPhone;
    private LocalDate birthDate;
    private String email;
    private String password;
}
