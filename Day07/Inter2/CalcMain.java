package Day07.Inter2;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CalculatorDummy c = new CalculatorDummy();
		Calculator c = new Calculator();
		c.setOperand(10, 21, 30);
		System.out.println(c.sum());
		System.out.println(c.avg());
	}

}

class CalculatorDummy implements CalcInterface{
	public void setOperand(int first, int second, int third) {
		
	}
	public int sum() {
		return 0;
	}
	public double avg() {
		return 20.0;
	}
}
