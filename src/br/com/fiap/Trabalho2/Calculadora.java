package br.com.fiap.Trabalho2;

public class Calculadora implements CalculadoraBasica {

	@Override
	public float somar(float op1, float op2) throws NumberFormatException{
		verificarIntegridadeNumero(op1,op2);
		return op1 + op2;
	}

	@Override
	public float subtrair(float op1, float op2) throws NumberFormatException{
		verificarIntegridadeNumero(op1,op2);
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2) throws NumberFormatException{
		verificarIntegridadeNumero(op1,op2);
		return op1/op2;
	}

	@Override
	public float multiplicar(float op1, float op2) throws NumberFormatException{
		verificarIntegridadeNumero(op1,op2);
		return op1*op2;
	}
	
	public void verificarIntegridadeNumero(float op1, float op2){
		if (op1 == 0 || op1 == 1 || op2 == 0 || op2 == 1){
			throw new NumberFormatException();
		}
	}
}
