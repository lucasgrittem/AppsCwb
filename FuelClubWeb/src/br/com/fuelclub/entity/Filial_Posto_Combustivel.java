package br.com.fuelclub.entity;

import java.util.List;

public class Filial_Posto_Combustivel {
	
	
	public double filialPostoCombustivel_cnpj;
	public String filialPostoCombustivel_nomeFantasia;
	public String filialPostoCombustivel_rua;
	public int filialPostoCombustivel_numero;
	public String filialPostoCombustivel_bairro;
	public double filialPostoCombustivel_cep;
	public String filialPostoCombustivel_horarioFuncionamento;
	public String filialPostoCombustivel_email;
	public Cidade cidade;
	public Estado estado;
	public Pais pais;
	public Bandeira bandeira;
	public PostoCombustivel matriz;
	
	public List <Dias_Da_Semana> diasSemana;
	public List <Tipo_Pagamento> tipoPagamento;
	public List <Cartao> cartoesAceitos;
	
	
	// get e set
	
	
	public double getFilialPostoCombustivel_cnpj() {
		return filialPostoCombustivel_cnpj;
	}
	public void setFilialPostoCombustivel_cnpj(double filialPostoCombustivel_cnpj) {
		this.filialPostoCombustivel_cnpj = filialPostoCombustivel_cnpj;
	}
	public String getFilialPostoCombustivel_nomeFantasia() {
		return filialPostoCombustivel_nomeFantasia;
	}
	public void setFilialPostoCombustivel_nomeFantasia(String filialPostoCombustivel_nomeFantasia) {
		this.filialPostoCombustivel_nomeFantasia = filialPostoCombustivel_nomeFantasia;
	}
	public String getFilialPostoCombustivel_rua() {
		return filialPostoCombustivel_rua;
	}
	public void setFilialPostoCombustivel_rua(String filialPostoCombustivel_rua) {
		this.filialPostoCombustivel_rua = filialPostoCombustivel_rua;
	}
	public int getFilialPostoCombustivel_numero() {
		return filialPostoCombustivel_numero;
	}
	public void setFilialPostoCombustivel_numero(int filialPostoCombustivel_numero) {
		this.filialPostoCombustivel_numero = filialPostoCombustivel_numero;
	}
	public String getFilialPostoCombustivel_bairro() {
		return filialPostoCombustivel_bairro;
	}
	public void setFilialPostoCombustivel_bairro(String filialPostoCombustivel_bairro) {
		this.filialPostoCombustivel_bairro = filialPostoCombustivel_bairro;
	}
	public double getFilialPostoCombustivel_cep() {
		return filialPostoCombustivel_cep;
	}
	public void setFilialPostoCombustivel_cep(double filialPostoCombustivel_cep) {
		this.filialPostoCombustivel_cep = filialPostoCombustivel_cep;
	}
	public String getFilialPostoCombustivel_horarioFuncionamento() {
		return filialPostoCombustivel_horarioFuncionamento;
	}
	public void setFilialPostoCombustivel_horarioFuncionamento(String filialPostoCombustivel_horarioFuncionamento) {
		this.filialPostoCombustivel_horarioFuncionamento = filialPostoCombustivel_horarioFuncionamento;
	}
	public String getFilialPostoCombustivel_email() {
		return filialPostoCombustivel_email;
	}
	public void setFilialPostoCombustivel_email(String filialPostoCombustivel_email) {
		this.filialPostoCombustivel_email = filialPostoCombustivel_email;
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Bandeira getBandeira() {
		return bandeira;
	}
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	public PostoCombustivel getMatriz() {
		return matriz;
	}
	public void setMatriz(PostoCombustivel matriz) {
		this.matriz = matriz;
	}
	public List<Dias_Da_Semana> getDiasSemana() {
		return diasSemana;
	}
	public void setDiasSemana(List<Dias_Da_Semana> diasSemana) {
		this.diasSemana = diasSemana;
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
	
	
	
	
	
	

}
