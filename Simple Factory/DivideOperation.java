class DivideOperation extends Operation {
	public DivideOperation(double operatorA, double operatorB) {
		super(operatorA, operatorB);
	}
	
	public DivideOperation() {
		this(0.0, 0.0);
	}
	
	@Override
	public double getResult() {
		return super.getOperatorA() / super.getOperatorB();
	}
}