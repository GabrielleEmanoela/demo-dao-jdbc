package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {

		if (conn == null) {
			try {
				Properties prop = carregarPropriedades();
				String url = prop.getProperty("dburl");
					conn = DriverManager.getConnection(url, prop);
			} catch (SQLException e) {
				throw new DbExcecao(e.getMessage());
			}
		}

		return conn;

	}

	public static void closeConnection() {

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbExcecao(e.getMessage());
			}
		}

	}

	private static Properties carregarPropriedades() {

		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties prop = new Properties();
			prop.load(fs);

			return prop;
		} catch (IOException e) {
			throw new DbExcecao(e.getMessage());

		}

	}
}
