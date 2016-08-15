package br.com.hyperclass.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Passageiro> listaPassageiro = new ArrayList<Passageiro>();
		List<Taxi> listaTaxi = new ArrayList<Taxi>();
		
		CentralTaxi centralTaxi = new CentralTaxi(listaTaxi, listaPassageiro);
		
		Passageiro passageiro = new Passageiro("Passageiro1", centralTaxi);
		Passageiro passageiro2 = new Passageiro("Passageiro2", centralTaxi);
		Passageiro passageiro3 = new Passageiro("Passageiro3", centralTaxi);
		Passageiro passageiro4 = new Passageiro("Passageiro4", centralTaxi);
		
		Taxi taxi = new Taxi("AAA-1111", centralTaxi);
		Taxi taxi2 = new Taxi("BBB-1111", centralTaxi);
		Taxi taxi3 = new Taxi("CCC-1111", centralTaxi);
		Taxi taxi4 = new Taxi("DDD-1111", centralTaxi);
		
		
		centralTaxi.adicionaPassageiro(passageiro);
		centralTaxi.adicionaPassageiro(passageiro2);
		centralTaxi.adicionaPassageiro(passageiro3);
		centralTaxi.adicionaPassageiro(passageiro4);
		
		centralTaxi.adicionaTaxu(taxi);
		centralTaxi.adicionaTaxu(taxi2);
		centralTaxi.adicionaTaxu(taxi3);
		centralTaxi.adicionaTaxu(taxi4);
		
		Taxi taxiPassageiro = centralTaxi.chamarTaxi(passageiro);
		System.out.println("Taxi: " + taxiPassageiro.getPlacaTaxi());
		System.out.println("Estatus: " + taxiPassageiro.getStatusTaxi());
		
		System.out.print("\n");
		
		for (Taxi taxi5 : centralTaxi.retornaListaTaxi()) {
			System.out.println("Placa: " + taxi5.getPlacaTaxi());
			System.out.println("Estatus: " + taxi5.getStatusTaxi());
		}
		
		System.out.print("\n");
		
		centralTaxi.listaPassageriosEspera(taxi2);
		for (Passageiro passageiro5 : taxi2.getListaPassageiroEspera()) {
			System.out.println("Passagerios em espera: " + passageiro5.getName());
		}
		
		
	}

}
