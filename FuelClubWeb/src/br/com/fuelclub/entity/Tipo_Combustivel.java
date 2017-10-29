package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Tipo_combustivel")
public class Tipo_Combustivel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tipo_combustivel_id;
	private String tipo_combustivel_descricao;
	@OneToMany
	private List<Anuncio_Combustivel> anuncios;
	
	public Long getTipo_combustivel_id() {
		return tipo_combustivel_id;
	}
	public void setTipo_combustivel_id(Long tipo_combustivel_id) {
		this.tipo_combustivel_id = tipo_combustivel_id;
	}
	public String getTipo_combustivel_descricao() {
		return tipo_combustivel_descricao;
	}
	public void setTipo_combustivel_descricao(String tipo_combustivel_descricao) {
		this.tipo_combustivel_descricao = tipo_combustivel_descricao;
	}
	public List<Anuncio_Combustivel> getAnuncios() {
		return anuncios;
	}
	public void setAnuncios(List<Anuncio_Combustivel> anuncios) {
		this.anuncios = anuncios;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anuncios == null) ? 0 : anuncios.hashCode());
		result = prime * result + ((tipo_combustivel_descricao == null) ? 0 : tipo_combustivel_descricao.hashCode());
		result = prime * result + ((tipo_combustivel_id == null) ? 0 : tipo_combustivel_id.hashCode());
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
		Tipo_Combustivel other = (Tipo_Combustivel) obj;
		if (anuncios == null) {
			if (other.anuncios != null)
				return false;
		} else if (!anuncios.equals(other.anuncios))
			return false;
		if (tipo_combustivel_descricao == null) {
			if (other.tipo_combustivel_descricao != null)
				return false;
		} else if (!tipo_combustivel_descricao.equals(other.tipo_combustivel_descricao))
			return false;
		if (tipo_combustivel_id == null) {
			if (other.tipo_combustivel_id != null)
				return false;
		} else if (!tipo_combustivel_id.equals(other.tipo_combustivel_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tipo_Combustivel [tipo_combustivel_descricao=" + tipo_combustivel_descricao + "]";
	}
	public Tipo_Combustivel(Long tipo_combustivel_id, String tipo_combustivel_descricao,
			List<Anuncio_Combustivel> anuncios) {
		super();
		this.tipo_combustivel_id = tipo_combustivel_id;
		this.tipo_combustivel_descricao = tipo_combustivel_descricao;
		this.anuncios = anuncios;
	}
	public Tipo_Combustivel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
