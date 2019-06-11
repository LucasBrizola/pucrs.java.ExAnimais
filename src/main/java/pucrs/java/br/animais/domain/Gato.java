package pucrs.java.br.animais.domain;

public class Gato extends Animal {

	public Gato(String nome, int idade, Animal.Genero sexo) {
		super(nome, idade, sexo);
	}

	public String miau() {
		return getNome() + " " + "Miau!";
	}

	@Override
	public String falar() {
		return miau();
	}

}
