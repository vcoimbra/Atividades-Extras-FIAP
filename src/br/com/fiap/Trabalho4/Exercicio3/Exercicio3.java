package br.com.fiap.Trabalho4.Exercicio3;

public class Exercicio3 {

	public static void main(String[] args) {

		for (Cores cor : Cores.values()){
			System.out.println("Nome Cor: " + cor.recuperarNomeCor() + " Codigo Cor: " + cor.recuperarCodigoCor());
		}
		
		System.out.println(Cores.BRANCO.recuperarNomeCor());
	}
}
