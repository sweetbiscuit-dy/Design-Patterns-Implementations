import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operator = sc.nextLine();
		
		Operation oper = OperationFactory.createOperation(operator);
		
		double operatorA = sc.nextDouble();
		double operatorB = sc.nextDouble();
		
		oper.setOperatorA(operatorA);
		oper.setOperatorB(operatorB);
		
		System.out.println(oper.getResult());
	}
}