package br.com.gabrielle.aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import br.com.gabrielle.db.DB;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Connection conn = null;
		PreparedStatement st = null;

		try {

			conn = DB.getConnection();
			/*
			 * st = conn.prepareStatement(
			 * 
			 * "INSERT INTO cliente " + "(nome, idade, endereco)" + "VALUES" + "(?,?,?)",
			 * Statement.RETURN_GENERATED_KEYS
			 * 
			 * ); st.setString(1, "Gabrielle"); st.setInt(2, 555); st.setString(3,
			 * "Av Planalto Jardim bela vista");
			 */

			st = conn.prepareStatement("insert into cliente (nome) values('Gabrielle'),('Silva')",
					Statement.RETURN_GENERATED_KEYS);
			int rowsAffected = st.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Pronto Id= " + id);

				}
			} else {
				System.out.println("Nennhuma linha foi alterada");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.fecharDeclaracao(st);
			DB.closeConnection();
		}

	}
}