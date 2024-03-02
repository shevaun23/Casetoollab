package app;
/**
 * The SmartCalculator class represents a calculator with various mathematical functions.
 * It includes methods to calculate simple interest, compound interest, mean of numbers,
 * factorial of a number, and percentage based on given total marks and marks obtained.
 * The class also provides getters and setters for its properties.
 */
public class SmartCalculator {
    private double principal;
    private double rate;
    private double time;
    private double[] numbers;
    private double totalMarks;
    private double marksObtained;

    // Non-parameterized constructor
    /**
     * Constructs a new SmartCalculator with default values.
     * All properties are initialized to zero or null.
     */
    public SmartCalculator() {
        this.principal = 0;
        this.rate = 0;
        this.time = 0;
        this.numbers = null;
        this.totalMarks = 0;
        this.marksObtained = 0;
    }

    // Parameterized constructor
    /**
     * Constructs a new SmartCalculator with specified values.
     * @param principal The principal amount
     * @param rate The interest rate
     * @param time The time period
     * @param numbers An array of numbers
     * @param totalMarks The total marks in an exam
     * @param marksObtained The marks obtained by a student
     */
    
    public SmartCalculator(double principal, double rate, double time, double[] numbers, double totalMarks, double marksObtained) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.numbers = numbers;
        this.totalMarks = totalMarks;
        this.marksObtained = marksObtained;
    }

    // Getters and setters
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(double marksObtained) {
        this.marksObtained = marksObtained;
    }

    // Method to calculate simple interest
    /**
     * Calculates simple interest based on principal, rate, and time.
     * @param principal The principal amount
     * @param rate The interest rate
     * @param time The time period
     * @return The calculated simple interest
     */
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Method to calculate compound interest
    /**
     * Calculates compound interest based on principal, rate, and time.
     * @param principal The principal amount
     * @param rate The interest rate
     * @param time The time period
     * @return The calculated compound interest
     */
    public double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow((1 + rate / 100), time)) - principal;
    }

    // Method to calculate mean of given numbers
    /**
     * Calculates the mean (average) of the given numbers.
     * @param numbers An array of numbers
     * @return The mean of the numbers
     */
    public double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate factorial of a given number
    /**
     * Calculates the factorial of a given number.
     * @param number The number for which factorial is to be calculated
     * @return The factorial of the number
     */
    public double calculateFactorial(double number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to calculate percentage of given total marks & marks obtained
    /**
     * Calculates the percentage based on given total marks and marks obtained.
     * @param totalMarks The total marks in an exam
     * @param marksObtained The marks obtained by a student
     * @return The calculated percentage
     */
    public double calculatePercentage(double totalMarks, double marksObtained) {
        return (marksObtained / totalMarks) * 100;
    }
}
