package java2_HerenciaHashtable;

public class Piso extends Vivienda {
	protected int planta;
	protected char letra;
	
	public Piso(){
		super();
	}
	public Piso(int tamano, int num, int planta, char letra){
		super();
		this.planta = planta;
		this.letra = letra;
	}
	
	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	

}
