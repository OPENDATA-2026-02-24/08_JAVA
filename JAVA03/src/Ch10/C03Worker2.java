package Ch10;

public class C03Worker2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;;i++) {
			System.out.println("TASK02..."+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	
}
