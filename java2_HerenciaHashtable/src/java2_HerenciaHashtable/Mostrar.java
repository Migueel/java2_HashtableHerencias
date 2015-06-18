

import java.util.Scanner;
import java.util.Hashtable;


public class Mostrar {

	public static void main(String[] args) {
		int tamano = 0;
		int num  = 0;
		int planta = 0;
		char letra = 'a';
		
		Piso piso = new Piso(tamano, num, planta, letra);
		Scanner sc = new Scanner(System.in);
		Hashtable<String, Comparable> inf = new Hashtable<String, Comparable>();
		
		System.out.println("Introduce los siguientes datos del piso: ");
		System.out.println("Portal:");
		num = sc.nextInt();
		System.out.println("Planta:");
		planta = sc.nextInt();
		System.out.println("Letra:");
	   	letra = sc.next().charAt(0);
		System.out.println("Tamaño:");
		tamano = sc.nextInt();
		
		inf.put("portal", num);
		inf.put("planta", planta);
		inf.put("letra", letra);
		inf.put("tamaño", tamano);
		
		System.out.println("DATOS DEL PISO");
		System.out.println("----------------");
		System.out.println("Portal: " +inf.get("portal"));
		System.out.println("Planta: " +inf.get("planta"));
		System.out.println("Letra: " +inf.get("letra"));
		System.out.println("Tamaño: " +inf.get("tamaño") + " m2");
		
	}

}
