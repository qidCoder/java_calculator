package calculatorPart2;

import java.util.ArrayList;

public class Calculator {
	private ArrayList<Double> operands = new ArrayList<Double>();
	private ArrayList<String> operators = new ArrayList<String>();
	private double final_result = 0;//will hold final calculation
	
	//Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.
	public Calculator() {
		
	}
	
	//METHODS
	//method to add all operands to list
	public void performOperation(double operand) {
		operands.add(operand);
	}
	
	//method to add all operators to list
	public void performOperation(String operator) {
		double first_result = 0;//will hold the current value
		
		if(operator != "=") {
			this.operators.add(operator);
		}
		else {
			int i = 0;
			//first apply multiplication and division in order from left to right
			while(this.operators.contains("*") || this.operators.contains("/")) {
				if(this.operators.get(i) == "*") {
					first_result = this.operands.get(i) * this.operands.get(i+1);
					
					//replace the first operand with the new result
					this.operands.set(i, first_result);
					//remove the next operand as it has just been incorporated
					this.operands.remove(i+1);
					//remove the operand that was just completed
					this.operators.remove(i);
					
					i -= 1;
				}
				else if(this.operators.get(i) == "/") {
					first_result = this.operands.get(i) / this.operands.get(i+1);
					
					//replace the first operand with the new result
					this.operands.set(i, first_result);
					//remove the next operand as it has just been incorporated
					this.operands.remove(i+1);
					//remove the operand that was just completed
					this.operators.remove(i);
					
					i -= 1;
				}
				i++;
			}
			
			//set first value in array
			this.final_result = this.operands.get(0);
				
			//second, apply all addition and subtraction from left to right
			for(i = 0; i < this.operators.size(); i++) {
				if(this.operators.get(i) == "+") {
					this.final_result += this.operands.get(i + 1);
				}
				else if(this.operators.get(i) == "-") {
					first_result -= this.operands.get(i + 1);
				}
			}
		}
	}
	
	//method to apply equation in correct order of operations
	public void getResults() {		
		System.out.printf("Result: %.2f\n", this.final_result);
	}



}
