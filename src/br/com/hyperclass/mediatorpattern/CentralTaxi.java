package br.com.hyperclass.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class CentralTaxi {
	
	private final List<Taxi> listTaxi;
	private final List<Passageiro> listaPassageiro;
	
	public CentralTaxi(List<Taxi> listTaxi, List<Passageiro> listaPassageiro) {
		super();
		this.listTaxi = new ArrayList<Taxi>();
		this.listaPassageiro = new ArrayList<Passageiro>();
	}
	
	public void adicionaPassageiro(final Passageiro passageiro){
		listaPassageiro.add(passageiro);
	}
	
	public void adicionaTaxu(final Taxi taxi){
		listTaxi.add(taxi);
	}
	
	public Taxi chamarTaxi(final Passageiro passageiro){
		Taxi taxiDisponivel = null;
		
		for (Taxi taxi : listTaxi) {
			if(taxi.getStatusTaxi() == StatusTaxi.DESOCUPADO){
				 Passageiro passageiroEncontrado = retornaPessageiro(passageiro);
				 taxi.addPassageiroTaxi(passageiroEncontrado);
				 passageiro.atualizaStatusPassageiro(StatusPassageiro.ATENDIDO);
				 return taxiDisponivel = taxi;
			}
		}
		return taxiDisponivel;
	}
	
	public List<Taxi> retornaListaTaxi(){
		return listTaxi;
	}
	
	public void listaPassageriosEspera(final Taxi taxi){
		Taxi taxiListaEspera = retornaTaxi(taxi);
		for (Passageiro passageiro : listaPassageiro) {
			if(passageiro.getStatusPassageiro() == StatusPassageiro.EM_ESPERA){
				taxiListaEspera.addPassageiroEspera(passageiro);
			}
		}
	}
	
	private Passageiro retornaPessageiro(final Passageiro passageiro){
		Passageiro passageiroEncontrado = null;
		for (Passageiro passageiro2 : listaPassageiro) {
			if(passageiro2.equals(passageiro)){
				passageiroEncontrado = passageiro2;
				return passageiroEncontrado;
			}
		}
		return passageiroEncontrado;
	}
	
	private Taxi retornaTaxi(final Taxi taxi){
		Taxi taxiEncontrado = null;
		for (Taxi taxi2 : listTaxi) {
			if(taxi2.equals(taxi)){
				taxiEncontrado = taxi2;
			}
		}
		return taxiEncontrado;
	}
	

}
