package procesos02;



public class Hilos01 extends Thread {

	@Override
	public void run() {
		
	int[] numbers = {2 , 7,  5 , 4 , 9 , 3 , 6 ,8 ,1};
	int  s=0;
		
	for (int number : numbers) {
		s+= Math.pow(number,3);
	}
	 System.out.println("La suma total de los cubos es = " + s); 
	}
	
}
