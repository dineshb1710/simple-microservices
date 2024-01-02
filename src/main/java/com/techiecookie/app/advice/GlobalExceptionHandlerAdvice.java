package com.techiecookie.app.advice;

import com.techiecookie.app.exception.EmployeeNotFoundException;
import com.techiecookie.app.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage employeeNotFoundExceptionHandler(EmployeeNotFoundException employeeNotFoundException) {
        return new ErrorMessage(HttpStatus.NOT_FOUND, employeeNotFoundException.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericExceptionHandler(RuntimeException runtimeException) {
        return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR, runtimeException.getMessage());
    }
}
