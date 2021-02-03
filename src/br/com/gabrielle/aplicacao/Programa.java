package br.com.gabrielle.aplicacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.gabrielle.db.DB;

public class Programa {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stt = null;
		ResultSet rs = null;
		try {

			conn = DB.getConnection();

			stt = conn.createStatement();
			rs = stt.executeQuery("select * from cliente");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("nome"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DB.fecharDeclaracao(stt);
			DB.fecharResultado(rs);
			DB.closeConnection();
		}
	}
}