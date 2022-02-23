package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/**M�dulo de Conex�o**/
	//parametros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezobe=true&serverTimezone=UTC";
	private String user= "root";
	private String password= "Ussagui0637985";
	
	//m�todo de conex�o
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);//ler o driver do banco de dadoslinha 8
			con=DriverManager.getConnection(url, user, password);//caminho do BD user e senha
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return con;
	
	}

	//teste de conex�o
	
	public void testeConexao() {
		
		//sempre quando temos que se conectar com o BD usamos try catch
		try {
			Connection con = conectar();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
