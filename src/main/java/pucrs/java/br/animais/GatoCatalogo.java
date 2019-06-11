package pucrs.java.br.animais;

import java.util.ArrayList;
import java.util.List;

/**
 * author: Lucas Brizola
 */
import pucrs.java.br.animais.domain.Gato;

public class GatoCatalogo {
	
	private List<Gato> gatos = new ArrayList<Gato>();


	public void add(Gato gato) {
		gatos.add(gato);
	}

	public void miaus() {
		for (Gato gato : gatos) {
			System.out.println(gato.miau());
		}
	}

	public int getSize() {
		return gatos.size();
	}
	
}
