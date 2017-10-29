package br.com.fuelclub.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table (name = "PostoCombustivel")
public class PostoCombustivel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long postoCombustivel_id;
	
	private String postoCombustivel_cnpj;
	private String postoCombustivel_nomeFantasia;
	private String postoCombustivel_rua;
	private int postoCombustivel_numero;
	private String postoCombustivel_bairro;
	private String postoCombustivel_cep;
	private String postoCombustivel_horarioFuncionamento;
	private String postoCombustivel_email;
	private String postoCombustivel_senha;
	private Boolean postoCombustivel_isFilial;
	@ManyToOne
	private Cidade cidade;
	@ManyToOne
	private Estado estado;
	@ManyToOne
	private Bandeira bandeira;
	@ManyToMany
	public List <Dias_Da_Semana> diasDaSemana;
	@ManyToMany
	public List <Tipo_Pagamento> tipoPagamento;
	@ManyToMany
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
	public Boolean getPostoCombustivel_isFilial() {
		return postoCombustivel_isFilial;
	}
	public void setPostoCombustivel_isFilial(Boolean postoCombustivel_isFilial) {
		this.postoCombustivel_isFilial = postoCombustivel_isFilial;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Bandeira getBandeira() {
		return bandeira;
	}
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	public List<Dias_Da_Semana> getDiasDaSemana() {
		return diasDaSemana;
	}
	public void setDiasDaSemana(List<Dias_Da_Semana> diasDaSemana) {
		this.diasDaSemana = diasDaSemana;
	}
	public List<Tipo_Pagamento> getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(List<Tipo_Pagamento> tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public List<Cartao> getCartoesAceitos() {
		return cartoesAceitos;
	}
	public void setCartoesAceitos(List<Cartao> cartoesAceitos) {
		this.cartoesAceitos = cartoesAceitos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bandeira == null) ? 0 : bandeira.hashCode());
		result = prime * result + ((cartoesAceitos == null) ? 0 : cartoesAceitos.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((diasDaSemana == null) ? 0 : diasDaSemana.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((postoCombustivel_bairro == null) ? 0 : postoCombustivel_bairro.hashCode());
		result = prime * result + ((postoCombustivel_cep == null) ? 0 : postoCombustivel_cep.hashCode());
		result = prime * result + ((postoCombustivel_cnpj == null) ? 0 : postoCombustivel_cnpj.hashCode());
		result = prime * result + ((postoCombustivel_email == null) ? 0 : postoCombustivel_email.hashCode());
		result = prime * result + ((postoCombustivel_horarioFuncionamento == null) ? 0
				: postoCombustivel_horarioFuncionamento.hashCode());
		result = prime * result + ((postoCombustivel_id == null) ? 0 : postoCombustivel_id.hashCode());
		result = prime * result + ((postoCombustivel_isFilial == null) ? 0 : postoCombustivel_isFilial.hashCode());
		result = prime * result
				+ ((postoCombustivel_nomeFantasia == null) ? 0 : postoCombustivel_nomeFantasia.hashCode());
		result = prime * result + postoCombustivel_numero;
		result = prime * result + ((postoCombustivel_rua == null) ? 0 : postoCombustivel_rua.hashCode());
		result = prime * result + ((postoCombustivel_senha == null) ? 0 : postoCombustivel_senha.hashCode());
		result = prime * result + ((tipoPagamento == null) ? 0 : tipoPagamento.hashCode());
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
		if (bandeira == null) {
			if (other.bandeira != null)
				return false;
		} else if (!bandeira.equals(other.bandeira))
			return false;
		if (cartoesAceitos == null) {
			if (other.cartoesAceitos != null)
				return false;
		} else if (!cartoesAceitos.equals(other.cartoesAceitos))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (diasDaSemana == null) {
			if (other.diasDaSemana != null)
				return false;
		} else if (!diasDaSemana.equals(other.diasDaSemana))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
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
		if (postoCombustivel_isFilial == null) {
			if (other.postoCombustivel_isFilial != null)
				return false;
		} else if (!postoCombustivel_isFilial.equals(other.postoCombustivel_isFilial))
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
		if (tipoPagamento == null) {
			if (other.tipoPagamento != null)
				return false;
		} else if (!tipoPagamento.equals(other.tipoPagamento))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PostoCombustivel [postoCombustivel_nomeFantasia=" + postoCombustivel_nomeFantasia + "]";
	}
	public PostoCombustivel(Long postoCombustivel_id, String postoCombustivel_cnpj,
			String postoCombustivel_nomeFantasia, String postoCombustivel_rua, int postoCombustivel_numero,
			String postoCombustivel_bairro, String postoCombustivel_cep, String postoCombustivel_horarioFuncionamento,
			String postoCombustivel_email, String postoCombustivel_senha, Boolean postoCombustivel_isFilial,
			Cidade cidade, Estado estado, Bandeira bandeira, List<Dias_Da_Semana> diasDaSemana,
			List<Tipo_Pagamento> tipoPagamento, List<Cartao> cartoesAceitos) {
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
		this.postoCombustivel_isFilial = postoCombustivel_isFilial;
		this.cidade = cidade;
		this.estado = estado;
		this.bandeira = bandeira;
		this.diasDaSemana = diasDaSemana;
		this.tipoPagamento = tipoPagamento;
		this.cartoesAceitos = cartoesAceitos;
	}
	public PostoCombustivel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
