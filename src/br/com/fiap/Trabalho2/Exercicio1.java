package br.com.fiap.Trabalho2;

import javax.swing.JOptionPane;

public class Exercicio1{

	public static void main(String[] args) {
		
		Float op1;
		Float op2;
				
		Calculadora calculadora = new Calculadora();
		
		op1 = solicitarNumero();
		op2 = solicitarNumero();
		try{
		
		System.out.println("Resultado soma: " + calculadora.somar(op1,op2));
		System.out.println("Resultado subtracação: " + calculadora.subtrair(op1,op2));
		System.out.println("Resultado divisão: " + calculadora.dividir(op1,op2));
		System.out.println("Resultado multiplicação: " + calculadora.multiplicar(op1,op2));
		}catch (NumberFormatException e){
			System.out.println("Informe um numero diferente de zero e um");
		}
		
	}
	
	public static Float solicitarNumero(){
		Float operador = 0F;
		String operadorAux = null;
		
		while (operadorAux == null){
			operadorAux = JOptionPane.showInputDialog(null,"Informe um número","Calculadora", JOptionPane.PLAIN_MESSAGE);
			if (operadorAux == null || operadorAux.trim().equals("")){
				JOptionPane.showMessageDialog(null,"Informe um número","Erro",JOptionPane.ERROR_MESSAGE);
				operadorAux = null;
				continue;
			}else{
				try{
					operador = Float.valueOf(operadorAux);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Informe um número","Erro",JOptionPane.ERROR_MESSAGE);
					operadorAux = null;
					continue;
				}
			}
		}
		return operador;		
	}
}
