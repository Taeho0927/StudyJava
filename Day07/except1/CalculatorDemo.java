package Day07.except1;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperand(14, 5);
		c.divide();
		c.setOperand(100, 0);
		c.divide();
	}

}

class Calculator {
	int left, right;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
		
	}
	
	//예외처리를 하지 않음
//	public void divide() {
//		System.out.println(left/right);
//	}
	
	//예외처리를 함
	public void divide() {
		try {
			System.out.println(left/right);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(left/1);
		}
		catch(Exception e) {
			System.out.println("이건 무조건 걸린다");
		}
		finally {
			System.out.println("이용해주셔서 감사합니다.");
		}
	}
}