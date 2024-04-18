package com.example.api.configs;

import com.example.api.exceptions.ApiError;
import com.example.api.exceptions.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerConfig {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiError> apiExceptionHandler(ApiException apiException) {
        var apiError = new ApiError(apiException.getStatusCode(), apiException.getMessage());
        return new ResponseEntity<ApiError>(apiError, HttpStatus.valueOf(apiError.getStatusCode()));
    }
}
