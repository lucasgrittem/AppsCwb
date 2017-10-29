package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Tipo_pagamento")
public class Tipo_Pagamento {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long tipo_pagamento_id;
	@ManyToMany
	private List<PostoCombustivel> postos;
	private String tipo_pagamento_descricao;
	
	public Long getTipo_pagamento_id() {
		return tipo_pagamento_id;
	}
	public void setTipo_pagamento_id(Long tipo_pagamento_id) {
		this.tipo_pagamento_id = tipo_pagamento_id;
	}
	public List<PostoCombustivel> getPostos() {
		return postos;
	}
	public void setPostos(List<PostoCombustivel> postos) {
		this.postos = postos;
	}
	public String getTipo_pagamento_descricao() {
		return tipo_pagamento_descricao;
	}
	public void setTipo_pagamento_descricao(String tipo_pagamento_descricao) {
		this.tipo_pagamento_descricao = tipo_pagamento_descricao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postos == null) ? 0 : postos.hashCode());
		result = prime * result + ((tipo_pagamento_descricao == null) ? 0 : tipo_pagamento_descricao.hashCode());
		result = prime * result + ((tipo_pagamento_id == null) ? 0 : tipo_pagamento_id.hashCode());
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
		Tipo_Pagamento other = (Tipo_Pagamento) obj;
		if (postos == null) {
			if (other.postos != null)
				return false;
		} else if (!postos.equals(other.postos))
			return false;
		if (tipo_pagamento_descricao == null) {
			if (other.tipo_pagamento_descricao != null)
				return false;
		} else if (!tipo_pagamento_descricao.equals(other.tipo_pagamento_descricao))
			return false;
		if (tipo_pagamento_id == null) {
			if (other.tipo_pagamento_id != null)
				return false;
		} else if (!tipo_pagamento_id.equals(other.tipo_pagamento_id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tipo_Pagamento [tipo_pagamento_descricao=" + tipo_pagamento_descricao + "]";
	}
	public Tipo_Pagamento(Long tipo_pagamento_id, List<PostoCombustivel> postos, String tipo_pagamento_descricao) {
		super();
		this.tipo_pagamento_id = tipo_pagamento_id;
		this.postos = postos;
		this.tipo_pagamento_descricao = tipo_pagamento_descricao;
	}
	public Tipo_Pagamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
