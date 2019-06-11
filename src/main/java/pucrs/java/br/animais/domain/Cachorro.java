package pucrs.java.br.animais.domain;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, Animal.Genero sexo) {
		super(nome, idade, sexo);
	}

	public String latir() {
		return getNome() + " " + "Au au!";

	}

	@Override
	public String falar() {
		return latir();
	}

}
