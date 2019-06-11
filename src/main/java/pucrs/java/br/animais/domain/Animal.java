package pucrs.java.br.animais.domain;

public abstract class Animal {
	private String nome;
	private int idade;
	private Genero sexo;

	public enum Genero {MASCULINO, FEMININO};

	public Animal(String nome, int idade, Genero sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public Genero getSexo() {
		return sexo;
	}

	public abstract String falar();
}
