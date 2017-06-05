package br.com.fiap.Trabalho3;

import java.util.Comparator;

public class InverteOrdemAlfabetica implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return -pessoa.compareTo(outraPessoa);
	}
}
