package pucrs.java.br.animais.domain;

public enum Sexo {
	masculino("masculino"),
	feminino("feminino");

	public String sexo;

	Sexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}
}
