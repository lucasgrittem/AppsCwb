package br.com.fuelclub.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Anuncio_conveniencia")
public class Anuncio_Conveniencia {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long anuncio_conveniencia_id;
	
	@ManyToOne
	private PostoCombustivel postoCombustivel;
	@ManyToOne
	private Servicos_Conveniencia servicosConveniencia;
	private Float anuncioConveniencia_preco;
	private Date anuncioConveniencia_validade;
	
	public Long getAnuncio_conveniencia_id() {
		return anuncio_conveniencia_id;
	}
	public void setAnuncio_conveniencia_id(Long anuncio_conveniencia_id) {
		this.anuncio_conveniencia_id = anuncio_conveniencia_id;
	}
	public PostoCombustivel getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}
	public Servicos_Conveniencia getServicosConveniencia() {
		return servicosConveniencia;
	}
	public void setServicosConveniencia(Servicos_Conveniencia servicosConveniencia) {
		this.servicosConveniencia = servicosConveniencia;
	}
	public Float getAnuncioConveniencia_preco() {
		return anuncioConveniencia_preco;
	}
	public void setAnuncioConveniencia_preco(Float anuncioConveniencia_preco) {
		this.anuncioConveniencia_preco = anuncioConveniencia_preco;
	}
	public Date getAnuncioConveniencia_validade() {
		return anuncioConveniencia_validade;
	}
	public void setAnuncioConveniencia_validade(Date anuncioConveniencia_validade) {
		this.anuncioConveniencia_validade = anuncioConveniencia_validade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anuncioConveniencia_preco == null) ? 0 : anuncioConveniencia_preco.hashCode());
		result = prime * result
				+ ((anuncioConveniencia_validade == null) ? 0 : anuncioConveniencia_validade.hashCode());
		result = prime * result + ((anuncio_conveniencia_id == null) ? 0 : anuncio_conveniencia_id.hashCode());
		result = prime * result + ((postoCombustivel == null) ? 0 : postoCombustivel.hashCode());
		result = prime * result + ((servicosConveniencia == null) ? 0 : servicosConveniencia.hashCode());
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
		Anuncio_Conveniencia other = (Anuncio_Conveniencia) obj;
		if (anuncioConveniencia_preco == null) {
			if (other.anuncioConveniencia_preco != null)
				return false;
		} else if (!anuncioConveniencia_preco.equals(other.anuncioConveniencia_preco))
			return false;
		if (anuncioConveniencia_validade == null) {
			if (other.anuncioConveniencia_validade != null)
				return false;
		} else if (!anuncioConveniencia_validade.equals(other.anuncioConveniencia_validade))
			return false;
		if (anuncio_conveniencia_id == null) {
			if (other.anuncio_conveniencia_id != null)
				return false;
		} else if (!anuncio_conveniencia_id.equals(other.anuncio_conveniencia_id))
			return false;
		if (postoCombustivel == null) {
			if (other.postoCombustivel != null)
				return false;
		} else if (!postoCombustivel.equals(other.postoCombustivel))
			return false;
		if (servicosConveniencia == null) {
			if (other.servicosConveniencia != null)
				return false;
		} else if (!servicosConveniencia.equals(other.servicosConveniencia))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Anuncio_Conveniencia [anuncio_conveniencia_id=" + anuncio_conveniencia_id + ", postoCombustivel="
				+ postoCombustivel + ", servicosConveniencia=" + servicosConveniencia + ", anuncioConveniencia_preco="
				+ anuncioConveniencia_preco + ", anuncioConveniencia_validade=" + anuncioConveniencia_validade + "]";
	}
	public Anuncio_Conveniencia(Long anuncio_conveniencia_id, PostoCombustivel postoCombustivel,
			Servicos_Conveniencia servicosConveniencia, Float anuncioConveniencia_preco,
			Date anuncioConveniencia_validade) {
		super();
		this.anuncio_conveniencia_id = anuncio_conveniencia_id;
		this.postoCombustivel = postoCombustivel;
		this.servicosConveniencia = servicosConveniencia;
		this.anuncioConveniencia_preco = anuncioConveniencia_preco;
		this.anuncioConveniencia_validade = anuncioConveniencia_validade;
	}
	public Anuncio_Conveniencia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
