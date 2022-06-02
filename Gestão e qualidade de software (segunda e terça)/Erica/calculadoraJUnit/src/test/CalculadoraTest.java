package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculadora;

class CalculadoraTest {

	@Test
	void testaSoma() {
		assertEquals(2, Calculadora.soma(1, 1));
	}

	@Test
	void testSubtracao() {
		assertEquals(0, Calculadora.subtracao(1, 1));
	}

	@Test
	void testDivisao() {
		assertEquals(1, Calculadora.divisao(2, 2));
	}

	@Test
	void testMultiplicacao() {
		assertEquals(4, Calculadora.multiplicacao(2, 2));
	}

}
