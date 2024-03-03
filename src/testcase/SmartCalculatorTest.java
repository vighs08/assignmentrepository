package testcase;
import static org.junit.Assert.*;
import org.junit.Test;

public class SmartCalculatorTest {

    @Test
    public void testCalculateSimpleInterest() {
        SmartCalculator calculator = new SmartCalculator();
        calculator.setPrincipal(1000);
        calculator.setRate(5);
        calculator.setTime(2);

        double expectedSimpleInterest = 1000 * 5 * 2 / 100.0;
        double actualSimpleInterest = calculator.calculateSimpleInterest(
            calculator.getPrincipal(),
            calculator.getRate(),
            calculator.getTime()
        );

        assertEquals(expectedSimpleInterest, actualSimpleInterest, 0.0001);
    }

    @Test
    public void testCalculateCompoundInterest() {
        SmartCalculator calculator = new SmartCalculator();
        calculator.setPrincipal(5000);
        calculator.setRate(7);
        calculator.setTime(3);

        double expectedCompoundInterest = 5000 * Math.pow((1 + 7 / 100.0), 3) - 5000;
        double actualCompoundInterest = calculator.calculateCompoundInterest();

        assertEquals(expectedCompoundInterest, actualCompoundInterest, 0.0001);
    }

    @Test
    public void testCalculateMean() {
       
    	SmartCalculator calculator = new SmartCalculator();
            calculator.setNumber(3);
        double result = calculator.calculateMean();
          assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testCalculateFactorial() {
        SmartCalculator calculator = new SmartCalculator();

        // Test with a positive number
        int positiveNumber = 5;
        long expectedFactorialPositive = 1 * 2 * 3 * 4 * 5;
        long actualFactorialPositive = calculator.calculateFactorial(positiveNumber);

        assertEquals(expectedFactorialPositive, actualFactorialPositive);

        // Test with a negative number
        int negativeNumber = -5;
        long expectedFactorialNegative = -1; // As per your implementation
        long actualFactorialNegative = calculator.calculateFactorial(negativeNumber);

        assertEquals(expectedFactorialNegative, actualFactorialNegative);
    }

    @Test
    public void testCalculatePercentage() {
        SmartCalculator calculator = new SmartCalculator();
        calculator.setTotalMarks(100);
        calculator.setObtainedMarks(80);

        double expectedPercentage = (80 / 100.0) * 100;
        double actualPercentage = calculator.calculatePercentage();

        assertEquals(expectedPercentage, actualPercentage, 0.0001);
    }
}


