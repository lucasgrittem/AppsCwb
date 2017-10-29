package br.com.fuelclub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "servicos_automotivos")
public class Servicos_Automotivos {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long servicos_automotivos_id;
	@ManyToOne
	private PostoCombustivel postoCombustivel;
	private String servicos_automotivos_descricao;
	
	public Long getServicos_automotivos_id() {
		return servicos_automotivos_id;
	}
	public void setServicos_automotivos_id(Long servicos_automotivos_id) {
		this.servicos_automotivos_id = servicos_automotivos_id;
	}
	public PostoCombustivel getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}
	public String getServicos_automotivos_descricao() {
		return servicos_automotivos_descricao;
	}
	public void setServicos_automotivos_descricao(String servicos_automotivos_descricao) {
		this.servicos_automotivos_descricao = servicos_automotivos_descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postoCombustivel == null) ? 0 : postoCombustivel.hashCode());
		result = prime * result
				+ ((servicos_automotivos_descricao == null) ? 0 : servicos_automotivos_descricao.hashCode());
		result = prime * result + ((servicos_automotivos_id == null) ? 0 : servicos_automotivos_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servicos_Automotivos other = (Servicos_Automotivos) obj;
		if (postoCombustivel == null) {
			if (other.postoCombustivel != null)
				return false;
		} else if (!postoCombustivel.equals(other.postoCombustivel))
			return false;
		if (servicos_automotivos_descricao == null) {
			if (other.servicos_automotivos_descricao != null)
				return false;
		} else if (!servicos_automotivos_descricao.equals(other.servicos_automotivos_descricao))
			return false;
		if (servicos_automotivos_id == null) {
			if (other.servicos_automotivos_id != null)
				return false;
		} else if (!servicos_automotivos_id.equals(other.servicos_automotivos_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Servicos_Automotivos [servicos_automotivos_descricao=" + servicos_automotivos_descricao + "]";
	}
	public Servicos_Automotivos(Long servicos_automotivos_id, PostoCombustivel postoCombustivel,
			String servicos_automotivos_descricao) {
		super();
		this.servicos_automotivos_id = servicos_automotivos_id;
		this.postoCombustivel = postoCombustivel;
		this.servicos_automotivos_descricao = servicos_automotivos_descricao;
	}
	public Servicos_Automotivos() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
