package java2_HerenciaHashtable;

import java.util.Scanner;
import java.util.Hashtable;


public class Mostrar {

	public static void main(String[] args) {
		
		Piso piso = new Piso();
		Scanner sc = new Scanner(System.in);
		Hashtable<String, Comparable> inf = new Hashtable<String, Comparable>();
		
		System.out.println("Introduce los siguientes datos del piso: ");
		System.out.println("Portal:");
		piso.setNum(sc.nextInt());
		System.out.println("Planta:");
		piso.setPlanta(sc.nextInt());
		System.out.println("Letra:");
		piso.setLetra(sc.next().charAt(0));
		System.out.println("Tamaño:");
		piso.setTamano(sc.nextInt());
		
		inf.put("portal", piso.getNum());
		inf.put("planta", piso.getPlanta());
		inf.put("letra", piso.getLetra());
		inf.put("tamaño", piso.getTamano());
		
		System.out.println("DATOS DEL PISO");
		System.out.println("----------------");
		System.out.println("Portal: " +inf.get("num"));
		System.out.println("Planta: " +inf.get("planta"));
		System.out.println("Letra: " +inf.get("letra"));
		System.out.println("Tamaño: " +inf.get("tamano") + "m2");
		
	}

}
