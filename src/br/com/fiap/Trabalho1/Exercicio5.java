package br.com.fiap.Trabalho1;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Integer numero = 0;
		String numeroaux = null;
		Integer fatorial = 1;
		
		while (numeroaux == null){
			numeroaux = JOptionPane.showInputDialog(null,"Informe um número","Fatorial", JOptionPane.PLAIN_MESSAGE);
			if (numeroaux == null || numeroaux.trim().equals("")){
				JOptionPane.showMessageDialog(null,"Informe um número","Erro",JOptionPane.ERROR_MESSAGE);
				numeroaux = null;
				continue;
			}else{
				try{
					numero = Integer.valueOf(numeroaux);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Informe um número","Erro",JOptionPane.ERROR_MESSAGE);
					numeroaux = null;
					continue;
				}
			}
		}		
		for (; numero > 0; numero--) {
			fatorial *= numero;
		}		
		JOptionPane.showMessageDialog(null,"Fatorial é: " + fatorial,"Fatorial",JOptionPane.INFORMATION_MESSAGE);		
	}
}
