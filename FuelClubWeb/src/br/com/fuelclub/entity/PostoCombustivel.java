package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "PostoCombustivel")
public class PostoCombustivel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long postoCombustivel_id;
	
	public String postoCombustivel_cnpj;
	public String postoCombustivel_nomeFantasia;
	public String postoCombustivel_rua;
	public int postoCombustivel_numero;
	public String postoCombustivel_bairro;
	public String postoCombustivel_cep;
	public String postoCombustivel_horarioFuncionamento;
	public String postoCombustivel_email;
	public String postoCombustivel_senha;
	public Cidade cidade;
	public Estado estado;
	public Pais pais;
	public Bandeira bandeira;
	
	public List <Dias_Da_Semana> diasDaSemana;
	public List <Tipo_Pagamento> tipoPagamento;
	public List <Cartao> cartoesAceitos;
	
	public Long getPostoCombustivel_id() {
		return postoCombustivel_id;
	}
	public void setPostoCombustivel_id(Long postoCombustivel_id) {
		this.postoCombustivel_id = postoCombustivel_id;
	}
	public String getPostoCombustivel_cnpj() {
		return postoCombustivel_cnpj;
	}
	public void setPostoCombustivel_cnpj(String postoCombustivel_cnpj) {
		this.postoCombustivel_cnpj = postoCombustivel_cnpj;
	}
	public String getPostoCombustivel_nomeFantasia() {
		return postoCombustivel_nomeFantasia;
	}
	public void setPostoCombustivel_nomeFantasia(String postoCombustivel_nomeFantasia) {
		this.postoCombustivel_nomeFantasia = postoCombustivel_nomeFantasia;
	}
	public String getPostoCombustivel_rua() {
		return postoCombustivel_rua;
	}
	public void setPostoCombustivel_rua(String postoCombustivel_rua) {
		this.postoCombustivel_rua = postoCombustivel_rua;
	}
	public int getPostoCombustivel_numero() {
		return postoCombustivel_numero;
	}
	public void setPostoCombustivel_numero(int postoCombustivel_numero) {
		this.postoCombustivel_numero = postoCombustivel_numero;
	}
	public String getPostoCombustivel_bairro() {
		return postoCombustivel_bairro;
	}
	public void setPostoCombustivel_bairro(String postoCombustivel_bairro) {
		this.postoCombustivel_bairro = postoCombustivel_bairro;
	}
	public String getPostoCombustivel_cep() {
		return postoCombustivel_cep;
	}
	public void setPostoCombustivel_cep(String postoCombustivel_cep) {
		this.postoCombustivel_cep = postoCombustivel_cep;
	}
	public String getPostoCombustivel_horarioFuncionamento() {
		return postoCombustivel_horarioFuncionamento;
	}
	public void setPostoCombustivel_horarioFuncionamento(String postoCombustivel_horarioFuncionamento) {
		this.postoCombustivel_horarioFuncionamento = postoCombustivel_horarioFuncionamento;
	}
	public String getPostoCombustivel_email() {
		return postoCombustivel_email;
	}
	public void setPostoCombustivel_email(String postoCombustivel_email) {
		this.postoCombustivel_email = postoCombustivel_email;
	}
	public String getPostoCombustivel_senha() {
		return postoCombustivel_senha;
	}
	public void setPostoCombustivel_senha(String postoCombustivel_senha) {
		this.postoCombustivel_senha = postoCombustivel_senha;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((postoCombustivel_bairro == null) ? 0 : postoCombustivel_bairro.hashCode());
		result = prime * result + ((postoCombustivel_cep == null) ? 0 : postoCombustivel_cep.hashCode());
		result = prime * result + ((postoCombustivel_cnpj == null) ? 0 : postoCombustivel_cnpj.hashCode());
		result = prime * result + ((postoCombustivel_email == null) ? 0 : postoCombustivel_email.hashCode());
		result = prime * result + ((postoCombustivel_horarioFuncionamento == null) ? 0
				: postoCombustivel_horarioFuncionamento.hashCode());
		result = prime * result + ((postoCombustivel_id == null) ? 0 : postoCombustivel_id.hashCode());
		result = prime * result
				+ ((postoCombustivel_nomeFantasia == null) ? 0 : postoCombustivel_nomeFantasia.hashCode());
		result = prime * result + postoCombustivel_numero;
		result = prime * result + ((postoCombustivel_rua == null) ? 0 : postoCombustivel_rua.hashCode());
		result = prime * result + ((postoCombustivel_senha == null) ? 0 : postoCombustivel_senha.hashCode());
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
		PostoCombustivel other = (PostoCombustivel) obj;
		if (postoCombustivel_bairro == null) {
			if (other.postoCombustivel_bairro != null)
				return false;
		} else if (!postoCombustivel_bairro.equals(other.postoCombustivel_bairro))
			return false;
		if (postoCombustivel_cep == null) {
			if (other.postoCombustivel_cep != null)
				return false;
		} else if (!postoCombustivel_cep.equals(other.postoCombustivel_cep))
			return false;
		if (postoCombustivel_cnpj == null) {
			if (other.postoCombustivel_cnpj != null)
				return false;
		} else if (!postoCombustivel_cnpj.equals(other.postoCombustivel_cnpj))
			return false;
		if (postoCombustivel_email == null) {
			if (other.postoCombustivel_email != null)
				return false;
		} else if (!postoCombustivel_email.equals(other.postoCombustivel_email))
			return false;
		if (postoCombustivel_horarioFuncionamento == null) {
			if (other.postoCombustivel_horarioFuncionamento != null)
				return false;
		} else if (!postoCombustivel_horarioFuncionamento.equals(other.postoCombustivel_horarioFuncionamento))
			return false;
		if (postoCombustivel_id == null) {
			if (other.postoCombustivel_id != null)
				return false;
		} else if (!postoCombustivel_id.equals(other.postoCombustivel_id))
			return false;
		if (postoCombustivel_nomeFantasia == null) {
			if (other.postoCombustivel_nomeFantasia != null)
				return false;
		} else if (!postoCombustivel_nomeFantasia.equals(other.postoCombustivel_nomeFantasia))
			return false;
		if (postoCombustivel_numero != other.postoCombustivel_numero)
			return false;
		if (postoCombustivel_rua == null) {
			if (other.postoCombustivel_rua != null)
				return false;
		} else if (!postoCombustivel_rua.equals(other.postoCombustivel_rua))
			return false;
		if (postoCombustivel_senha == null) {
			if (other.postoCombustivel_senha != null)
				return false;
		} else if (!postoCombustivel_senha.equals(other.postoCombustivel_senha))
			return false;
		return true;
	}
	public PostoCombustivel(Long postoCombustivel_id, String postoCombustivel_cnpj,
			String postoCombustivel_nomeFantasia, String postoCombustivel_rua, int postoCombustivel_numero,
			String postoCombustivel_bairro, String postoCombustivel_cep, String postoCombustivel_horarioFuncionamento,
			String postoCombustivel_email, String postoCombustivel_senha) {
		super();
		this.postoCombustivel_id = postoCombustivel_id;
		this.postoCombustivel_cnpj = postoCombustivel_cnpj;
		this.postoCombustivel_nomeFantasia = postoCombustivel_nomeFantasia;
		this.postoCombustivel_rua = postoCombustivel_rua;
		this.postoCombustivel_numero = postoCombustivel_numero;
		this.postoCombustivel_bairro = postoCombustivel_bairro;
		this.postoCombustivel_cep = postoCombustivel_cep;
		this.postoCombustivel_horarioFuncionamento = postoCombustivel_horarioFuncionamento;
		this.postoCombustivel_email = postoCombustivel_email;
		this.postoCombustivel_senha = postoCombustivel_senha;
	}
	public PostoCombustivel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
