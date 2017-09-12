package br.com.fuelclub.entity;

public class Cidade {
	
	
	public String cidade_descricao;
	public Estado estado;
	public Pais pais;
	
	
	//get e set
	
	
	public String getCidade_descricao() {
		return cidade_descricao;
	}
	public void setCidade_descricao(String cidade_descricao) {
		this.cidade_descricao = cidade_descricao;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
