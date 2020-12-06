package calculatorPart1;

public class Tester {

	public static void main(String[] args) {
		Calculator add = new Calculator();
		Calculator subtract = new Calculator();

		add.setOperandOne(10.5);
		add.setOperation('+');
		add.setOperandTwo(5.2);
		
		add.performOperation();
		add.getResults();
		
		subtract.setOperandOne(10.5);
		subtract.setOperation('-');
		subtract.setOperandTwo(5.2);
		
		subtract.performOperation();
		subtract.getResults();

	}

}
