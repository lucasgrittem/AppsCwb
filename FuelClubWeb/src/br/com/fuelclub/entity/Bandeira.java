package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bandeira")
public class Bandeira {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long bandeira_id;
	private String bandeira_descricao;
	@OneToMany
	private List<PostoCombustivel> postos;
	
	public Long getBandeira_id() {
		return bandeira_id;
	}
	public void setBandeira_id(Long bandeira_id) {
		this.bandeira_id = bandeira_id;
	}
	public String getBandeira_descricao() {
		return bandeira_descricao;
	}
	public void setBandeira_descricao(String bandeira_descricao) {
		this.bandeira_descricao = bandeira_descricao;
	}
	public List<PostoCombustivel> getPostos() {
		return postos;
	}
	public void setPostos(List<PostoCombustivel> postos) {
		this.postos = postos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bandeira_descricao == null) ? 0 : bandeira_descricao.hashCode());
		result = prime * result + ((bandeira_id == null) ? 0 : bandeira_id.hashCode());
		result = prime * result + ((postos == null) ? 0 : postos.hashCode());
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
		Bandeira other = (Bandeira) obj;
		if (bandeira_descricao == null) {
			if (other.bandeira_descricao != null)
				return false;
		} else if (!bandeira_descricao.equals(other.bandeira_descricao))
			return false;
		if (bandeira_id == null) {
			if (other.bandeira_id != null)
				return false;
		} else if (!bandeira_id.equals(other.bandeira_id))
			return false;
		if (postos == null) {
			if (other.postos != null)
				return false;
		} else if (!postos.equals(other.postos))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bandeira [bandeira_descricao=" + bandeira_descricao + "]";
	}
	public Bandeira(Long bandeira_id, String bandeira_descricao, List<PostoCombustivel> postos) {
		super();
		this.bandeira_id = bandeira_id;
		this.bandeira_descricao = bandeira_descricao;
		this.postos = postos;
	}
	public Bandeira() {
		super();
	} 
}
