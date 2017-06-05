package br.com.fiap.Trabalho4.Exercicio2;

public class Aeroporto extends Thread {

	private String nome;
	private boolean pistaDisponivel;

	public Aeroporto(String nome) {
		this.nome = nome;
		// inicializando a variavel pistaDisponivel como 'false'
		// eu forco a chamado do run()
		pistaDisponivel = false;
	}

	public synchronized boolean aguardarPistaDisponivel() throws InterruptedException {
		while (!pistaDisponivel) {
			wait();
		}
		return pistaDisponivel;
	}

	public synchronized void alterarEstadoPista() {
		try {
			sleep(3000);
			pistaDisponivel = !pistaDisponivel;
			System.out.println("Pista Liberada para voo");
			notifyAll();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			alterarEstadoPista();
			System.out.println("Alterando o Estado da pista");
		}
	}
}
