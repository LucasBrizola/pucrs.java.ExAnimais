package pucrs.java.br.animais;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pucrs.java.br.animais.domain.Gato;

public class GatosAppTest {

	@Test
	public void testarCriacaoDeGato() {
		Gato gato = new Gato("Bandida",2, "feminino", "miau");
		
		assertEquals("Bandida", gato.getNome());
		assertEquals(2, gato.getIdade());
		assertEquals("feminino", gato.getSexo());
		assertEquals("miau", gato.getBarulho());
	}
}
