package br.com.gabrielle.aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import br.com.gabrielle.db.DB;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("UPDATE cliente " + "SET idade = idade + ? " // Selecionando
					+ "WHERE " // Restrição na atualização
					+ "(ultimacompra = ?)");

			st.setDouble(1, 5);
			st.setInt(2, 10);

			int rowsAffected = st.executeUpdate();
			System.out.println("Pronto! linhas afetadas " + rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			DB.closeConnection();
			DB.fecharDeclaracao(st);
		}

	}
}