package SE_ASSIGNMENT;

	public class SmartCalculator {
	    private double principal;
	    private double rate;
	    private double time;
	    private double[] numbers;
	    private double totalMarks;
	    private double marksObtained;

	    // Non-parameterized constructor
	    public SmartCalculator() {
	        this.principal = 0;
	        this.rate = 0;
	        this.time = 0;
	        this.numbers = null;
	        this.totalMarks = 0;
	        this.marksObtained = 0;
	    }

	    // Parameterized constructor
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
	    public double calculateSimpleInterest(double principal, double rate, double time) {
	        return (principal * rate * time) / 100;
	    }

	    // Method to calculate compound interest
	    public double calculateCompoundInterest(double principal, double rate, double time) {
	        return principal * (Math.pow((1 + rate / 100), time)) - principal;
	    }

	    // Method to calculate mean of given numbers
	    public double calculateMean(double[] numbers) {
	        double sum = 0;
	        for (double num : numbers) {
	            sum += num;
	        }
	        return sum / numbers.length;
	    }

	    // Method to calculate factorial of a given number
	    public double calculateFactorial(double number) {
	        double factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    // Method to calculate percentage of given total marks & marks obtained
	    public double calculatePercentage(double totalMarks, double marksObtained) {
	        return (marksObtained / totalMarks) * 100;
	    }
	}

