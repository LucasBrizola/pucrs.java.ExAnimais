package pucrs.java.br.animais;

import pucrs.java.br.animais.domain.Gato;

/**
 * Hello world!
 *
 */
public class GatosApp {
	public static void main(String[] args) {
		GatoCatalogo gatos = new GatoCatalogo();

		gatos.add(new Gato("Bandida", 2, "feminino"));
		gatos.add(new Gato("Tigrinha", 2, "feminino"));
		gatos.add(new Gato("Aladdin", 2, "masculino"));

		gatos.miaus();
	}
}
