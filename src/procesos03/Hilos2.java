package procesos03;

import java.util.Scanner;

public class Hilos2 extends Thread {
	Scanner keyboard = new Scanner(System.in);
	
	@Override
	public void run() {
		System.out.print("Ingrese el numero: ");
		int num = keyboard.nextInt();
		
		
		System.out.println("El factorial de : " + num + " es: " + factorial(num));
	}
	public static double factorial (int n ) { 
		double aux= 1;
		for (int i = 2; i <=n; i++) {
			aux *=i;
		}
		return aux;
	}
}
