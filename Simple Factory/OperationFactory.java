class OperationFactory {
	public static Operation createOperation(String operator) {
		Operation oper = null;
		switch(operator) {
			case "+" : 
				oper = new AddOperation();
				break;
			case "-" :
				oper = new SubOperation();
				break;
			case "*" : 
				oper = new MultipleOperation();
				break;
			case "/" : 
				oper = new DivideOperation();
				break;
		}
		
		return oper;
	}
}