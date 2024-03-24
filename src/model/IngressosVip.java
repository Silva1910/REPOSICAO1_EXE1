package model;

public class IngressosVip extends Ingressos {

	public IngressosVip() {
		
	}

	@Override
	public float getValorFinal(float taxa) {
		
		return getValor() + (getValor() * taxa) + (getValor()* 0.18f);
	}
	
	

}
