package java2_HerenciaHashtable;

public abstract class Vivienda {
	protected int tamano;
	protected int num;

	public Vivienda(){

	}
	public Vivienda(int tamano, int num){
		this.tamano = tamano;
		this.num = num;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}


