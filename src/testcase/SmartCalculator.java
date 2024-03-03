package testcase;
/**
 * @author LENOVO
 * @version 
 * The SmartCalculator class provides various mathematical calculations
 * including simple interest, compound interest, mean, factorial, and percentage.
 * It also includes methods to set and retrieve values for principal, rate, time,
 */
public class SmartCalculator
{
	private double principal;
    private double rate;
    private int time;
    private int number;
    private double totalMarks;
    private double obtainedMarks;
    /**
     * Default constructor initializes all fields to default values.
     */
    public SmartCalculator() {
        this.principal = 0.0;
        this.rate = 0.0;
        this.time = 0;
        this.number = 0;
        this.totalMarks = 0.0;
        this.obtainedMarks = 0.0;
    }
    /**
     * Parameterized constructor to initialize fields with specified values.
     *
     * @param principal    The principal amount for calculations.
     * @param rate         The rate of interest for calculations.
     * @param time         The time period for calculations.
     * @param number       The total number of elements for mean calculation.
     * @param totalMarks   The total marks for percentage calculation.
     * @param obtainedMarks The obtained marks for percentage calculation.
     */
    public SmartCalculator(double principal, double rate, int time, int number, double totalMarks, double obtainedMarks) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.number = number;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }
    /**
     * Gets the principal amount.
     * @return The principal amount.
     */
	public double getPrincipal() {
		return principal;
	}
	/**
     * Sets the principal amount.
     * @param principal The principal amount to set.
     */
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	/**
     * Gets the interest rate.
     * @return The interest rate.
     */
	public double getRate() {
		return rate;
	}
	 /**
     * Sets the interest rate.
     * @param rate The interest rate to set.
     */
	public void setRate(double rate) {
		this.rate = rate;
	}
	/**
     * Gets the time period in years.
     * @return The time period in years.
     */
	public int getTime() {
		return time;
	}
	/**
     * Sets the time period in years.
     * @param time The time period in years to set.
     */
	public void setTime(int time) {
		this.time = time;
	}
	 /**
     * Gets the number of values for mean calculation.
     * @return The number of values for mean calculation.
     */
	public int getNumber() {
		return number;
	}
	/**
     * Sets the number of values for mean calculation.
     * @param number The number of values for mean calculation to set.
     */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
     * Gets the total marks obtained in a test.
     * @return The total marks obtained in a test.
     */
	public double getTotalMarks() {
		return totalMarks;
	}
	  /**
     * Sets the total marks obtained in a test.
     * @param totalMarks The total marks obtained in a test to set.
     */
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	/**
     * Gets the marks obtained by a student.
     * @return The marks obtained by a student.
     */
	public double getObtainedMarks() {
		return obtainedMarks;
	}
	/**
     * Sets the marks obtained by a student.
     * @param obtainedMarks The marks obtained by a student to set.
     */
	public void setObtainedMarks(double obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}
	/**
     * Calculates simple interest.
     * @param principal The principal amount.
     * @param rate The interest rate.
     * @param time The time period in years.
     * @return The simple interest.
     */
	public double calculateSimpleInterest(double principal, double rate, int time)
	{
        return (principal * rate * time) / 100;
    }
	/**
     * Calculates compound interest based on the current object's properties.
     * @return The compound interest.
     */
	// Method to calculate compound interest (input taken through setters)
    public double calculateCompoundInterest() {
        if (principal == 0 || rate == 0 || time == 0) {
            // Handle invalid input
            return Double.NaN;
        }
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }
    /**
     * Calculates the mean of given numbers.
     * @return The mean value.
     */
 // Method to calculate mean of given numbers (input taken through setters)
    public double calculateMean() {
        if (number == 0) {
            // Handle invalid input
            return Double.NaN;
        }
        double sum = 0;
        // Add logic to read and sum multiple numbers
        // ... (replace with your implementation)
        return sum / number;
    }
    /**
     * Calculates the factorial of a number.
     * @param number The number for which factorial is calculated.
     * @return The factorial of the number.
     */
    public long calculateFactorial(int number) {
        if (number < 0) {
            // Handle invalid input
            return -1;
        }
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    /**
     * Calculates the percentage based on total marks and obtained marks.
     * @return The percentage.
     */
 // Method to calculate percentage (input taken through setters)
    public double calculatePercentage() {
        if (totalMarks == 0) {
            // Handle invalid input
            return Double.NaN;
        }
        return (obtainedMarks / totalMarks) * 100;
    }
}

