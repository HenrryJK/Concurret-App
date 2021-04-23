package procesos04;

public class Principal03 {

	public static void main(String[] args) {
		 	System.out.println("Resultados de la Carrera");
			Hilos001 leopardo1 = new Hilos001();
			Hilos002 leopardo2 = new Hilos002();
			Hilos003 leopardo3 = new Hilos003();
			Thread leopardo4 = new Thread(new Hilos004());
			
			leopardo1.start();
			leopardo2.start();
			leopardo3.start();
			leopardo4.start();

	}

}
