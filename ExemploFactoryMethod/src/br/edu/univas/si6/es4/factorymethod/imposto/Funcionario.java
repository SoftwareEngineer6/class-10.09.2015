package br.edu.univas.si6.es4.factorymethod.imposto;

public abstract class Funcionario {

	private String nome;

	public double salarioLiquido() {
		double impostos = getCalculadorImposto().calcularImposto();
		double sl = salarioBruto() - impostos;
		return sl;
	}
	
	protected abstract CalculadorImposto getCalculadorImposto();

	public abstract double salarioBruto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
