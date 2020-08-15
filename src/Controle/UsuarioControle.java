package Controle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Modelo.Usuario;
import Modelo.finalResult;
import Modelo.Partida;
import Modelo.Jogador;
public class UsuarioControle {

	public Boolean selecionarNS(String u, String s) {
		boolean retorno = false;
			try {
				Conexao con = new Conexao();
				String sql = "SELECT user, senha FROM usuario WHERE user LIKE ? AND senha LIKE ?;";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				  ps.setString(1,"%"+u+"%");
				  ps.setString(2,"%"+s+"%");
				 
				if(ps.execute()) {
					ResultSet rs = ps.executeQuery();
					if(rs.next()) {
						String user = rs.getString("user");
						String senha = rs.getString("senha");


						if(user.equals(u) && senha.equals(s)) {
							retorno = true;
							return true;
						}else {
							return false;
						}
					}
				}
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
			}catch(Exception e) {
				System.out.println("Erro geral:"+e.getMessage());
				}
			return retorno;
	}
	
	public Usuario selecionarPorId(int id){
			try{
				Usuario us = null;
				Conexao con = new Conexao();	
				String sql = "SELECT * FROM usuario WHERE id=?;";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				ps.setInt(1,id);
				ResultSet rs = ps.executeQuery();

				if(rs.next()) {
					us = new Usuario();

					us.setUser(rs.getString("user"));
					us.setEmail(rs.getString("email"));
					us.setSenha(rs.getString("senha"));
					return us;
				}else {
					return null;
				}
					
		}catch(SQLException e) {
			System.out.println("Erro no sql:"+e.getMessage());
			return null;
		}catch(Exception e) {
			System.out.println("Erro geral:"+e.getMessage());
			return null;
			}
		
	}
	
		public  boolean create(Usuario user) {
				boolean retorno = false;
				try {
					Conexao con = new Conexao();
					PreparedStatement ps = con.getCon().prepareStatement("INSERT INTO usuario(user,senha,email) VALUES(?,?,?);");
					ps.setString(1,user.getUser());
					ps.setString(2,user.getSenha());
					ps.setString(3,user.getEmail());

					if(!ps.execute()) {
						retorno = true;
					}
					con.fecharConexao();
				}catch(SQLException e) {
					System.out.println("Erro no sql:"+e.getMessage());
				}catch(Exception e){
					System.out.println("Erro geral:"+e.getMessage());

				}
			return retorno;
		}
		
