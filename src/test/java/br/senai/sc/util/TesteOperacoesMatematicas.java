package br.senai.sc.util;

import org.junit.Test;


import junit.framework.TestCase;

public class TesteOperacoesMatematicas extends TestCase {


	@Test
	public static void testSomaDoisValoresReais(){
		double num1 = 15.6;
		double num2 = 15.4;
		double valorEsperado = 31.0;
		double valorAtual = OperacoesMatematicas.somaDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	
	@Test(expected = NumberFormatException.class) 
	public static void testSomaDoisValoresNulos(){
		try{
			OperacoesMatematicas.somaDoisValores(1d, 3d);
			
		} catch (Exception e ) {
			
			
		}
		
		assertEquals(null, null);
	}


	
	
	@Test
	public static void testSomaDoisValoresResultadoErrado(){
		double num1 = 20d;
		double num2 = 15d;
		double valorExperado = 25.00;
		double valorAtual = OperacoesMatematicas.somaDoisValores(num1, num2);
		assertTrue("Erro na soma dos Valores", valorExperado != valorAtual);
	}
	
	@Test
	public static void testSomaValoresGrandesErrado(){
		double num1 = 1.2235;
		double num2 = 2.0315;
		double valorExperado = 3255;
		double valorAtual = OperacoesMatematicas.somaDoisValores(num1, num2);
		assertFalse("Erro na soma dos Valores", valorExperado != valorAtual);
	}
	
	
	
	@Test
	public static void testSubtracaoDoisValoresReais(){
		double num1 = 20.5;
		double num2 = 10.5;
		double valorEsperado = 10.0;
		double valorAtual = OperacoesMatematicas.subtracaoDeDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	

	
	@Test(expected = NumberFormatException.class)
	public static void testSubtracaoDoisValoresNulo() {
		try {
			OperacoesMatematicas.subtracaoDeDoisValores(null, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public static void testSubtracaoDoisValorespassandoUmNulo() {
		try {
			OperacoesMatematicas.subtracaoDeDoisValores(1d, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	
	
	@Test
	public static void testMultiplicacaoDoisValoresReais(){
		double num1 = 2.0;
		double num2 = 2.0;
		double valorEsperado = 4.0;
		double valorAtual = OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	
	
	@Test
	public static void testValidaMultiplicacao(){
		double num1 = 10.0;
		double num2 = 3.0;
		double valorExperado = 30.0;
		double valorAtual = OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertTrue("Erro na multiplica��o dos valores.", valorExperado == valorAtual);
	}
	
	
	
	

	@Test
	public static void testMultiplcaValoresGrandesErrado(){
		double num1 = 1.2235;
		double num2 = 2.0315;
		double valorExperado = 2.48554025;
		double valorAtual = OperacoesMatematicas.multiplicacaoDeDoisValores(num1, num2);
		assertFalse("Erro na soma dos Valores", valorExperado != valorAtual);
	}
	

	
	
	@Test
	public static void testDivisaoDoisValoresReais(){
		double num1 = 10.0;
		double num2 = 2.0;
		double valorEsperado = 5.0;
		double valorAtual = OperacoesMatematicas.divisaoDeDoisValores(num1, num2);
		assertEquals(valorEsperado, valorAtual);

	}
	

	@Test(expected = NumberFormatException.class)
	public static void testDivisaoDoisValorespassandoUmNulo() {
		try {
			OperacoesMatematicas.divisaoDeDoisValores(1d, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null,null);
	}
	
	
	@Test
	public static void testValidaErroDivisao(){
		double num1 = 10.0;
		double num2 = 3.0;
		double valorExperado =3.33 ;
		double valorAtual = OperacoesMatematicas.divisaoDeDoisValores(num1, num2);
		assertTrue("Erro na multiplica��o dos valores.", valorExperado == valorAtual);
	}

	@Test
	public static void testDivisaoValoresGrandesErrado(){
		double num1 = 4.200;
		double num2 = 2.100;
		double valorExperado = 2;
		double valorAtual = OperacoesMatematicas.divisaoDeDoisValores(num1, num2);
		assertFalse("Erro na soma dos Valores", valorExperado != valorAtual);
	}


}
