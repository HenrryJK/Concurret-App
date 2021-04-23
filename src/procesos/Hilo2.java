package procesos;

public class Hilo2 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.print(i + "  ");
			try {
				Hilo1.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			}
		
		
		
	}
}
