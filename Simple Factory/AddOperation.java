class AddOperation extends Operation {
	//double operatorA;
	//double operatorB;
	
	public AddOperation(double operatorA, double operatorB) {
		super(operatorA, operatorB);
	}
	
	public AddOperation() {
		this(0.0, 0.0);
	}
	@Override
	public double getResult() {
		return super.getOperatorA() + super.getOperatorB();
	}
}