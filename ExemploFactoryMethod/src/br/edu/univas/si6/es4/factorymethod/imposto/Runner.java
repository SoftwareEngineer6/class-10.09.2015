package br.edu.univas.si6.es4.factorymethod.imposto;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Horista horista = new Horista();
		horista.setNome("José");
		horista.setQuantidadeHoras(20);
		horista.setValorHora(100);
		funcionarios.add(horista);
		
		Mensalista mensalista = new Mensalista();
		mensalista.setNome("Maria");
		mensalista.setSalarioMensal(1600);
		mensalista.setHorasExtras(20);
		funcionarios.add(mensalista);
		
		apresentarFuncionarios(funcionarios);
	}

	private static void apresentarFuncionarios(List<Funcionario> funcionarios) {
		for(Funcionario funcionario: funcionarios) {
			String nome = funcionario.getNome();
			double salarioBruto = funcionario.salarioBruto();
			String message = "Nome: " + nome
					+ " - Salario bruto: " + salarioBruto;
			System.out.println(message);
		}
	}

}
