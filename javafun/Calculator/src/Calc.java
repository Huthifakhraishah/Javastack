
public class Calc {
	private double number1;
	private char opration;
	public Calc() {

	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public char getOpration() {
		return opration;
	}
	public void setOpration(char opration) {
		this.opration = opration;
	}
	public double result(int number) {
		if (this.opration=='+')
			return (this.number1 += number);
		if(this.opration=='-')
			return (this.number1 -=number);
		if(this.opration=='/')
			return (this.number1 /= number);
		if(this.opration=='*')
			return (this.number1 *= number);
		return 0;
	}
	
	
}
