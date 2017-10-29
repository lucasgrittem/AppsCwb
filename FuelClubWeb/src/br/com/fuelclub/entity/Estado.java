package br.com.fuelclub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Estado")
public class Estado {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long estado_id;
	
	private String estado_descricao;
	private String estado_sigla;
	
	public Long getEstado_id() {
		return estado_id;
	}
	public void setEstado_id(Long estado_id) {
		this.estado_id = estado_id;
	}
	public String getEstado_descricao() {
		return estado_descricao;
	}
	public void setEstado_descricao(String estado_descricao) {
		this.estado_descricao = estado_descricao;
	}
	public String getEstado_sigla() {
		return estado_sigla;
	}
	public void setEstado_sigla(String estado_sigla) {
		this.estado_sigla = estado_sigla;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado_descricao == null) ? 0 : estado_descricao.hashCode());
		result = prime * result + ((estado_id == null) ? 0 : estado_id.hashCode());
		result = prime * result + ((estado_sigla == null) ? 0 : estado_sigla.hashCode());
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
		Estado other = (Estado) obj;
		if (estado_descricao == null) {
			if (other.estado_descricao != null)
				return false;
		} else if (!estado_descricao.equals(other.estado_descricao))
			return false;
		if (estado_id == null) {
			if (other.estado_id != null)
				return false;
		} else if (!estado_id.equals(other.estado_id))
			return false;
		if (estado_sigla == null) {
			if (other.estado_sigla != null)
				return false;
		} else if (!estado_sigla.equals(other.estado_sigla))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Estado [estado_descricao=" + estado_descricao + ", estado_sigla=" + estado_sigla + "]";
	}
	public Estado(Long estado_id, String estado_descricao, String estado_sigla) {
		super();
		this.estado_id = estado_id;
		this.estado_descricao = estado_descricao;
		this.estado_sigla = estado_sigla;
	}
	public Estado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
