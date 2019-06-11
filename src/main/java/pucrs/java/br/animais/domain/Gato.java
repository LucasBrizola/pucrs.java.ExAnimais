package pucrs.java.br.animais.domain;

public class Gato {

	private String nome;
	private int idade;
	private String sexo;
	private String barulho;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = getSexo();
	}

	public String getBarulho() {
		return barulho;
	}

	public void setBarulho(String barulho) {
		this.barulho = barulho;
	}

	public Gato(String nome, int idade, String sexo, String barulho) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.barulho = barulho;
	}

}
