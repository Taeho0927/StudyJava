package Day07.Inter2;

public class Calculator implements CalcInterface{
	int left, center, right;
	
	public void setOperand(int first, int second, int third) {
			left = first;
			center = second;
			right = third;
	}
	
	public int sum() {
		System.out.println(left+center+right);
		return left+center+right;
	}
	public double avg() {
		System.out.println((left+center+right)/3.);
		return ((double)(left+center+right))/3;
	}

}
