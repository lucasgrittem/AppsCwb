package br.com.fuelclub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Servicos_conveniencia")
public class Servicos_Conveniencia {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long servicos_conveniencia_id;
	@ManyToOne
	private PostoCombustivel postoCombustível;
	private String servicosConveniencia_descricao;
	public Long getServicos_conveniencia_id() {
		return servicos_conveniencia_id;
	}
	public void setServicos_conveniencia_id(Long servicos_conveniencia_id) {
		this.servicos_conveniencia_id = servicos_conveniencia_id;
	}
	public PostoCombustivel getPostoCombustível() {
		return postoCombustível;
	}
	public void setPostoCombustível(PostoCombustivel postoCombustível) {
		this.postoCombustível = postoCombustível;
	}
	public String getServicosConveniencia_descricao() {
		return servicosConveniencia_descricao;
	}
	public void setServicosConveniencia_descricao(String servicosConveniencia_descricao) {
		this.servicosConveniencia_descricao = servicosConveniencia_descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postoCombustível == null) ? 0 : postoCombustível.hashCode());
		result = prime * result
				+ ((servicosConveniencia_descricao == null) ? 0 : servicosConveniencia_descricao.hashCode());
		result = prime * result + ((servicos_conveniencia_id == null) ? 0 : servicos_conveniencia_id.hashCode());
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
		Servicos_Conveniencia other = (Servicos_Conveniencia) obj;
		if (postoCombustível == null) {
			if (other.postoCombustível != null)
				return false;
		} else if (!postoCombustível.equals(other.postoCombustível))
			return false;
		if (servicosConveniencia_descricao == null) {
			if (other.servicosConveniencia_descricao != null)
				return false;
		} else if (!servicosConveniencia_descricao.equals(other.servicosConveniencia_descricao))
			return false;
		if (servicos_conveniencia_id == null) {
			if (other.servicos_conveniencia_id != null)
				return false;
		} else if (!servicos_conveniencia_id.equals(other.servicos_conveniencia_id))
			return false;
		return true;
	}
	public Servicos_Conveniencia(String servicosConveniencia_descricao) {
		super();
		this.servicosConveniencia_descricao = servicosConveniencia_descricao;
	}
	public Servicos_Conveniencia(Long servicos_conveniencia_id, PostoCombustivel postoCombustível,
			String servicosConveniencia_descricao) {
		super();
		this.servicos_conveniencia_id = servicos_conveniencia_id;
		this.postoCombustível = postoCombustível;
		this.servicosConveniencia_descricao = servicosConveniencia_descricao;
	}
	public Servicos_Conveniencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
