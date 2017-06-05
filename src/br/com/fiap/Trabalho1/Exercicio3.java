package br.com.fiap.Trabalho1;

import javax.swing.JOptionPane;

public class Exercicio3 {	
	public static void main(String[] args) {

		Integer qtdFuncionarios = 0;
		String qtdFuncionariosaux = null;
		Double[] salarios;
		Double salario = 0.0;
		String salarioaux;
		Double media;
		Double soma = 0.0;

		while (qtdFuncionariosaux == null){
			qtdFuncionariosaux = JOptionPane.showInputDialog(null,"Informe a quantidade de funcionários",
					"Folha de Pagamento", JOptionPane.PLAIN_MESSAGE);
			if (qtdFuncionariosaux == null || qtdFuncionariosaux.trim().equals("")){
				JOptionPane.showMessageDialog(null,"Informe um número","Erro",JOptionPane.ERROR_MESSAGE);
				qtdFuncionariosaux = null;
				continue;
			}else{
				try{
					qtdFuncionarios = Integer.valueOf(qtdFuncionariosaux);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Informe um número","Erro",JOptionPane.ERROR_MESSAGE);
					qtdFuncionariosaux = null;
					continue;
				}
			}
		}		
		salarios = new Double[qtdFuncionarios];
		
		for (int i = 0; i < salarios.length;){
			salarioaux = JOptionPane.showInputDialog(null,"Informe o salário dos Funcionários",
					"Folha de Pagamento", JOptionPane.PLAIN_MESSAGE);
			if (salarioaux == null || salarioaux.trim().equals("")){
				JOptionPane.showMessageDialog(null,"Informe um salário","Erro",JOptionPane.ERROR_MESSAGE);
				continue;
			}else{
				try{
					salario = Double.valueOf(salarioaux);
					salarios[i] = salario;
					soma += salario;
					i++;
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Informe o salário","Erro",JOptionPane.ERROR_MESSAGE);
					salarioaux = null;
					continue;
				}
			}
		}		
		media = soma/qtdFuncionarios;
		JOptionPane.showMessageDialog(null,"Media do salario: " + media,"Folha de Pagamento",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
