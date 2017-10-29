package br.com.fuelclub.entity;

import java.util.Date;

public class Anuncio_Servico_Automotivo {
	
	
	public float anuncioServicoAutomotivo_preco;
	public Date anuncioServicoAutomotivo_validade;
	public Servicos_Automotivos servicosAutomotivos;
	public PostoCombustivel postoCombustivel;
	//get e set
	
	
	public float getAnuncioServicoAutomotivo_preco() {
		return anuncioServicoAutomotivo_preco;
	}
	public void setAnuncioServicoAutomotivo_preco(float anuncioServicoAutomotivo_preco) {
		this.anuncioServicoAutomotivo_preco = anuncioServicoAutomotivo_preco;
	}
	public Date getAnuncioServicoAutomotivo_validade() {
		return anuncioServicoAutomotivo_validade;
	}
	public void setAnuncioServicoAutomotivo_validade(Date anuncioServicoAutomotivo_validade) {
		this.anuncioServicoAutomotivo_validade = anuncioServicoAutomotivo_validade;
	}
	public Servicos_Automotivos getServicosAutomotivos() {
		return servicosAutomotivos;
	}
	public void setServicosAutomotivos(Servicos_Automotivos servicosAutomotivos) {
		this.servicosAutomotivos = servicosAutomotivos;
	}
	public PostoCombustivel getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}

}
