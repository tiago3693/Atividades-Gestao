package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calculadora;

class CalculadoraTest {

	@Test
	void testaSoma() {
		assertEquals(2, Calculadora.calcular("1 + 1"));
	}

	@Test
	void testSubtracao() {
		assertEquals(0, Calculadora.calcular("1 - 1"));
	}

	@Test
	void testDivisao() {
		assertEquals(1, Calculadora.calcular("2 /  2"));
	}

	@Test
	void testMultiplicacao() {
		assertEquals(4, Calculadora.calcular(" 2 *     2"));
	}

}
