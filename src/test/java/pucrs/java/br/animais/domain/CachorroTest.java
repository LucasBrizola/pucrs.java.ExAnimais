package pucrs.java.br.animais.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pucrs.java.br.animais.domain.Animal;
import pucrs.java.br.animais.domain.Cachorro;

public class CachorroTest {
	Cachorro cachorro;
	
	@Before
	public void setup() {
	cachorro = new Cachorro("Doce", 15, Animal.Genero.FEMININO);
	}
	
	@Test
	public void testarCriacaoDeGato() {
			
		assertEquals("Doce", cachorro.getNome());
		assertEquals(15, cachorro.getIdade());
		assertEquals(Animal.Genero.FEMININO, cachorro.getSexo());
	}
	
	@Test
	public void deveTestarLatidoDoCachorro() {
		assertEquals("Doce Au au!", cachorro.latir());
	}	
}
