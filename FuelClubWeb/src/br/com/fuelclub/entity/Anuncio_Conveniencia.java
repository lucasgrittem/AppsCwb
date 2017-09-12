package br.com.fuelclub.entity;

import java.util.Date;

public class Anuncio_Conveniencia {
	
	
	public float anuncioConveniencia_preco;
	public Date anuncioConveniencia_validade;
	public Servicos_Conveniencia servicosConveniencia;
	public PostoCombustivel postoCombustivel;
	public Filial_Posto_Combustivel filialPostoCombustivel;
	
	
	// get e set
	
	
	public float getAnuncioConveniencia_preco() {
		return anuncioConveniencia_preco;
	}
	public void setAnuncioConveniencia_preco(float anuncioConveniencia_preco) {
		this.anuncioConveniencia_preco = anuncioConveniencia_preco;
	}
	public Date getAnuncioConveniencia_validade() {
		return anuncioConveniencia_validade;
	}
	public void setAnuncioConveniencia_validade(Date anuncioConveniencia_validade) {
		this.anuncioConveniencia_validade = anuncioConveniencia_validade;
	}
	public Servicos_Conveniencia getServicosConveniencia() {
		return servicosConveniencia;
	}
	public void setServicosConveniencia(Servicos_Conveniencia servicosConveniencia) {
		this.servicosConveniencia = servicosConveniencia;
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
	
	

}
