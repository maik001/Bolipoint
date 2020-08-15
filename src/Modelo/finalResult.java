package Modelo;

import java.util.Date;

public class finalResult {
	private String jogadorNome;
	private String partidaFinal;
	private int pontos;
	private Date data;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJogadorNome() {
		return jogadorNome;
	}
	public void setJogadorNome(String jogadorNome) {
		this.jogadorNome = jogadorNome;
	}
	public String getPartidaFinal() {
		return partidaFinal;
	}
	public void setPartidaFinal(String partidaFinal) {
		this.partidaFinal = partidaFinal;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
