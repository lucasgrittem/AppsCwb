package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Cidade")
public class Cidade {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	@Column (name="cidade_id", insertable=true, updatable=false)
	private Long cidade_id;
	
	@OneToOne
	@JoinColumn (name="estado_id")
	private Estado estado;
	private String cidade_descricao;
	
	@OneToMany
	private List<PostoCombustivel> postos;

	public Long getCidade_id() {
		return cidade_id;
	}

	public void setCidade_id(Long cidade_id) {
		this.cidade_id = cidade_id;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCidade_descricao() {
		return cidade_descricao;
	}

	public void setCidade_descricao(String cidade_descricao) {
		this.cidade_descricao = cidade_descricao;
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
		result = prime * result + ((cidade_descricao == null) ? 0 : cidade_descricao.hashCode());
		result = prime * result + ((cidade_id == null) ? 0 : cidade_id.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
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
		Cidade other = (Cidade) obj;
		if (cidade_descricao == null) {
			if (other.cidade_descricao != null)
				return false;
		} else if (!cidade_descricao.equals(other.cidade_descricao))
			return false;
		if (cidade_id == null) {
			if (other.cidade_id != null)
				return false;
		} else if (!cidade_id.equals(other.cidade_id))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
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
		return "Cidade [cidade_id=" + cidade_id + ", estado=" + estado + ", cidade_descricao=" + cidade_descricao
				+ ", postos=" + postos + "]";
	}

	public Cidade(Long cidade_id, Estado estado, String cidade_descricao, List<PostoCombustivel> postos) {
		super();
		this.cidade_id = cidade_id;
		this.estado = estado;
		this.cidade_descricao = cidade_descricao;
		this.postos = postos;
	}

	public Cidade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
