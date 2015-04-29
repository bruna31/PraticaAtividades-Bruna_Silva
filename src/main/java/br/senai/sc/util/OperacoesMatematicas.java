package br.senai.sc.util;

public class OperacoesMatematicas {


	public static double somaDoisValores(Double num1, Double num2){
		if(num1 != null && num2 != null){
			return num1 + num2;
		}
		
		throw new NumberFormatException("Voc� deve passar dois valores para o c�lculo.");
	}
	

	
	public static double subtracaoDeDoisValores(Double num1, Double num2){
		if(num1 != null && num2 != null){
			return num1 - num2;
		}
		throw new NumberFormatException("Voc� deve passar dois valores para o c�lculo.");
	}

	public static double multiplicacaoDeDoisValores(Double num1, Double num2){
		if(num1 != null && num2 != null){
			return num1 * num2;
		}
		throw new NumberFormatException("Voc� deve passar dois valores para o c�lculo.");
	}
	
	public static double divisaoDeDoisValores(Double num1, Double num2){
		if(num1 != null && num2 != null){
			return num1 / num2;
		}
		throw new NumberFormatException("Voc� deve passar dois valores para o c�lculo.");
	}


}
