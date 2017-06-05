package br.com.fiap.Trabalho4.Exercicio3;

public enum Cores {
	
	BRANCO("Branco",21),
	PRETO("Preto", 22),
	VERMELHO("Vermelho", 23),
	AMARELO("Amarelo", 24),
	AZUL("Azul", 25);
	
	
	private String nomeCor;
	private Integer codigoCor;
	
	
	private Cores(String nomeCor, Integer codigoCor){
		this.nomeCor = nomeCor;
		this.codigoCor = codigoCor;
	}
	
	public String recuperarNomeCor(){
		return nomeCor;
	}
	
	public Integer recuperarCodigoCor(){
		return codigoCor;
	}

}
