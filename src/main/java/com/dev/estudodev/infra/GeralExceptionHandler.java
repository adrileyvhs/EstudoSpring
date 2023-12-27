package com.dev.estudodev.infra;

import com.dev.estudodev.dto.ExceptionDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeralExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity threatDuplicateEntry(DataIntegrityViolationException exception){
        ExceptionDto exceptionDto = new ExceptionDto("Usuário Duplicado","500");
        return ResponseEntity.badRequest().body(exceptionDto);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threat404(DataIntegrityViolationException exception){
        return ResponseEntity.notFound().build();
    }
     @ExceptionHandler(Exception.class)
     public ResponseEntity ExceptionGeral(Exception exception){
         ExceptionDto exceptionDto = new ExceptionDto(exception.getMessage(),"500");
         return ResponseEntity.internalServerError().body(exceptionDto);

     }


}
