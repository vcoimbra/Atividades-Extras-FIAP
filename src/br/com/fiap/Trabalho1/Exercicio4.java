package br.com.fiap.Trabalho1;

public class Exercicio4 {
	public static void main(String[] args) {	
		System.out.println(somar(20,98));
		System.out.println(somar(15,7.5));
		System.out.println(somar(2.5,10.7));
		System.out.println(subtrair(10,6));
		System.out.println(subtrair(9,2.5));
		System.out.println(subtrair(7.5,2));
		System.out.println(subtrair(87.6,7.6));
		System.out.println(multiplicar(10, 10));
		System.out.println(multiplicar(4,2.5));
		System.out.println(multiplicar(20.5,1.5));
		System.out.println(dividir(10,2));
		System.out.println(dividir(20,2.5));
		System.out.println(dividir(7.5, 1.5));
		System.out.println(dividir(9.99,3));		
	}
	
	public static Integer somar(Integer a, Integer b){
		return a+b;
	}
	
	public static Double somar(Integer a, Double b){
		return a+b;
	}
	
	public static Double somar(Double a, Double b){
		return a+b;
	}
	
	public static Integer subtrair (Integer a, Integer b){
		return a-b;
	}
	
	public static Double subtrair (Integer a, Double b){
		return a-b;
	}
	
	public static Double subtrair (Double a, Integer b){
		return a-b;
	}
	
	public static Double subtrair (Double a, Double b){
		return a-b;
	}
	
	public static Integer multiplicar(Integer a, Integer b){
		return a*b;
	}
	
	public static Double multiplicar(Integer a, Double b){
		return a*b;
	}
	
	public static Double multiplicar(Double a, Double b){
		return a*b;
	}
	
	public static Double dividir(Integer a, Integer b){
		Double ad = Double.parseDouble(a.toString());
		Double bd = Double.parseDouble(b.toString());
		return  ad/bd;
	}
	
	public static Double dividir(Integer a, Double b){
		Double ad = Double.parseDouble(a.toString());
		return ad/b;
	}
	
	public static Double dividir(Double a, Integer b){
		return a/b;
	}
	
	public static Double dividir(Double a, Double b){
		return a/b;
	}
}
