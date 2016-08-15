package br.com.hyperclass.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
	
	private final String placaTaxi;
	private CentralTaxi centralTaxi;
	private StatusTaxi statusTaxi;
	private Passageiro passageiro;
	private List<Passageiro> listaPassageiroEspera;
	
	public Taxi(String placaTaxi, CentralTaxi centralTaxi) {
		super();
		this.placaTaxi = placaTaxi;
		this.centralTaxi = centralTaxi;
		this.statusTaxi = StatusTaxi.DESOCUPADO;
		this.passageiro = null;
		this.listaPassageiroEspera = new ArrayList<Passageiro>();
	}
	
	public void addPassageiroTaxi(final Passageiro passageiro){
		setPassageiro(passageiro);
		setStatusTaxi(StatusTaxi.OCUPADO);
	}
	
	public void addPassageiroEspera(final Passageiro passageiroEspera) {
		listaPassageiroEspera.add(passageiroEspera);
	}

	public String getPlacaTaxi() {
		return placaTaxi;
	}

	public CentralTaxi getCentralTaxi() {
		return centralTaxi;
	}
	
	public StatusTaxi getStatusTaxi() {
		return statusTaxi;
	}
	
	public List<Passageiro> getListaPassageiroEspera() {
		return listaPassageiroEspera;
	}

	private void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	private void setStatusTaxi(StatusTaxi statusTaxi) {
		this.statusTaxi = statusTaxi;
	}
	
}
