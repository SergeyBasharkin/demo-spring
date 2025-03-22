package pro.sky.demospring.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.demospring.calculator.exception.DivideByZeroException;
import pro.sky.demospring.calculator.exception.NumberNotProducedException;
import pro.sky.demospring.calculator.service.api.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer plus(Integer num1, Integer num2) {
        validate(num1, num2);
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        validate(num1, num2);

        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        validate(num1, num2);

        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        validate(num1, num2);
        if (num2 == 0) {
            throw new DivideByZeroException("Деление на ноль невозможно");
        }

        return num1 / num2;
    }

    private void validate(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NumberNotProducedException("Не передан номер");
        }
    }
}
