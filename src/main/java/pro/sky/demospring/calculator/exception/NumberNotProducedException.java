package pro.sky.demospring.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NumberNotProducedException extends RuntimeException{

    public NumberNotProducedException(String message) {
        super(message);
    }
}
