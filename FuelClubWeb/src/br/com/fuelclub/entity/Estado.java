package br.com.fuelclub.entity;

public class Estado {
	
	
	public String estado_descricao;
	public String estado_uf;
	public Pais pais;
	
	
	//get e set
	
	
	public String getEstado_descricao() {
		return estado_descricao;
	}
	public void setEstado_descricao(String estado_descricao) {
		this.estado_descricao = estado_descricao;
	}
	public String getEstado_uf() {
		return estado_uf;
	}
	public void setEstado_uf(String estado_uf) {
		this.estado_uf = estado_uf;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	

}
