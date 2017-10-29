package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bandeira")
public class Cartao {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long cartao_id;
	private String cartao_bandeira;
	private String cartao_descri��o;
	@ManyToMany
	private List<PostoCombustivel> postos;
	
	public Long getCartao_id() {
		return cartao_id;
	}
	public void setCartao_id(Long cartao_id) {
		this.cartao_id = cartao_id;
	}
	public String getCartao_bandeira() {
		return cartao_bandeira;
	}
	public void setCartao_bandeira(String cartao_bandeira) {
		this.cartao_bandeira = cartao_bandeira;
	}
	public String getCartao_descri��o() {
		return cartao_descri��o;
	}
	public void setCartao_descri��o(String cartao_descri��o) {
		this.cartao_descri��o = cartao_descri��o;
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
		result = prime * result + ((cartao_bandeira == null) ? 0 : cartao_bandeira.hashCode());
		result = prime * result + ((cartao_descri��o == null) ? 0 : cartao_descri��o.hashCode());
		result = prime * result + ((cartao_id == null) ? 0 : cartao_id.hashCode());
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
		Cartao other = (Cartao) obj;
		if (cartao_bandeira == null) {
			if (other.cartao_bandeira != null)
				return false;
		} else if (!cartao_bandeira.equals(other.cartao_bandeira))
			return false;
		if (cartao_descri��o == null) {
			if (other.cartao_descri��o != null)
				return false;
		} else if (!cartao_descri��o.equals(other.cartao_descri��o))
			return false;
		if (cartao_id == null) {
			if (other.cartao_id != null)
				return false;
		} else if (!cartao_id.equals(other.cartao_id))
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
		return "Cartao [cartao_id=" + cartao_id + ", cartao_bandeira=" + cartao_bandeira + ", cartao_descri��o="
				+ cartao_descri��o + ", postos=" + postos + "]";
	}
	public Cartao(Long cartao_id, String cartao_bandeira, String cartao_descri��o, List<PostoCombustivel> postos) {
		super();
		this.cartao_id = cartao_id;
		this.cartao_bandeira = cartao_bandeira;
		this.cartao_descri��o = cartao_descri��o;
		this.postos = postos;
	}
	public Cartao() {
		super();
	}
}
