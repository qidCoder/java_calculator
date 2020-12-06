package calculatorPart1;

public class Calculator {
	private double OperandOne;
	private double OperandTwo;
	private char Operation;
	
	//Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.
	public Calculator() {
		
	}
	
	public Calculator(double operandOne, double operandTwo, char operation) {
		OperandOne = operandOne;
		OperandTwo = operandTwo;
		Operation = operation;
	}

	public double getOperandOne() {
		return OperandOne;
	}

	public void setOperandOne(double operandOne) {
		OperandOne = operandOne;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		OperandTwo = operandTwo;
	}

	public char getOperation() {
		return Operation;
	}

	public void setOperation(char operation) {
		Operation = operation;
	}



//methods
//Have logic for adding and subtracting.
public double performOperation() {
	if(this.getOperation() == '+') {
		return this.getOperandOne() + this.OperandTwo;		
	}
	else if(this.getOperation() == '-') {
		return this.getOperandOne() - this.OperandTwo;		
	}
	else {
		System.out.println("Invalid Operand. Enter either + or -");
		return 0;
	}
}


public void getResults() {
	System.out.printf("Result of %.2f %c %.2f: %.2f\n", this.OperandOne, this.Operation, this.OperandTwo, this.performOperation());
}


}


