package com.tobeto.spring.b.java.core.utilities.exceptions;

import org.slf4j.event.KeyValuePair;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //bu metod bir exceptionhandler metodudur demek içerisine handle etmek istediğimiz metodun TÜRÜNÜ veriyoruz
    //.class burada type
    @ExceptionHandler({ MethodArgumentNotValidException.class })
    //Kullanıcıya dönülmek istenen htpp hata kodunu burada belirledik
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleValidationException(MethodArgumentNotValidException exception){
        Map<String,String> errors = new HashMap<>();

        for (FieldError error: exception.getBindingResult().getFieldErrors()) {
            errors.put(error.getField(),error.getDefaultMessage());
        }

        return errors;

    }
    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleRuntimeError(RuntimeException exception){
        return exception.getMessage();
    }
    //Known Types
    //Unknown Types

    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleUnknownErrors(){
        return "bilinmedik hata";
    }
}
