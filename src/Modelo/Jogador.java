package Modelo;

import Modelo.Partida;
public class Jogador extends Partida{
	
	private String nome;
	private int partida;
	private int id;

	
	public int getPartida() {
		return partida;
	}
	public void setPartida(int partida) {
		this.partida = partida;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
