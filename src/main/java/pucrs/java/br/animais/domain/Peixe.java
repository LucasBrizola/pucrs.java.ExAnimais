package pucrs.java.br.animais.domain;

public class Peixe extends Animal{
	
	
	
	public Peixe(String nome, int idade, Animal.Genero sexo) {
		super(nome, idade, sexo);
	}
	
	public String glub() {
		return getNome() + " " + "Glub!";
	}

	@Override
	public String falar() {
		return glub();
	}

}
