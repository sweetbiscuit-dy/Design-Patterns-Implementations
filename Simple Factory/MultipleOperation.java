class MultipleOperation extends Operation {
	public MultipleOperation(double operatorA, double operatorB) {
		super(operatorA, operatorB);
	}
	
	public MultipleOperation() {
		this(0.0, 0.0);
	}
	
	@Override
	public double getResult() {
		return super.getOperatorA() * super.getOperatorB();
	}
}