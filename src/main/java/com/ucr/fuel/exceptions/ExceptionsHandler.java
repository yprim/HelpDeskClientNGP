package com.ucr.fuel.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestControllerAdvice
public class ExceptionsHandler {
    @ExceptionHandler(RecordNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDetails resourceNotFoundException(RecordNotFoundException ex, WebRequest request) {
        ErrorDetails errorDetails = ErrorDetails.newBuilder()
                .withTimestamp(new Date())
                .withMessage(ex.getMessage())
                .withDetails(request.getDescription(false))
                .build();
        return errorDetails;
    }
    @ExceptionHandler(Exception.class)

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDetails globalExceptionHandler(Exception ex, WebRequest request) {
        ErrorDetails errorDetails = ErrorDetails.newBuilder()
                .withTimestamp(new Date())
                .withMessage(ex.getMessage())
                .withDetails(request.getDescription(false))
                .build();
        return errorDetails;
    }
}