package br.com.fiap.Trabalho2;

public class Movel implements EquipamentoEletronico {

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void desligar() {
		System.out.println("Ligar");
	}

	public void ligar() {
		System.out.println("Desligar");
	}
}
