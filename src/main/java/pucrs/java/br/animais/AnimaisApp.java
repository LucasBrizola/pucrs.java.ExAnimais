package pucrs.java.br.animais;

import pucrs.java.br.animais.domain.Gato;
import pucrs.java.br.animais.domain.Peixe;
import pucrs.java.br.animais.domain.Animal;
import pucrs.java.br.animais.domain.AnimalCatalogo;
import pucrs.java.br.animais.domain.Cachorro;

public class AnimaisApp {
	public static void main(String[] args) {
		AnimalCatalogo animais = new AnimalCatalogo();

		animais.add(new Gato("Bandida", 2, Animal.Genero.FEMININO));
		animais.add(new Gato("Tigrinha", 2, Animal.Genero.FEMININO));
		animais.add(new Gato("Aladdin", 2, Animal.Genero.MASCULINO));

		animais.add(new Cachorro("Doce", 15, Animal.Genero.FEMININO));
		animais.add(new Cachorro("Maya", 7, Animal.Genero.FEMININO));
		animais.add(new Cachorro("Rex", 2, Animal.Genero.MASCULINO));
		
		animais.add(new Peixe("Dory", 5, Animal.Genero.FEMININO));

		animais.falarem();
	}
}
