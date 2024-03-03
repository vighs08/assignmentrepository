package testcase;
/**
 * @author LENOVO
 * @version 1.o
 * @since 2024-03-02
 */
public class Clientprog {

	public static void main(String[] args) 
	{
		// Example using non-parameterized constructor
        SmartCalculator calculator1 = new SmartCalculator();
        calculator1.setPrincipal(1000);
        calculator1.setRate(5);
        calculator1.setTime(2);
        double simpleInterest = calculator1.calculateSimpleInterest(calculator1.getPrincipal(), calculator1.getRate(), calculator1.getTime());
        System.out.println("Simple interest: " + simpleInterest);

        // Example using parameterized constructor
        SmartCalculator calculator2 = new SmartCalculator(5000, 7, 3, 5, 100, 80);
        
	


	
	}

}
