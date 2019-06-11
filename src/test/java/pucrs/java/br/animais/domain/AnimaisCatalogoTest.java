package pucrs.java.br.animais.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pucrs.java.br.animais.domain.AnimalCatalogo;
import pucrs.java.br.animais.domain.Animal;
import pucrs.java.br.animais.domain.Gato;
import pucrs.java.br.animais.domain.Cachorro;

public class AnimaisCatalogoTest {
	AnimalCatalogo animais;

	@Before
	public void setup() {
		animais = new AnimalCatalogo();
	}

	@Test
	public void deveCriarAnimalCatalogo() {
		Assert.assertNotNull(animais);
	}

	@Test
	public void deveAdicionarUmAnimalDeCadaTipoAoCatalogo() {

		animais.add(new Gato("Bandida", 2, Animal.Genero.FEMININO));
		animais.add(new Cachorro("Doce", 15, Animal.Genero.FEMININO));
		animais.add(new Peixe("Dory", 5, Animal.Genero.FEMININO));
		Assert.assertTrue(animais.getAnimaisSize() == 3);
	}

}
