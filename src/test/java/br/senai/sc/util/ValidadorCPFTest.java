package br.senai.sc.util;

import org.junit.Test;

import junit.framework.TestCase;

public class ValidadorCPFTest extends TestCase {
	@Test
	public static void testRetirarCaracteresInvalidos(){
		String cpfParaValidar="657.218.908-27";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("65721890827",cpfApenasNumeros );
		
		
	}
	
	@Test
	public static void testRetirarCaracteresInvalidosComPonto(){
		String cpfParaValidar="657.218.90827";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("65721890827",cpfApenasNumeros );
		
		
	}
	
	@Test
	public static void testRetirarCaracteresInvalidosComLetras(){
		String cpfParaValidar="657.JHuass218.908-27";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("65721890827",cpfApenasNumeros );
		
		
	}
	
	@Test
	public static void testRetirarCaracteresInvalidosComSimbolosEspecias(){
		String cpfParaValidar="657218908#$27";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("65721890827",cpfApenasNumeros );
		
		
	}

	@Test
	public static void testIsCPFPadraoNumIguais(){
		String cpfParaValidar = "11111111111";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertFalse(digitos);
		
	}
	
	@Test
	public static void testIsCPFPadraoNulo(){
		String cpfParaValidar = " ";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertFalse(digitos);
	}
	
	@Test
	public static void testIsCPFPadraoMaisDeOnzeNum(){
		String cpfParaValidar = " 120556152013545";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertFalse(digitos);
	}
	
	@Test
	public static void testIsCPFPadraoComSimbolosEspecias(){
		String cpfParaValidar = " 1*25&5730215%%1";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertFalse(digitos);
		
	}
	
	@Test
	public static void testIsCPFPadraoTrue(){
		String cpfParaValidar = "210325413682 ";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue(digitos);
	}
	
	@Test
	public static void testIsCPFPadraoComPontos(){
		String cpfParaValidar = " 123.456.78911";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue(digitos);
	}	
	
	@Test
	public static void testIsCPFPadraoComLetras(){
		String cpfParaValidar = " 1234l567a89d11";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue(digitos);
	}	
	
	
	@Test
	public static void testIsCPFPadraoComCaracteresInvalidos(){
		String cpfParaValidar = " 657.218.908-27";
		boolean digitos = ValidadorCPF.validaCPF(cpfParaValidar);
		assertTrue(digitos);
	}	
	
	@Test
	 public static void  testCalculaDigitoVerificador11(){
		String cpfParaValidar = " 12035452873";
		String digitos = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
		assertEquals("11",digitos);
	
		
	}
	
	
}
