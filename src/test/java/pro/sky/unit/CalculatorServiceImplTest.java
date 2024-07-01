package pro.sky.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.unit.exception.DivideByZeroException;
import pro.sky.unit.service.CalculatorService;
import pro.sky.unit.service.Impl.CalculatorServiceImpl;

public class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldCorrectlyCalculateSum() {
        int num1 = 10;
        int num2 = 20;
        int expectedResult = 30;
        Integer actualResult = calculatorService.plus(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateMinus() {
        int num1 = 10;
        int num2 = 20;
        int expectedResult = -10;
        Integer actualResult = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateMultiply() {
        int num1 = 10;
        int num2 = 20;
        int expectedResult = 200;
        Integer actualResult = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldCorrectlyCalculateDivide() {
        int num1 = 20;
        int num2 = 10;
        int expectedResult = 2;
        Integer actualResult = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldThrowExceptionWhenSecondArgumentIsZero() {
        int num1 = 10;
        int num2 = 0;
        Assertions.assertThrows(
                DivideByZeroException.class,
                () -> calculatorService.divide(num1, num2)
        );
    }
}
