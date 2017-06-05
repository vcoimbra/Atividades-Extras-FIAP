package br.com.fiap.Trabalho3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {

		String mensagem;
		String mensagemCriptografada;
		String mensagemDecriptografada;
		StringBuilder builder = new StringBuilder();
		int aux;

		mensagem = JOptionPane.showInputDialog(null, "Escreva uma frase", "Criptografia", JOptionPane.PLAIN_MESSAGE);
		builder.append(mensagem);

		// Criptografa
		for (int i = 0; i < builder.length(); i++) {
			aux = (int) builder.charAt(i);
			if (aux == 127) {
				aux = 0;
			} else {
				aux++;
			}
			builder.setCharAt(i, (char) aux);
		}
		mensagemCriptografada = builder.toString();

		try {
			FileWriter fw = new FileWriter("mensagemCodificada.txt");
			PrintWriter out = new PrintWriter(fw);
			out.print(mensagemCriptografada);
			System.out.println(mensagemCriptografada);
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < builder.length(); i++) {
			aux = (int) builder.charAt(i);
			if (aux == 0) {
				aux = 127;
			} else {
				aux--;
			}
			builder.setCharAt(i, (char) aux);
		}
		mensagemDecriptografada = builder.toString();
		

		try {
			FileWriter fw = new FileWriter("mesagemDecodificada.txt");
			PrintWriter out = new PrintWriter(fw);
			out.print(mensagemDecriptografada);
			System.out.println(mensagemDecriptografada);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
