package com.pragma.powerup.application.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.Period;

public class LegalAgeValidator implements ConstraintValidator<LegalAge, LocalDate> {

    private static final int LEGAL_AGE = 18;

    @Override
    public void initialize(LegalAge constraintAnnotation) {
    }

    @Override
    public boolean isValid(LocalDate birthdate, ConstraintValidatorContext context) {
        if (birthdate == null) {
            return true; // Allow null values to be handled by @NotNull or @NotBlank
        }

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        return age.getYears() >= LEGAL_AGE;
    }
}
