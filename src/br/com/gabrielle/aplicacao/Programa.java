package br.com.gabrielle.aplicacao;


import java.util.Date;


import br.com.gabrielle.modelo.entidades.Departamento;
import br.com.gabrielle.modelo.entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {


		Departamento obj = new Departamento(1, "Books");

		System.out.println(obj);
		Funcionario funcionario = new Funcionario(21, "Bob", "gabi@gmail.com", new Date(), 3500, obj);

		System.out.println(funcionario);

	}
}
