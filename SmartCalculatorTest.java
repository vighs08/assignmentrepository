package testcaseassignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmartCalculatorTest {
	private SmartCalculator calculator;
	@Before
	public void setUp() throws Exception
	{
		 calculator = new SmartCalculator();
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	@Test
	public void testCalculateSimpleInterest() 
	{
		 assertEquals(200, calculator.calculateSimpleInterest(1000, 10, 2), 0.001);
	        assertEquals(500, calculator.calculateSimpleInterest(10000, 5, 1), 0.001);
	}

	@Test
	public void testCalculateCompoundInterest() 
	{
		calculator.setPrincipal(1000);
        calculator.setRate(10);
        calculator.setTime(2);
        assertEquals(210, calculator.calculateCompoundInterest(), 0.001);

        calculator.setPrincipal(10000);
        calculator.setRate(5);
        calculator.setTime(1);
        assertEquals(512.5, calculator.calculateCompoundInterest(), 0.001);
	}

	@Test
	public void testCalculateMean()
	{
		double[] numbers = {10, 20, 30, 40, 50};
        assertEquals(30, calculator.calculateMean(numbers), 0.001);

        double[] numbers2 = {5, 5, 5, 5, 5};
        assertEquals(5, calculator.calculateMean(numbers2), 0.001);
	}

	@Test
	public void testCalculateFactorial() 
	{
		  assertEquals(120, calculator.calculateFactorial(5), 0.001);
	        assertEquals(1, calculator.calculateFactorial(0), 0.001);
	    }
	

	@Test
	public void testCalculatePercentage()
	{
		 assertEquals(50, calculator.calculatePercentage(200, 100), 0.001);
	        assertEquals(80, calculator.calculatePercentage(500, 400), 0.001);
	}

}