package model;

public class Ingressos {

private float valor;	
private String ID;	
	
	public Ingressos() {
		
	}


	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}


	public float getValor() {
		return valor ;
	}

	public float getValorFinal(float taxa) {
		valor +=  (valor * taxa);
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}	
	
}
