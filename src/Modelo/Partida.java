package Modelo;

import java.util.Date;

public class Partida {
	private int idPartida;
	private int pontos;
	private Date data;
	private String partidaNome;
	
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getPartidaNome() {
		return partidaNome;
	}
	public void setPartidaNome(String partidaNome) {
		this.partidaNome = partidaNome;
	}
	
	public int getIdPartida() {
		return idPartida;
	}
	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}


	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String tipo;
	
}
