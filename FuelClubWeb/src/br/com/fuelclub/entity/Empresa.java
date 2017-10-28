package br.com.fuelclub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Empresa")
public class Empresa {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long empresa_id;
	
	private String empresa_cnpj;
	private String empresa_nome_fantasia;
	private String empresa_email;
	private String empresa_senha;
	private String empresa_login;
	
	public Long getEmpresa_id() {
		return empresa_id;
	}
	public void setEmpresa_id(Long empresa_id) {
		this.empresa_id = empresa_id;
	}
	public String getEmpresa_cnpj() {
		return empresa_cnpj;
	}
	public void setEmpresa_cnpj(String empresa_cnpj) {
		this.empresa_cnpj = empresa_cnpj;
	}
	public String getEmpresa_nome_fantasia() {
		return empresa_nome_fantasia;
	}
	public void setEmpresa_nome_fantasia(String empresa_nome_fantasia) {
		this.empresa_nome_fantasia = empresa_nome_fantasia;
	}
	public String getEmpresa_email() {
		return empresa_email;
	}
	public void setEmpresa_email(String empresa_email) {
		this.empresa_email = empresa_email;
	}
	public String getEmpresa_senha() {
		return empresa_senha;
	}
	public void setEmpresa_senha(String empresa_senha) {
		this.empresa_senha = empresa_senha;
	}
	public String getEmpresa_login() {
		return empresa_login;
	}
	public void setEmpresa_login(String empresa_login) {
		this.empresa_login = empresa_login;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empresa_cnpj == null) ? 0 : empresa_cnpj.hashCode());
		result = prime * result + ((empresa_email == null) ? 0 : empresa_email.hashCode());
		result = prime * result + ((empresa_id == null) ? 0 : empresa_id.hashCode());
		result = prime * result + ((empresa_login == null) ? 0 : empresa_login.hashCode());
		result = prime * result + ((empresa_nome_fantasia == null) ? 0 : empresa_nome_fantasia.hashCode());
		result = prime * result + ((empresa_senha == null) ? 0 : empresa_senha.hashCode());
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
		Empresa other = (Empresa) obj;
		if (empresa_cnpj == null) {
			if (other.empresa_cnpj != null)
				return false;
		} else if (!empresa_cnpj.equals(other.empresa_cnpj))
			return false;
		if (empresa_email == null) {
			if (other.empresa_email != null)
				return false;
		} else if (!empresa_email.equals(other.empresa_email))
			return false;
		if (empresa_id == null) {
			if (other.empresa_id != null)
				return false;
		} else if (!empresa_id.equals(other.empresa_id))
			return false;
		if (empresa_login == null) {
			if (other.empresa_login != null)
				return false;
		} else if (!empresa_login.equals(other.empresa_login))
			return false;
		if (empresa_nome_fantasia == null) {
			if (other.empresa_nome_fantasia != null)
				return false;
		} else if (!empresa_nome_fantasia.equals(other.empresa_nome_fantasia))
			return false;
		if (empresa_senha == null) {
			if (other.empresa_senha != null)
				return false;
		} else if (!empresa_senha.equals(other.empresa_senha))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Empresa [empresa_nome_fantasia=" + empresa_nome_fantasia + "]";
	}
	public Empresa(Long empresa_id, String empresa_cnpj, String empresa_nome_fantasia, String empresa_email,
			String empresa_senha, String empresa_login) {
		super();
		this.empresa_id = empresa_id;
		this.empresa_cnpj = empresa_cnpj;
		this.empresa_nome_fantasia = empresa_nome_fantasia;
		this.empresa_email = empresa_email;
		this.empresa_senha = empresa_senha;
		this.empresa_login = empresa_login;
	}
	public Empresa() {
		
	}
	
	

}
