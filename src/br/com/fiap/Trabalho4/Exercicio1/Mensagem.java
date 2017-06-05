package br.com.fiap.Trabalho4.Exercicio1;

import java.util.List;

public class Mensagem extends Thread {

	List<String> mensagens;
	
	public Mensagem(List<String> mensagens){
		this.mensagens = mensagens;
	}
	
	@Override
	public void run() {
		try{
		for (String string : mensagens) {
			System.out.println(string);
			sleep(20000);
		}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
