package pucrs.java.br.animais.domain;

import java.util.ArrayList;
import java.util.List;

public class AnimalCatalogo {
	
	private List<Animal> animais= new ArrayList<Animal>();


	public void add(Animal animal) {
		animais.add(animal);
	}
	
	public void falarem() {
		for (Animal animal : animais) {
			System.out.println(animal.falar());
		}
	}

	public int getAnimaisSize() {
		return animais.size();
	}

	
}
