package br.com.fiap.Trabalho4.Exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Relogio extends Thread {

	@Override
	public void run() {
		try {
			while (true) {
				DateTimeFormatter formatter;
				LocalDateTime data = LocalDateTime.now();
				formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
				System.out.println("Hora: " + data.format(formatter));
				sleep(10000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
