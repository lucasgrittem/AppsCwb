package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Combustivel")
public class Combustivel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long combustivel_id;
	private String combustivel_descricao;
	
	@ManyToMany
	private List<PostoCombustivel> postos;

	public Long getCombustivel_id() {
		return combustivel_id;
	}

	public void setCombustivel_id(Long combustivel_id) {
		this.combustivel_id = combustivel_id;
	}

	public String getCombustivel_descricao() {
		return combustivel_descricao;
	}

	public void setCombustivel_descricao(String combustivel_descricao) {
		this.combustivel_descricao = combustivel_descricao;
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
		result = prime * result + ((combustivel_descricao == null) ? 0 : combustivel_descricao.hashCode());
		result = prime * result + ((combustivel_id == null) ? 0 : combustivel_id.hashCode());
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
		Combustivel other = (Combustivel) obj;
		if (combustivel_descricao == null) {
			if (other.combustivel_descricao != null)
				return false;
		} else if (!combustivel_descricao.equals(other.combustivel_descricao))
			return false;
		if (combustivel_id == null) {
			if (other.combustivel_id != null)
				return false;
		} else if (!combustivel_id.equals(other.combustivel_id))
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
		return "Combustivel [combustivel_descricao=" + combustivel_descricao + "]";
	}

	public Combustivel(Long combustivel_id, String combustivel_descricao, List<PostoCombustivel> postos) {
		super();
		this.combustivel_id = combustivel_id;
		this.combustivel_descricao = combustivel_descricao;
		this.postos = postos;
	}

	public Combustivel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
