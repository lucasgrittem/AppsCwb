package br.com.fuelclub.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Anuncio_Servico_Automotivo")
public class Anuncio_Servico_Automotivo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long anuncioServicoAutomotivo_id;

	@ManyToOne
	private Servicos_Automotivos servicosAutomotivos;
	@ManyToOne
	private PostoCombustivel postoCombustivel;
	private Float anuncioServicoAutomotivo_preco;
	private Date anuncioServicoAutomotivo_validade;
	
	public Long getAnuncioServicoAutomotivo_id() {
		return anuncioServicoAutomotivo_id;
	}
	public void setAnuncioServicoAutomotivo_id(Long anuncioServicoAutomotivo_id) {
		this.anuncioServicoAutomotivo_id = anuncioServicoAutomotivo_id;
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
	public Float getAnuncioServicoAutomotivo_preco() {
		return anuncioServicoAutomotivo_preco;
	}
	public void setAnuncioServicoAutomotivo_preco(Float anuncioServicoAutomotivo_preco) {
		this.anuncioServicoAutomotivo_preco = anuncioServicoAutomotivo_preco;
	}
	public Date getAnuncioServicoAutomotivo_validade() {
		return anuncioServicoAutomotivo_validade;
	}
	public void setAnuncioServicoAutomotivo_validade(Date anuncioServicoAutomotivo_validade) {
		this.anuncioServicoAutomotivo_validade = anuncioServicoAutomotivo_validade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anuncioServicoAutomotivo_id == null) ? 0 : anuncioServicoAutomotivo_id.hashCode());
		result = prime * result
				+ ((anuncioServicoAutomotivo_preco == null) ? 0 : anuncioServicoAutomotivo_preco.hashCode());
		result = prime * result
				+ ((anuncioServicoAutomotivo_validade == null) ? 0 : anuncioServicoAutomotivo_validade.hashCode());
		result = prime * result + ((postoCombustivel == null) ? 0 : postoCombustivel.hashCode());
		result = prime * result + ((servicosAutomotivos == null) ? 0 : servicosAutomotivos.hashCode());
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
		Anuncio_Servico_Automotivo other = (Anuncio_Servico_Automotivo) obj;
		if (anuncioServicoAutomotivo_id == null) {
			if (other.anuncioServicoAutomotivo_id != null)
				return false;
		} else if (!anuncioServicoAutomotivo_id.equals(other.anuncioServicoAutomotivo_id))
			return false;
		if (anuncioServicoAutomotivo_preco == null) {
			if (other.anuncioServicoAutomotivo_preco != null)
				return false;
		} else if (!anuncioServicoAutomotivo_preco.equals(other.anuncioServicoAutomotivo_preco))
			return false;
		if (anuncioServicoAutomotivo_validade == null) {
			if (other.anuncioServicoAutomotivo_validade != null)
				return false;
		} else if (!anuncioServicoAutomotivo_validade.equals(other.anuncioServicoAutomotivo_validade))
			return false;
		if (postoCombustivel == null) {
			if (other.postoCombustivel != null)
				return false;
		} else if (!postoCombustivel.equals(other.postoCombustivel))
			return false;
		if (servicosAutomotivos == null) {
			if (other.servicosAutomotivos != null)
				return false;
		} else if (!servicosAutomotivos.equals(other.servicosAutomotivos))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Anuncio_Servico_Automotivo [anuncioServicoAutomotivo_id=" + anuncioServicoAutomotivo_id
				+ ", servicosAutomotivos=" + servicosAutomotivos + ", postoCombustivel=" + postoCombustivel
				+ ", anuncioServicoAutomotivo_preco=" + anuncioServicoAutomotivo_preco
				+ ", anuncioServicoAutomotivo_validade=" + anuncioServicoAutomotivo_validade + "]";
	}
	public Anuncio_Servico_Automotivo(Long anuncioServicoAutomotivo_id, Servicos_Automotivos servicosAutomotivos,
			PostoCombustivel postoCombustivel, Float anuncioServicoAutomotivo_preco,
			Date anuncioServicoAutomotivo_validade) {
		super();
		this.anuncioServicoAutomotivo_id = anuncioServicoAutomotivo_id;
		this.servicosAutomotivos = servicosAutomotivos;
		this.postoCombustivel = postoCombustivel;
		this.anuncioServicoAutomotivo_preco = anuncioServicoAutomotivo_preco;
		this.anuncioServicoAutomotivo_validade = anuncioServicoAutomotivo_validade;
	}
	public Anuncio_Servico_Automotivo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
