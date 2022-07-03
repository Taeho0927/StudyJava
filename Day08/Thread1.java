package Day08;

public class Thread1 extends Thread {
	Thread1(){
		
	}
	
	Thread1(String name){
		setName(name);
	}
	
	@Override
	public void run() {
		try {
			for(int i =0; i<10;i++) {
				Thread.sleep(1000);
				System.out.println("Thread["+ getName()+"] : "+i);
			}
		}
		catch(Exception e) {
			
		}
	}

}
