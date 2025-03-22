package pro.sky.demospring.calculator.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvSources;
import pro.sky.demospring.calculator.exception.DivideByZeroException;
import pro.sky.demospring.calculator.exception.NumberNotProducedException;
import pro.sky.demospring.calculator.service.api.CalculatorService;

class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSources({
        @CsvSource({"5,5,10"}),
        @CsvSource({"-5,-3,-8"}),
        @CsvSource({"-5,6,1"})
    })
    void plus(Integer num1, Integer num2, Integer expectedResult) {
        Integer actualResult = calculatorService.plus(num1, num2);

        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    void plusNegative() {
        Integer num1 = null;
        int num2 = 6;

        assertThrows(NumberNotProducedException.class, () -> calculatorService.plus(num1, num2));
    }

    @Test
    void minus() {
    }

    @Test
    void multiply() {
    }

    @ParameterizedTest
    @CsvSource({"1,1,1", "10,5,2", "-10,-5,2"})
    void divide(int num1, int num2, int result) {
        Integer divide = calculatorService.divide(num1, num2);
        assertThat(result).isEqualTo(divide);
    }

    @Test
    void divideByZero() {
        assertThrows(DivideByZeroException.class, () -> calculatorService.divide(10, 0));
    }

    @Test
    void divideNegative() {
        assertThrows(NumberNotProducedException.class, () -> calculatorService.divide(10, null));
    }
}