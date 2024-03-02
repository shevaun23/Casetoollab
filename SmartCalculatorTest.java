package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartCalculatorTest{

    @Test
    void testCalculateSimpleInterest() {
        SmartCalculator calculator = new SmartCalculator();
        double result = calculator.calculateSimpleInterest(1000, 5, 2);
        assertEquals(100.0, result, 0.001); // Expected output: 100.0
    }

    @Test
    void testCalculateCompoundInterest() {
        SmartCalculator calculator = new SmartCalculator();
        double result = calculator.calculateCompoundInterest(1000, 5, 2);
        assertEquals(102.50, result, 0.001); // Expected output: 102.50
    }

    @Test
    void testCalculateMean() {
        SmartCalculator calculator = new SmartCalculator();
        double[] numbers = {10, 20, 30, 40, 50};
        double result = calculator.calculateMean(numbers);
        assertEquals(30.0, result, 0.001); // Expected output: 30.0
    }

    @Test
    void testCalculateFactorial() {
        SmartCalculator calculator = new SmartCalculator();
        double result = calculator.calculateFactorial(5);
        assertEquals(120.0, result, 0.001); // Expected output: 120.0
    }

    @Test
    void testCalculatePercentage() {
        SmartCalculator calculator = new SmartCalculator();
        double result = calculator.calculatePercentage(500, 450);
        assertEquals(90.0, result, 0.001); // Expected output: 90.0
    }
}