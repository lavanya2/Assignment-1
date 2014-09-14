/*SI- 543 Lavanya Kumar*/
package calc;

public class ComplexCalculator {

	private double currentNumber;
	public double newNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	// TODO subtracts d from current number  
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	}
	
	// multiply()
	// TODO multiplies current number by d
	public void multiply(double d) {
		currentNumber = currentNumber * d;
	}
	
	// divide()
	// TODO divides current number by a given number
	public void divide(double d) {
		currentNumber = currentNumber/d;
	}
	
	// clear()
	// TODO sets current number to 0
	public void clear(double d) {
		currentNumber = 0;
	}
	
	// power()
	// TODO raises current number to the power of a given number
	public void power(double d) {
		int i = 0;
		double newNumber = 1; //can't equal "0" or multiple will always be "0"
		while (i < d) { //go through loop until i is equal to power (d)
		newNumber = currentNumber * newNumber; 
		i++; //increase i by one
		}
		currentNumber = newNumber; 
		
	}
	
	public double getCurrentNumber() {
		return currentNumber;
		
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	public boolean isEven() {
		if (currentNumber % 2 == 0) { //remainder of even numbers always "0"
			return true;
		}
		else {
			return false;
		}
	}
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	public boolean isPrime() {
		if (currentNumber % 2 != 0 && currentNumber % 3 != 0 || currentNumber == 2) { //if not equal to a number divisible by 2 AND a number divisible by 3 (or the number 2 which is an even but also a prime number)
			return true;
		}
		else {
			return false;
		}
	}
	
	
	////////////////////////////////////////////////////
	
}
