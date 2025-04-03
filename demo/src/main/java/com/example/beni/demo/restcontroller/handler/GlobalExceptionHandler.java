package com.example.beni.demo.restcontroller.handler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.beni.demo.exceptions.AlreadyLockedDoorException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AlreadyLockedDoorException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Map<String, Object> handlePorteVerrouilleException(AlreadyLockedDoorException ex) {
        Map<String, Object> errorResponse = new HashMap<>();
        errorResponse.put("error", "AlreadyLockedDoorException");
        errorResponse.put("message", ex.getMessage());
        errorResponse.put("code", 403);
        errorResponse.put("timestamp", LocalDateTime.now().toString());
        return errorResponse;
    }
}
