package br.com.gabrielle.aplicacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import br.com.gabrielle.db.DB;
import br.com.gabrielle.db.DbExcecao;

public class Programa {

	public static void main(String[] args) throws ParseException {

		br.com.gabrielle.modelo.entidades.Departamento obj = new br.com.gabrielle.modelo.entidades.Departamento(1, "Books");

		System.out.println(obj);

	}
}