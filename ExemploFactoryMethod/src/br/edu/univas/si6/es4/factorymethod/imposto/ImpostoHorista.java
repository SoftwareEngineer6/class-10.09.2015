package br.edu.univas.si6.es4.factorymethod.imposto;

public class ImpostoHorista implements CalculadorImposto{

	private double valorHora;
	private int quantidadeHoras;

	public ImpostoHorista(double valorHora, int quantidadeHoras) {
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
	}
	
	@Override
	public double calcularImposto() {
		return (valorHora * quantidadeHoras) * .2;
	}

}
