package pucrs.java.br.animais.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PeixeTest {
	Peixe peixe;

	@Before
	public void setup() {
		peixe = new Peixe("Dory", 5, Animal.Genero.FEMININO);
	}

	@Test
	public void deveTestarSeUmPeixeFoiCriado() {
		assertEquals("Dory", peixe.getNome());
		assertEquals(5, peixe.getIdade());
		assertEquals(Animal.Genero.FEMININO, peixe.getSexo());
	}

	@Test
	public void deveTestarUmGlub() {
		peixe.glub();

		assertEquals("Dory Glub!", peixe.glub());
	}

}
