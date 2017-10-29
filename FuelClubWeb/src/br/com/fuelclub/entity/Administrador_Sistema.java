package br.com.fuelclub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Administrador_Sistema")
public class Administrador_Sistema {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long administrador_sistema_id;
	
	private String administrador_sistema_nome;
	private String administrador_sistema_usuario;
	private String administrador_sistema_senha;
	private String administrador_sistema_email;
	private String administrador_sistema_telefone;
	
	public Long getAdministrador_sistema_id() {
		return administrador_sistema_id;
	}
	public void setAdministrador_sistema_id(Long administrador_sistema_id) {
		this.administrador_sistema_id = administrador_sistema_id;
	}
	public String getAdministrador_sistema_nome() {
		return administrador_sistema_nome;
	}
	public void setAdministrador_sistema_nome(String administrador_sistema_nome) {
		this.administrador_sistema_nome = administrador_sistema_nome;
	}
	public String getAdministrador_sistema_usuario() {
		return administrador_sistema_usuario;
	}
	public void setAdministrador_sistema_usuario(String administrador_sistema_usuario) {
		this.administrador_sistema_usuario = administrador_sistema_usuario;
	}
	public String getAdministrador_sistema_senha() {
		return administrador_sistema_senha;
	}
	public void setAdministrador_sistema_senha(String administrador_sistema_senha) {
		this.administrador_sistema_senha = administrador_sistema_senha;
	}
	public String getAdministrador_sistema_email() {
		return administrador_sistema_email;
	}
	public void setAdministrador_sistema_email(String administrador_sistema_email) {
		this.administrador_sistema_email = administrador_sistema_email;
	}
	public String getAdministrador_sistema_telefone() {
		return administrador_sistema_telefone;
	}
	public void setAdministrador_sistema_telefone(String administrador_sistema_telefone) {
		this.administrador_sistema_telefone = administrador_sistema_telefone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((administrador_sistema_email == null) ? 0 : administrador_sistema_email.hashCode());
		result = prime * result + ((administrador_sistema_id == null) ? 0 : administrador_sistema_id.hashCode());
		result = prime * result + ((administrador_sistema_nome == null) ? 0 : administrador_sistema_nome.hashCode());
		result = prime * result + ((administrador_sistema_senha == null) ? 0 : administrador_sistema_senha.hashCode());
		result = prime * result
				+ ((administrador_sistema_telefone == null) ? 0 : administrador_sistema_telefone.hashCode());
		result = prime * result
				+ ((administrador_sistema_usuario == null) ? 0 : administrador_sistema_usuario.hashCode());
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
		Administrador_Sistema other = (Administrador_Sistema) obj;
		if (administrador_sistema_email == null) {
			if (other.administrador_sistema_email != null)
				return false;
		} else if (!administrador_sistema_email.equals(other.administrador_sistema_email))
			return false;
		if (administrador_sistema_id == null) {
			if (other.administrador_sistema_id != null)
				return false;
		} else if (!administrador_sistema_id.equals(other.administrador_sistema_id))
			return false;
		if (administrador_sistema_nome == null) {
			if (other.administrador_sistema_nome != null)
				return false;
		} else if (!administrador_sistema_nome.equals(other.administrador_sistema_nome))
			return false;
		if (administrador_sistema_senha == null) {
			if (other.administrador_sistema_senha != null)
				return false;
		} else if (!administrador_sistema_senha.equals(other.administrador_sistema_senha))
			return false;
		if (administrador_sistema_telefone == null) {
			if (other.administrador_sistema_telefone != null)
				return false;
		} else if (!administrador_sistema_telefone.equals(other.administrador_sistema_telefone))
			return false;
		if (administrador_sistema_usuario == null) {
			if (other.administrador_sistema_usuario != null)
				return false;
		} else if (!administrador_sistema_usuario.equals(other.administrador_sistema_usuario))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Administrador_Sistema [administrador_sistema_nome=" + administrador_sistema_nome + "]";
	}
	public Administrador_Sistema(Long administrador_sistema_id, String administrador_sistema_nome,
			String administrador_sistema_usuario, String administrador_sistema_senha,
			String administrador_sistema_email, String administrador_sistema_telefone) {
		super();
		this.administrador_sistema_id = administrador_sistema_id;
		this.administrador_sistema_nome = administrador_sistema_nome;
		this.administrador_sistema_usuario = administrador_sistema_usuario;
		this.administrador_sistema_senha = administrador_sistema_senha;
		this.administrador_sistema_email = administrador_sistema_email;
		this.administrador_sistema_telefone = administrador_sistema_telefone;
	}
	public Administrador_Sistema() {
		
	}
	
	
}
