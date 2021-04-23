package procesos;


public class Hilo1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "  ");
			try {
				Hilo1.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			}
	}

}
