package pucrs.java.br.animais.domain;

import java.util.Enumeration;

public class Gato {

	private String nome;
	private int idade;
	private Enumeration<Sexo>;
	private int patas;
	private boolean asas;
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	private String barulho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isAsas() {
		return asas;
	}

	public void setAsas(boolean asas) {
		this.asas = asas;
	}

	public String getBarulho() {
		return barulho;
	}

	public void setBarulho(String barulho) {
		this.barulho = barulho;
	}

	public Gato(String nome, int idade, int patas, boolean asas, String barulho) {
		this.nome = nome;
		this.idade = idade;
		this.patas = patas;
		this.asas = asas;
		this.barulho = barulho;
	}

}
