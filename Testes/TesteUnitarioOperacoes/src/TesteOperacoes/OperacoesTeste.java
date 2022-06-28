package TesteOperacoes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperacoesTeste {
	
	Operacoes op1, op2;
	@Before
	public void setUp() throws Exception {
		op1 = new Operacoes();
		op2 = new Operacoes();
	}

	@Test
	public void deveriaTestarMaiorValor() {
		assertEquals("CASO 1: ", 16, op1.maiorValor(16,9),0);
		assertEquals("CASO 2: ", 17, op1.maiorValor(16,9),0);
		assertEquals("CASO 3: ", 15, op1.maiorValor(16,9),0);
		
		assertEquals("CASO 1: ", 16, op2.maiorValor(16,9),0);
		assertEquals("CASO 2: ", 17, op2.maiorValor(16,9),0);
		assertEquals("CASO 3: ", 15, op2.maiorValor(16,9),0);
	}

	@Test
	public void deveriaTestarMenorValor() {
		assertTrue("CASO 4: ", 16 == op1.menorValor(16,9));
		assertTrue("CASO 5: ", 9 == op1.menorValor(16,9));
		
		assertTrue("CASO 4: ", 16 == op2.menorValor(16,9));
		assertTrue("CASO 5: ", 9 == op2.menorValor(16,9));

	}

	@Test
	public void deveriaCompararDoisObjetos() {
		assertSame("CASO 6", "Passar o objeto adequado", "Passar o objeto adequado");
		assertNotSame("CASO 7", "Passar o objeto adequado", "Passar o objeto adequado");
	}
	
	@Test
	public void deveriaTestarRaizQuadrada() {
		assertEquals("CASO 8: ", 9.380, op1.raizQuadrada(88), 88);
		assertEquals("CASO 8: ", 9.380, op2.raizQuadrada(88), 88);
	}

	@Test
	public void deveriaTestarDivide() {
		assertEquals("CASO 9: ", 25, op1.divide(50,2), 25);
		assertEquals("CASO 10: ", 0, op1.divide(50,0),0);
		assertEquals("CASO 11: ", 0, op1.divide(0,0),0);
		
		assertEquals("CASO 9: ", 25, op2.divide(50,2), 25);
		assertEquals("CASO 10: ", 0, op2.divide(50,0),0);
		assertEquals("CASO 11: ", 0, op2.divide(0,0),0);
		throw new AssertionError();
	}

	@Test
	public void deveriaTestarProduto() {
		assertEquals("CASO 12: ", 1000000000, op1.divide(1000000000,1000000000),0);
		assertEquals("CASO 12: ", 1000000000, op2.divide(1000000000,1000000000),0);
		throw new AssertionError();
	}

	@Test
	public void deveriaTestarSoma() {
		assertEquals("CASO 13: ", 20, op1.divide(10,10),0);
		assertFalse("CASO 14: ", 21 == op1.menorValor(10,10));
		assertTrue("CASO 15: ", 20 == op1.menorValor(10,10));
		
		assertEquals("CASO 13: ", 20, op2.divide(10,10),0);
		assertFalse("CASO 14: ", 21 == op2.menorValor(10,10));
		assertTrue("CASO 15: ", 20 == op2.menorValor(10,10));
	}

	@Test
	public void deveriaTestarAcumulador() {
		fail("Not yet implemented");
	}

}
