package br.com.fiap.Trabalho3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(new Pessoa("João Garcia", 20, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Maria Martins", 44, 'F', "Simples"));
		pessoas.add(new Pessoa("Henrique Fernando", 43, 'M', "AIK Enterprises"));
		pessoas.add(new Pessoa("Inácio Luis", 33 ,'M', "Magazine André"));
		pessoas.add(new Pessoa("Fernando Ferreira", 87, 'M', "Casas Recife"));
		
		System.out.println("A:");
		System.out.println(pessoas.get(new Random().nextInt(4)));
		
		Collections.sort(pessoas);
		System.out.println("B:");
		System.out.println(pessoas);
		
		Collections.sort(pessoas, new InverteOrdemAlfabetica());
		System.out.println("C:");
		System.out.println(pessoas);
	}
}
