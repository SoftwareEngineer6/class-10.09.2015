package br.edu.univas.si6.es4.factorymethod.imposto;

public class ImpostoMensalista implements CalculadorImposto{

	private double salarioMensal;

	public ImpostoMensalista(double salarioMensal, int horasExtras) {
		this.salarioMensal = salarioMensal;
	}
	
	@Override
	public double calcularImposto() {
		return salarioMensal * .2;
	}

}
