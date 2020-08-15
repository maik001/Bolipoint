package Controle;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {	
	private Connection con;
	public Conexao() {
		try{
			String host = "localhost";
			String user = "root";
			String pwd = "123456";
			String bd = "BoliPoint";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.setCon(DriverManager.getConnection("jdbc:mysql://"+host+"/"+bd,user,pwd));
			System.out.println("Ocorreu tudo bem");
		}catch(SQLException e){
			System.out.println("Erro no sql:"+e.getMessage());	
			
		}catch(Exception e ) {
			System.out.println("Erro geral:"+e.getMessage());
			
		}
		
		
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public void fecharConexao() {
		try {
			this.getCon().close();
		}catch(SQLException e){
			System.out.println("Erro no sql:"+e.getMessage());	
			
		}catch(Exception e ) {
			System.out.println("Erro geral:"+e.getMessage());
			
		}
			
		}
		
	}

