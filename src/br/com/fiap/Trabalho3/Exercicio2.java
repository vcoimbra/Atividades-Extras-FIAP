package br.com.fiap.Trabalho3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {

	public static void main(String[] args) {

		DateTimeFormatter formatter;
		LocalDateTime data = LocalDateTime.of(2012, 9, 10, 12, 0);
		
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");		
		System.out.println("A: " + data.format(formatter));
		formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		System.out.println("B: " + data.format(formatter));
		formatter = DateTimeFormatter.ofPattern("E");
		System.out.println("C: " + data.format(formatter));
		formatter = DateTimeFormatter.ofPattern("u");
		System.out.println("D: " + data.format(formatter));
		formatter = DateTimeFormatter.ofPattern("G");
		System.out.println("E: " + data.format(formatter));
	}
}
