package Day08;

public class Thread2 implements Runnable{
	String name ="";
	
	Thread2(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				Thread.sleep(1000);
				System.out.println("Runnable["+getName()+"]"+i);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
