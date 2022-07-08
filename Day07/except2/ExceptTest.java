package Day07.except2;

import java.util.Random;

public class ExceptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excep e = new Excep();
			for(int i=0;i<10;i++) {
				try {
					e.getVariable();
				}
				catch(Exception ex) {
					System.out.println(ex.toString());
			}
		}
	}
}


class Excep{
	public void getVariable() throws Exception {
		Random rd = new Random();
		int i = rd.nextInt(100);
		
		if(i>70) {
			throw new MyException("Critical!!");
		}
		else if (i<30) {
			throw new MyException("Ah bad news...");
		}
		else {
			System.out.println("So So"+i);
		}
	}
	
}
class MyException extends Exception {
	MyException(String msg){
		super(msg);
		System.out.println("야 드디어 내 예외 떳다");
	}
}