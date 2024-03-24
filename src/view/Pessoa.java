package view;

import model.Ingressos;
import model.IngressosVip;

public class Pessoa {

	public static void main(String[] args) {
		Ingressos i = new Ingressos();
		IngressosVip iVip = new IngressosVip();
		
		
		i.setID("10");
		i.setValor(50);
	
		
		
		iVip.setID("100");
		iVip.setValor(50);
		
	
	
	System.out.println("a pessoa com ingresso comum tem o ID " + i.getID() + " o valor do ingresso e " + i.getValorFinal(1.05f));
	System.out.println("a pessoa com ingresso VIP  tem  o ID " + iVip.getID() + " o valor do ingresso e " + iVip.getValorFinal(1.05f));
	
	}

}
