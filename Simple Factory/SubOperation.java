class SubOperation extends Operation {
	public SubOperation(double operatorA, double operatorB) {
		super(operatorA, operatorB);
	}
	
	public SubOperation() {
		this(0.0, 0.0);
	}
	
	@Override
	public double getResult() {
		return super.getOperatorA() - super.getOperatorB();
	}
}