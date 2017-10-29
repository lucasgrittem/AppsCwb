package br.com.fuelclub.entity;

public class Cidade {
	
	private Long cidade_id;
	private String cidade_descricao;
	private Estado estado;
	
	//get e set
	
	public Long getCidade_id() {
		return cidade_id;
	}
	public void setCidade_id(Long cidade_id) {
		this.cidade_id = cidade_id;
	}
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

}
