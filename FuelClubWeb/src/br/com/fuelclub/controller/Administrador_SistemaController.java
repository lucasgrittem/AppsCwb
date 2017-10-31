package br.com.fuelclub.controller;

import static javax.faces.context.FacesContext.getCurrentInstance;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.HttpSession;

import br.com.fuelclub.bo.AdministradorSistemaBo;
import br.com.fuelclub.bo.CidadeBo;
import br.com.fuelclub.bo.EmpresaBo;
import br.com.fuelclub.bo.EstadoBo;
import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Cidade;
import br.com.fuelclub.entity.Empresa;
import br.com.fuelclub.entity.Estado;

@ManagedBean (name = "AdministradorSistemaBean")
@SessionScoped
public class Administrador_SistemaController implements Serializable{

	private static final long serialVersionUID = -403294298730029068L;

	private Administrador_Sistema administrador;
	private Administrador_Sistema administrador_novo;
	private Administrador_Sistema administrador_recuperar;
	private Estado estado;
	private List<Cidade> cidades;
	private HttpSession session;
	private FacesContext fc;
	
	public Administrador_Sistema getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador_Sistema administrador) {
		this.administrador = administrador;
	}
	public Administrador_Sistema getAdministrador_novo() {
		return administrador_novo;
	}
	public void setAdministrador_novo(Administrador_Sistema administrador_novo) {
		this.administrador_novo = administrador_novo;
	}
	public Administrador_Sistema getAdministrador_recuperar() {
		return administrador_recuperar;
	}
	public void setAdministrador_recuperar(Administrador_Sistema administrador_recuperar) {
		this.administrador_recuperar = administrador_recuperar;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public List<Cidade> getCidades() {
		return cidades;
	}
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	public FacesContext getFc() {
		return fc;
	}
	public void setFc(FacesContext fc) {
		this.fc = fc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Administrador_SistemaController(){
		administrador = new Administrador_Sistema();
		administrador_novo = new Administrador_Sistema();
		administrador_recuperar = new Administrador_Sistema();
	}
	
	public String salvar() throws Exception{
		fc = getCurrentInstance();
		AdministradorSistemaBo administradorSistemaBo;
		try{
			administradorSistemaBo = new AdministradorSistemaBo();
			administradorSistemaBo.salvar(administrador_novo);
		} catch (Exception e){
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			e.printStackTrace();
			return "empresa";
		}
		fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Administrador cadastrado com sucesso", "Sucesso"));
		administrador_novo = new Administrador_Sistema();
		return "sucesso";
	}
	
	public String recuperarSenha () throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("recuperarSenhaAdministrador.xhtml");
		return "recuperar";
	}
	
	public String salvarEditar() throws Exception{
		fc = getCurrentInstance();
		AdministradorSistemaBo administradorSistemaBo = new AdministradorSistemaBo();
		try{
			administradorSistemaBo = new AdministradorSistemaBo();
			administradorSistemaBo.salvar(administrador);

		}catch (Exception e){
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			return "administrador";
		}
		fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuário alterado com sucesso", "Sucesso"));
		return "sucesso";
	}
	
	public List<Estado> listarEstado(){
		return new EstadoBo().listar();
	}

	public List<Cidade> listarPorEstado (ValueChangeEvent evento){
		CidadeBo cidadeBo = new CidadeBo();
		estado = (Estado) evento.getNewValue();
		Long id;
		id = estado.getEstado_id();
		cidades = cidadeBo.listarPorEstado(id);
		return cidades;
	}

	public String alterarCadastro(){
		return "alterarCadastro";
	}
}
