package br.com.gabrielle.aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;

import br.com.gabrielle.db.DB;
import br.com.gabrielle.db.DbIntegrityException;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			st = conn.prepareStatement("DELETE FROM cliente " + "WHERE " // comando de restricao
					+ "ultimacompra = ?");

			st.setDouble(1, 0);

			int rowsAffected = st.executeUpdate();
			System.out.println("Pronto! linhas afetadas " + rowsAffected);

		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {

			DB.closeConnection();
			DB.fecharDeclaracao(st);
		}

	}
}