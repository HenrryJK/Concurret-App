package procesos;


public class Principal01 {
	public static void main(String[] args) {
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		System.out.print("Numeros Ascendentes: ");
		h1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		System.out.println(" ");
		System.out.print("Numeros Descendentes: ");
		h2.start();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
