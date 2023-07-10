package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.application.validation.LegalAge;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Getter
@Setter
public class UserRequestDto {

    @NotBlank(message = "name is mandatory")
    private String name;

    @NotBlank(message = "surname is mandatory")
    private String surname;

    @NotBlank(message = "identification document is mandatory")
    @Pattern(regexp = "^\\d+$", message = "identification document must be numeric")
    private String identificationDocument;

    @NotBlank(message = "cell phone is mandatory")
    @Size(max = 13, message = "cell phone maximum length is 13 characters")
    @Pattern(regexp = "^[+]?\\d+$", message = "cell phone can contain one plus sign and must be numeric")
    private String cellPhone;

    @NotNull(message = "birthdate is mandatory")
    @LegalAge
    private LocalDate birthDate;

    @NotBlank(message = "email is mandatory")
    @Email(message = "email is invalid")
    private String email;

    @NotBlank(message = "password is mandatory")
    private String password;
}
