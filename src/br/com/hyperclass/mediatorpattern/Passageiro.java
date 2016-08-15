package br.com.hyperclass.mediatorpattern;

public class Passageiro {
	
	private final String name;
	private CentralTaxi centralTaxi;
	private StatusPassageiro statusPassageiro;
	
	public Passageiro(String name, CentralTaxi centralTaxi) {
		super();
		this.name = name;
		this.centralTaxi = centralTaxi;
		this.statusPassageiro = StatusPassageiro.EM_ESPERA;
	}
	
	public void atualizaStatusPassageiro(final StatusPassageiro statusPassageiro){
		setStatusPassageiro(statusPassageiro);
	}
	
	public StatusPassageiro getStatusPassageiro() {
		return statusPassageiro;
	}

	public String getName() {
		return name;
	}

	private void setStatusPassageiro(StatusPassageiro statusPassageiro) {
		this.statusPassageiro = statusPassageiro;
	}
	
	
	
	
}
