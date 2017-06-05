package br.com.fiap.Trabalho4.Exercicio2;


public class Aviao extends Thread {

	private String nomeVoo;
	private Aeroporto aeroporto;

	public Aviao(String nomeVoo, Aeroporto aeroporto) {
		this.nomeVoo = nomeVoo;
		this.aeroporto = aeroporto;
	}

	public void decolar() {
		try {
			while (!aeroporto.aguardarPistaDisponivel()) {
				System.out.println("Avi�o " + nomeVoo + ": Aguardando para decolar...");				
			}
			// alterando o estado da pista pois esse avi�o esta ocupando ela...
			aeroporto.alterarEstadoPista();
			System.out.println("Avi�o " + nomeVoo + ": Decolando!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void voar() {
		try {
			System.out.println("Avi�o " + nomeVoo + ": Estou voando!!!");
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void aterrissar() {
		try {
			while (!aeroporto.aguardarPistaDisponivel()) {
				System.out.println("Avi�o " + nomeVoo + ": Aguardando para pousar...");
			}
			// alterando o estado da pista pois esse avi�o esta ocupando ela...
			aeroporto.alterarEstadoPista();
			System.out.println("Avi�o " + nomeVoo + ": Pousando!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		decolar();
		voar();
		aterrissar();
	}
}
