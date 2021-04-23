package procesos04;

public class Hilos001 extends Thread  {
	@Override
	public void run() {
		for (int i = 0; i < 1; i++) {
		System.out.println("Leopardo 01");
	}
	}
}
