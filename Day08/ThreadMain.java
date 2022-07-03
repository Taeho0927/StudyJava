package Day08;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1("T1");
		Thread1 th2 = new Thread1("T2");
		Thread1 th3 = new Thread1();
		
		//순차적으로 실행
		//th1.run();
		//th2.run();
		//th3.run();
		
		//독립적으로 실행
		//th1.start();
		//th2.start();
		//th3.start();
		
		/*
		 * Runnable
		 */
		Thread2 r1 = new Thread2("r1");
		Thread2 r2 = new Thread2("r2");
		Thread2 r3 = new Thread2("r3");
		
		Thread th4 = new Thread(r1);
		Thread th5 = new Thread(r2);
		Thread th6 = new Thread(r3);
		
		th4.start();
		th5.start();
		th6.start();
		
		
	}

}
