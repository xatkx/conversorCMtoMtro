import java.util.Scanner;

public class conversor {

	public static void mostrar() {
		System.out.println("---------------------");
		System.out.println("Welcome to app");
		System.out.println("Option !!");
		System.out.println("1 - conversor de centimetro a metros");
		System.out.println("2 - conversor de metros a centimetros");
		System.out.println("9 - exit =(");
		System.out.println("---------------------");
	}
	
	public static double OptionConversor(int option, double input) {
		double proporcion = 0.01;
		//System.out.print("ingresa: ");
		double valor = input; //// .nextDouble();
		if(option==2)
		{
			proporcion = 100;
		}
		return valor * proporcion;
		
		
		//System.out.println("resultado es: "+total);
		
	}
}
