package br.com.fuelclub.entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.org.glassfish.gmbal.IncludeSubclass;

@Entity
@Table(name = "Forma_pagamento")
public class Forma_Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long forma_pagamento_id;
	private String forma_pagamento_descricao;
	@ManyToMany
	private List<PostoCombustivel> postos;
	
	public Long getForma_pagamento_id() {
		return forma_pagamento_id;
	}
	public void setForma_pagamento_id(Long forma_pagamento_id) {
		this.forma_pagamento_id = forma_pagamento_id;
	}
	public String getForma_pagamento_descricao() {
		return forma_pagamento_descricao;
	}
	public void setForma_pagamento_descricao(String forma_pagamento_descricao) {
		this.forma_pagamento_descricao = forma_pagamento_descricao;
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
		result = prime * result + ((forma_pagamento_descricao == null) ? 0 : forma_pagamento_descricao.hashCode());
		result = prime * result + ((forma_pagamento_id == null) ? 0 : forma_pagamento_id.hashCode());
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
		Forma_Pagamento other = (Forma_Pagamento) obj;
		if (forma_pagamento_descricao == null) {
			if (other.forma_pagamento_descricao != null)
				return false;
		} else if (!forma_pagamento_descricao.equals(other.forma_pagamento_descricao))
			return false;
		if (forma_pagamento_id == null) {
			if (other.forma_pagamento_id != null)
				return false;
		} else if (!forma_pagamento_id.equals(other.forma_pagamento_id))
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
		return "Forma_Pagamento [forma_pagamento_id=" + forma_pagamento_id + ", forma_pagamento_descricao="
				+ forma_pagamento_descricao + ", postos=" + postos + "]";
	}
	public Forma_Pagamento(Long forma_pagamento_id, String forma_pagamento_descricao, List<PostoCombustivel> postos) {
		super();
		this.forma_pagamento_id = forma_pagamento_id;
		this.forma_pagamento_descricao = forma_pagamento_descricao;
		this.postos = postos;
	}
	public Forma_Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
