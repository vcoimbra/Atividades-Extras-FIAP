package br.com.fiap.Trabalho4.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {

		List<String> mensagens = new ArrayList<>();
		Relogio relogio = new Relogio();
		Mensagem mensagem;
		
		mensagens.add("Mensagem1");
		mensagens.add("Mensagem2");
		mensagens.add("Mensagem3");
		mensagens.add("Mensagem4");
		mensagens.add("Mensagem5");
		
		mensagem = new Mensagem(mensagens);
		
		mensagem.setName("Thread Mensagem");
		relogio.setName("Thread Relogio");
		mensagem.start();
		relogio.start();
		
		while(true){
			try{
				verificarEstadoThread(mensagem);
				verificarEstadoThread(relogio);
				Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void verificarEstadoThread(Thread t){
		if (!t.isAlive()){
			System.out.println(t.getName() + " morreu!");
		}else if(t.isInterrupted()){
			System.out.println(t.getName() + " esta interrompida!");
		}else{
			System.out.println(t.getName() + " esta executando!");
		}
	}
}