		public ArrayList<Usuario> selecionarTodos(){
			try {
				ArrayList<Usuario> lista = null;
				Conexao con = new Conexao();
				String sql = "SELECT * FROM usuario";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				if(ps.execute()) {
					lista = new ArrayList<Usuario>();
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						Usuario user = new Usuario();
						user.setId(rs.getInt("id"));
						user.setUser(rs.getString("user"));
						user.setSenha(rs.getString("senha"));
						user.setEmail(rs.getString("email"));
						lista.add(user);
					}
					con.fecharConexao();
					return lista;
				}else {
					return lista;
				}
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
				return null;
			}catch(Exception e){
				System.out.println("Erro geral:"+e.getMessage());
				return null;
			}
		}
		
		
		
		public boolean UpdateUsuario(int id, Usuario user){
			boolean retorno = false;
				try {
					Conexao con = new Conexao();
					String sql = "UPDATE usuario SET user = ?, email = ?, senha = ? WHERE id = ?; ";
					PreparedStatement ps= con.getCon().prepareStatement(sql);
					ps.setInt(4, id);
					ps.setString(1, user.getUser());
					ps.setString(2, user.getEmail());
					ps.setString(3, user.getSenha());
					if(!ps.execute()) {
						retorno = true;	
					}
					con.fecharConexao();
				}catch(SQLException e ){
					System.out.println("Erro no sql:"+e.getMessage());
				}catch(Exception e){
					System.out.println("Erro geral:"+e.getMessage());
					
				}
			return retorno;		
			
		}
		
		public boolean delete(int id){
			try {
				Conexao con = new Conexao();
				String sql = "DELETE FROM usuario WHERE id = ?";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				ps.setInt(1, id);
				ps.executeUpdate();
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
			}catch(Exception e) {
				System.out.println("Erro geral:"+e.getMessage());
			}
			return true;
		}
		
		
	
	//Métodos dos jogadores
	//selecionar
		public ArrayList<finalResult> selecionarFinal(){
			try {
				ArrayList<finalResult> list = null;
				Conexao con = new Conexao();
				String sql = "SELECT * FROM resultFinal ORDER BY pontos DESC;";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				if(ps.execute()) {
					list = new ArrayList<finalResult>();
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						finalResult fin = new finalResult();
						fin.setPartidaFinal(rs.getString("partida"));
						fin.setJogadorNome(rs.getString("JogadorNome"));
						fin.setPontos(rs.getInt("pontos"));
						fin.setData(rs.getDate("data"));
						fin.setId(rs.getInt("id"));
						list.add(fin);
					}
					con.fecharConexao();
					return list;
				}else {
					return null;
				}
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
				return null;
			}catch(Exception e) {
				System.out.println("Erro geral:"+e.getMessage());
				return null;
			}
		}
		public ArrayList<Partida> selecionarPartida(){
			try {
				ArrayList<Partida> list = null;
				Conexao con = new Conexao();
				String sql = "SELECT * FROM partida ORDER BY id DESC LIMIT 1;";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				if(ps.execute()) {
					list = new ArrayList<Partida>();
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						Partida part = new Partida();
						part.setIdPartida(rs.getInt("id"));
						part.setData(rs.getDate("data"));
						part.setPartidaNome(rs.getString("partidaNome"));
						part.setTipo(rs.getString("tipo"));
						list.add(part);
					}
					con.fecharConexao();
					return list;
				}else {
					return null;
				}
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
				return null;
			}catch(Exception e) {
				System.out.println("Erro geral:"+e.getMessage());
				return null;
			}
		}
		public ArrayList<Jogador> selecionarJogadores(){
			try {
				ArrayList<Jogador> lista = null;
				Conexao con = new Conexao();
				String sql = "SELECT jogadores.id, jogadores.nome, partida.data, partida.partidaNome, partida.tipo  FROM jogadores AS jogadores INNER JOIN  partida AS partida ON jogadores.partida = partida.id ORDER BY jogadores.id DESC LIMIT 1;";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				if(ps.execute()) {
					lista = new ArrayList<Jogador>();
					ResultSet rs = ps.executeQuery();
					while(rs.next()) {
						Jogador joga = new Jogador();
						joga.setNome(rs.getString("jogadores.nome"));
						joga.setId(rs.getInt("jogadores.id"));
						joga.setData(rs.getDate("partida.data"));
						joga.setPartidaNome(rs.getString("partida.partidaNome"));
						joga.setTipo(rs.getString("partida.tipo"));
						lista.add(joga);
						
					}
					con.fecharConexao();
					return lista;
				}else {
					return lista;
				}
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
				return null;
			}catch(Exception e){
				System.out.println("Erro geral:"+e.getMessage());
				return null;
			}
		}
	//Criar
		
		public boolean createPartida(Partida part) {
			boolean retorno = false;
			try {
				Conexao con = new Conexao();
				String sql = "INSERT INTO partida(tipo,partidaNome,data) VALUES(?,?,?);";
				PreparedStatement ps = con.getCon().prepareStatement(sql);
				ps.setString(1,part.getTipo());
				ps.setDate(3,(java.sql.Date) part.getData());
				ps.setString(2,part.getPartidaNome());
				if(!ps.execute()) {
					retorno = true;
				}
				con.fecharConexao();
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
			}catch(Exception e) {
				System.out.println("Erro geral"+e.getMessage());
			}
			return retorno;
		}
		public  boolean createJogador(Jogador joga) {
			boolean retorno = false;
			try {
					
					Conexao con = new Conexao();
						PreparedStatement ps = con.getCon().prepareStatement("INSERT INTO jogadores(nome,partida) VALUES(?,?);");			
						ps.setString(1,joga.getNome());
						ps.setInt(2,joga.getPartida());
					
						if(!ps.execute()) {
							retorno  = true;
						}
					
				con.fecharConexao();
			}catch(SQLException e) {
				System.out.println("Erro no sql:"+e.getMessage());
				
			}catch(Exception e){
				System.out.println("Erro geral:"+e.getMessage());

			}
		return retorno;
	}
	//métodos de partida
	//selecionar partida com FK(ForeignKey)
	public ArrayList<Partida> SelecionarPFK(){
		try {
			ArrayList<Partida> lista = null;
			Conexao con = new Conexao();
			String sql = "SELECT * FROM partida AS partida FULL JOIN jogadores AS jogadores ON partida.jogador = jogadores.id;";
			PreparedStatement ps = con.getCon().prepareStatement(sql);
			if(ps.execute()) {
						lista =  new ArrayList<Partida>();
							ResultSet rs = ps.executeQuery();
							while(rs.next()) {
								Partida part = new Partida();
								part.setPontos(rs.getInt("pontos"));
								part.setTipo(rs.getString("tipo"));
								lista.add(part);
							}
							con.fecharConexao();
							return lista;
							
			}else {
				return lista;
				
			}
		}catch(SQLException e) {
			System.out.println("Erro no sql:"+e.getMessage());
			return null;
		}catch(Exception e){
			System.out.println("Erro geral:"+e.getMessage());
			return null;
		}
		
	}

	public Jogador selectJogadorId(int id){
		try{
			Jogador us = null;
			Conexao con = new Conexao();	
			String sql = "SELECT * FROM jogadores WHERE id=?;";
			PreparedStatement ps = con.getCon().prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				us = new Jogador();	
				us.setNome(rs.getString("nome"));
				
				return us;
			}else {
				return null;
			}
				
	}catch(SQLException e) {
		System.out.println("Erro no sql:"+e.getMessage());
		return null;
	}catch(Exception e) {
		System.out.println("Erro geral:"+e.getMessage());
		return null;
		}
	
}
	
	public boolean createFinalResult(finalResult finalRe) {
		boolean retorno = false;
		try {
			Conexao con = new Conexao();
			String sql = "INSERT INTO resultFinal(JogadorNome,partida,pontos,data) VALUES(?,?,?,?);";
			PreparedStatement ps = con.getCon().prepareStatement(sql);
			ps.setString(1,finalRe.getJogadorNome());
			ps.setString(2,finalRe.getPartidaFinal());
			ps.setInt	(3,finalRe.getPontos());
			ps.setDate(4,(java.sql.Date) finalRe.getData());
			if(!ps.execute()) {
				retorno = true;
			}
			con.fecharConexao();
		}catch(SQLException e) {
			System.out.println("Erro no sql:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro geral"+e.getMessage());
		}
		return retorno;
	}
	
	public boolean updateFinalResult(finalResult finalRe) {
		boolean retorno = false;
		try {
			Conexao con = new Conexao();
			String sql = "UPDATE resultFinal SET JogadorNome = ?,partida = ?,pontos= ? WHERE id = ?;";
			PreparedStatement ps = con.getCon().prepareStatement(sql);
			ps.setString(1,finalRe.getJogadorNome());
			ps.setString(2,finalRe.getPartidaFinal());
			ps.setInt(3,finalRe.getPontos());
			ps.setInt(4,finalRe.getId());
			if(!ps.execute()) {
				retorno = true;
			}
			con.fecharConexao();
		}catch(SQLException e) {
			System.out.println("Erro no sql:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro geral"+e.getMessage());
		}
		return retorno;
	}
	
	public finalResult selecionarUm(int id) {
		finalResult fin = null;
		try {
			Conexao con = new Conexao();
			PreparedStatement ps = con.getCon().prepareStatement("SELECT * FROM resultFinal WHERE id=?;");
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					fin = new finalResult();
					fin.setId(rs.getInt("id"));
					fin.setJogadorNome(rs.getString("JogadorNome"));
					fin.setPartidaFinal(rs.getString("partida"));
					fin.setData(rs.getDate("data"));
					fin.setPontos(rs.getInt("pontos"));
				}
			}
		}catch(SQLException e) {
			System.out.println("Erro no sql:" + e.getMessage());
		}
		return fin;
	}
	public boolean deleteFinal(int id) {
		try {
			Conexao con = new Conexao();
			String sql = "DELETE FROM resultFinal WHERE id = ?;";
			PreparedStatement ps = con.getCon().prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
		}catch(SQLException e) {
			System.out.println("Erro de SQL no delete:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro geral no delete:"+e.getMessage());
		}
		return true;
	}

	
		
}
