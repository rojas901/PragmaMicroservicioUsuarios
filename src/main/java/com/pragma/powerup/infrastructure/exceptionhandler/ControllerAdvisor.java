package com.pragma.powerup.infrastructure.exceptionhandler;

import com.pragma.powerup.infrastructure.exception.RolNotFoundException;
import com.pragma.powerup.infrastructure.exception.UsuarioExistenteException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    private static final String MESSAGE = "message";

    @ExceptionHandler(RolNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleRolNotFoundException(
            RolNotFoundException ignoredRolNotFoundException) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.ROL_NOT_FOUND.getMessage()));
    }

    @ExceptionHandler(UsuarioExistenteException.class)
    public ResponseEntity<Map<String, String>> handleUsuarioExistenteException(
            UsuarioExistenteException ignoredUsuarioExistenteException) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap(MESSAGE, ExceptionResponse.USUARIO_EXISTENTE.getMessage()));
    }
    
}