package br.com.fuelclub.entity;

import java.util.Date;

public class Anuncio_Combustivel {
	
	private int anuncioCombustivel_id;
	private float anuncioCombustivel_preco;
	private PostoCombustivel postoCombustivel;
	private Filial_Posto_Combustivel filialPostoCombustivel;
	private Date anuncioCombustivel_validade;
	private Tipo_Combustivel tipoCombustivel;
	
	
	// get e set
	
	
	public int getAnuncioCombustivel_id() {
		return anuncioCombustivel_id;
	}
	public void setAnuncioCombustivel_id(int anuncioCombustivel_id) {
		this.anuncioCombustivel_id = anuncioCombustivel_id;
	}
	public float getAnuncioCombustivel_preco() {
		return anuncioCombustivel_preco;
	}
	public void setAnuncioCombustivel_preco(float anuncioCombustivel_preco) {
		this.anuncioCombustivel_preco = anuncioCombustivel_preco;
	}
	public PostoCombustivel getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}
	public Filial_Posto_Combustivel getFilialPostoCombustivel() {
		return filialPostoCombustivel;
	}
	public void setFilialPostoCombustivel(Filial_Posto_Combustivel filialPostoCombustivel) {
		this.filialPostoCombustivel = filialPostoCombustivel;
	}
	public Date getAnuncioCombustivel_validade() {
		return anuncioCombustivel_validade;
	}
	public void setAnuncioCombustivel_validade(Date anuncioCombustivel_validade) {
		this.anuncioCombustivel_validade = anuncioCombustivel_validade;
	}
	public Tipo_Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(Tipo_Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

}
