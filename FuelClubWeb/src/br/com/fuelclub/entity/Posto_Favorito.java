package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table (name = "Posto_favorito")
public class Posto_Favorito {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long posto_favorito_id;
	@ManyToMany
	private List<Usuario> usuario;
	@ManyToMany
	private List<PostoCombustivel> postoCombustivel;
	
	public Long getPosto_favorito_id() {
		return posto_favorito_id;
	}
	public void setPosto_favorito_id(Long posto_favorito_id) {
		this.posto_favorito_id = posto_favorito_id;
	}
	public List<Usuario> getUsuario() {
		return usuario;
	}
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	public List<PostoCombustivel> getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(List<PostoCombustivel> postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}
	
	

}
