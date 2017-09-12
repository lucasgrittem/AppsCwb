package br.com.fuelclub.entity;

public class Posto_Favorito {
	
	
	public Usuario usuario;
	public PostoCombustivel postoCombustivel;
	public Filial_Posto_Combustivel filialPostoCombustivel;
	
	
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
	public Filial_Posto_Combustivel getFilialPostoCombustivel() {
		return filialPostoCombustivel;
	}
	public void setFilialPostoCombustivel(Filial_Posto_Combustivel filialPostoCombustivel) {
		this.filialPostoCombustivel = filialPostoCombustivel;
	}
	
	

}
