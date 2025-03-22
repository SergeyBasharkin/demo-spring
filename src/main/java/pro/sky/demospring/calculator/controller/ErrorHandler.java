package pro.sky.demospring.calculator.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pro.sky.demospring.calculator.exception.DivideByZeroException;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(DivideByZeroException.class)
    public String handleDivideByZeroException(DivideByZeroException e) {
        return e.getMessage();
    }
}
