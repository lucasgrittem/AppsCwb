package br.com.fuelclub.entity;

public class Posto_Favorito {
	
	
	public Usuario usuario;
	public PostoCombustivel postoCombustivel;
	
	//get e set
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public PostoCombustivel getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}

}
