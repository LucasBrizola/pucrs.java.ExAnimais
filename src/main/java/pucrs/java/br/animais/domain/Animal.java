package pucrs.java.br.animais.domain;

public abstract class Animal {
	private int patas;
	private boolean asas;
	private String barulho;
	
	abstract void printBarulho();

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

}
