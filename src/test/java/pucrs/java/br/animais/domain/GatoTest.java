package pucrs.java.br.animais.domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pucrs.java.br.animais.domain.Gato;
import pucrs.java.br.animais.domain.Animal;

public class GatoTest {
	Gato gato;
	
	@Before
	public void setup() {
		gato = new Gato("Bandida", 2, Animal.Genero.FEMININO);
	}
	
	@Test
	public void testarCriacaoDeGato() {
		
		assertEquals("Bandida", gato.getNome());
		assertEquals(2, gato.getIdade());
		assertEquals(Animal.Genero.FEMININO, gato.getSexo());
	}

	@Test
	public void deveTestarMiadoDoGato() {
		assertEquals("Bandida Miau!", gato.miau());
	}
}
