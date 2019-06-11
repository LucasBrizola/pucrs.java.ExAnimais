package pucrs.java.br.animais;

import org.junit.Assert;

import org.junit.Test;

import pucrs.java.br.animais.domain.Gato;

public class GatoCatalogoTest {

	@Test
	public void deveCriarGatoCatalogo() {
		GatoCatalogo gatos = new GatoCatalogo();
		Assert.assertNotNull(gatos);
	}

	@Test
	public void deveAdicionarUmGatoAoCatalogo() {
		GatoCatalogo gatos = new GatoCatalogo();
		gatos.add(new Gato("Bandida", 2, "feminino"));
		gatos.add(new Gato("Tigrinha", 2, "feminino"));

		Assert.assertTrue(gatos.getSize() == 2);
	}

}
