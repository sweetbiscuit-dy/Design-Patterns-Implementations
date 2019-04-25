abstract class Operation {
	private double operatorA;
	private double operatorB;
	
	public Operation(double operatorA, double operatorB) {
		this.operatorA = operatorA;
		this.operatorB = operatorB;
	}
	
	public Operation() {
		this(0.0, 0.0);
	}
	
	public void setOperatorA(double operatorA) {
		this.operatorA = operatorA;
	}
	
	public double getOperatorA() {
		return operatorA;
	}
	
	public void setOperatorB(double operatorB) {
		this.operatorB = operatorB;
	}
	
	public double getOperatorB() {
		return operatorB;
	}
	
	public abstract double getResult();
}