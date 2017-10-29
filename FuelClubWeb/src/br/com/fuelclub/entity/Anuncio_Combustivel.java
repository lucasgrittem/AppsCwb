package br.com.fuelclub.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Anuncio_combustivel")
public class Anuncio_Combustivel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long anuncioCombustivel_id;
	
	@ManyToOne
	private PostoCombustivel postoCombustivel;
	@ManyToOne
	private Tipo_Combustivel tipoCombustivel;
	private Float anuncioCombustivel_preco;
	private Date anuncioCombustivel_validade;
	public Long getAnuncioCombustivel_id() {
		return anuncioCombustivel_id;
	}
	public void setAnuncioCombustivel_id(Long anuncioCombustivel_id) {
		this.anuncioCombustivel_id = anuncioCombustivel_id;
	}
	public PostoCombustivel getPostoCombustivel() {
		return postoCombustivel;
	}
	public void setPostoCombustivel(PostoCombustivel postoCombustivel) {
		this.postoCombustivel = postoCombustivel;
	}
	public Tipo_Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(Tipo_Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public Float getAnuncioCombustivel_preco() {
		return anuncioCombustivel_preco;
	}
	public void setAnuncioCombustivel_preco(Float anuncioCombustivel_preco) {
		this.anuncioCombustivel_preco = anuncioCombustivel_preco;
	}
	public Date getAnuncioCombustivel_validade() {
		return anuncioCombustivel_validade;
	}
	public void setAnuncioCombustivel_validade(Date anuncioCombustivel_validade) {
		this.anuncioCombustivel_validade = anuncioCombustivel_validade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anuncioCombustivel_id == null) ? 0 : anuncioCombustivel_id.hashCode());
		result = prime * result + ((anuncioCombustivel_preco == null) ? 0 : anuncioCombustivel_preco.hashCode());
		result = prime * result + ((anuncioCombustivel_validade == null) ? 0 : anuncioCombustivel_validade.hashCode());
		result = prime * result + ((postoCombustivel == null) ? 0 : postoCombustivel.hashCode());
		result = prime * result + ((tipoCombustivel == null) ? 0 : tipoCombustivel.hashCode());
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
		Anuncio_Combustivel other = (Anuncio_Combustivel) obj;
		if (anuncioCombustivel_id == null) {
			if (other.anuncioCombustivel_id != null)
				return false;
		} else if (!anuncioCombustivel_id.equals(other.anuncioCombustivel_id))
			return false;
		if (anuncioCombustivel_preco == null) {
			if (other.anuncioCombustivel_preco != null)
				return false;
		} else if (!anuncioCombustivel_preco.equals(other.anuncioCombustivel_preco))
			return false;
		if (anuncioCombustivel_validade == null) {
			if (other.anuncioCombustivel_validade != null)
				return false;
		} else if (!anuncioCombustivel_validade.equals(other.anuncioCombustivel_validade))
			return false;
		if (postoCombustivel == null) {
			if (other.postoCombustivel != null)
				return false;
		} else if (!postoCombustivel.equals(other.postoCombustivel))
			return false;
		if (tipoCombustivel == null) {
			if (other.tipoCombustivel != null)
				return false;
		} else if (!tipoCombustivel.equals(other.tipoCombustivel))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Anuncio_Combustivel [anuncioCombustivel_id=" + anuncioCombustivel_id + ", postoCombustivel="
				+ postoCombustivel + ", tipoCombustivel=" + tipoCombustivel + ", anuncioCombustivel_preco="
				+ anuncioCombustivel_preco + ", anuncioCombustivel_validade=" + anuncioCombustivel_validade + "]";
	}
	public Anuncio_Combustivel(Long anuncioCombustivel_id, PostoCombustivel postoCombustivel,
			Tipo_Combustivel tipoCombustivel, Float anuncioCombustivel_preco, Date anuncioCombustivel_validade) {
		super();
		this.anuncioCombustivel_id = anuncioCombustivel_id;
		this.postoCombustivel = postoCombustivel;
		this.tipoCombustivel = tipoCombustivel;
		this.anuncioCombustivel_preco = anuncioCombustivel_preco;
		this.anuncioCombustivel_validade = anuncioCombustivel_validade;
	}
	public Anuncio_Combustivel() {
		super();
	}
	
}
