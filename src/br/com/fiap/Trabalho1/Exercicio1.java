package br.com.fiap.Trabalho1;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] array = {1,2,3};
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("N�meros do array: array[" + i + "]: " + array[i]);
		}
		
		for (int i = array.length -1; i >= 0; i--) {
			System.out.println("N�meros invertidos: array[" + i + "]: " + array[i]);			
		}
	}
}
