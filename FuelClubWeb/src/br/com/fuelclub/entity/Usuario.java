package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long usario_id;
	
	private String usuario_nome;
	private String usuario_login;
	private String usuario_email;
	private String usuario_cpf;
	private String usuario_telefone;
	@ManyToMany
	private List<PostoCombustivel> postos;
	
	public Long getUsario_id() {
		return usario_id;
	}
	public void setUsario_id(Long usario_id) {
		this.usario_id = usario_id;
	}
	public String getUsuario_nome() {
		return usuario_nome;
	}
	public void setUsuario_nome(String usuario_nome) {
		this.usuario_nome = usuario_nome;
	}
	public String getUsuario_login() {
		return usuario_login;
	}
	public void setUsuario_login(String usuario_login) {
		this.usuario_login = usuario_login;
	}
	public String getUsuario_email() {
		return usuario_email;
	}
	public void setUsuario_email(String usuario_email) {
		this.usuario_email = usuario_email;
	}
	public String getUsuario_cpf() {
		return usuario_cpf;
	}
	public void setUsuario_cpf(String usuario_cpf) {
		this.usuario_cpf = usuario_cpf;
	}
	public String getUsuario_telefone() {
		return usuario_telefone;
	}
	public void setUsuario_telefone(String usuario_telefone) {
		this.usuario_telefone = usuario_telefone;
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
		result = prime * result + ((postos == null) ? 0 : postos.hashCode());
		result = prime * result + ((usario_id == null) ? 0 : usario_id.hashCode());
		result = prime * result + ((usuario_cpf == null) ? 0 : usuario_cpf.hashCode());
		result = prime * result + ((usuario_email == null) ? 0 : usuario_email.hashCode());
		result = prime * result + ((usuario_login == null) ? 0 : usuario_login.hashCode());
		result = prime * result + ((usuario_nome == null) ? 0 : usuario_nome.hashCode());
		result = prime * result + ((usuario_telefone == null) ? 0 : usuario_telefone.hashCode());
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
		Usuario other = (Usuario) obj;
		if (postos == null) {
			if (other.postos != null)
				return false;
		} else if (!postos.equals(other.postos))
			return false;
		if (usario_id == null) {
			if (other.usario_id != null)
				return false;
		} else if (!usario_id.equals(other.usario_id))
			return false;
		if (usuario_cpf == null) {
			if (other.usuario_cpf != null)
				return false;
		} else if (!usuario_cpf.equals(other.usuario_cpf))
			return false;
		if (usuario_email == null) {
			if (other.usuario_email != null)
				return false;
		} else if (!usuario_email.equals(other.usuario_email))
			return false;
		if (usuario_login == null) {
			if (other.usuario_login != null)
				return false;
		} else if (!usuario_login.equals(other.usuario_login))
			return false;
		if (usuario_nome == null) {
			if (other.usuario_nome != null)
				return false;
		} else if (!usuario_nome.equals(other.usuario_nome))
			return false;
		if (usuario_telefone == null) {
			if (other.usuario_telefone != null)
				return false;
		} else if (!usuario_telefone.equals(other.usuario_telefone))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [usario_id=" + usario_id + ", usuario_nome=" + usuario_nome + ", usuario_login=" + usuario_login
				+ ", usuario_email=" + usuario_email + ", usuario_cpf=" + usuario_cpf + ", usuario_telefone="
				+ usuario_telefone + ", postos=" + postos + "]";
	}
	public Usuario(Long usario_id, String usuario_nome, String usuario_login, String usuario_email, String usuario_cpf,
			String usuario_telefone, List<PostoCombustivel> postos) {
		super();
		this.usario_id = usario_id;
		this.usuario_nome = usuario_nome;
		this.usuario_login = usuario_login;
		this.usuario_email = usuario_email;
		this.usuario_cpf = usuario_cpf;
		this.usuario_telefone = usuario_telefone;
		this.postos = postos;
	}
	public Usuario() {
		super();
	}
 
}
