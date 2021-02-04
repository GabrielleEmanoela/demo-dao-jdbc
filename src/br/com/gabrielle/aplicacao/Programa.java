package br.com.gabrielle.aplicacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import br.com.gabrielle.db.DB;
import br.com.gabrielle.db.DbExcecao;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Connection conn = null;
		Statement st = null;

		try {
			conn= DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();

			int linhas1 = st.executeUpdate("UPDATE cliente SET ultimacompra = 100  WHERE idade = 0 ");
			// int x = 1;
			//// if (x < 2) {
			// throw new SQLException("ERRO");
			// }
			int linhas2 = st.executeUpdate("UPDATE cliente SET ultimacompra = 30  WHERE idade = 30 ");
			conn.commit();
			System.out.println("Linha 1" + linhas1);
			System.out.println("Linha 2" + linhas2);

		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbExcecao(e.getMessage());
			} catch (SQLException e1) {
				throw new DbExcecao(e1.getMessage());

			}
		} finally {

			DB.closeConnection();
			DB.fecharDeclaracao(st);
		}

	}
}