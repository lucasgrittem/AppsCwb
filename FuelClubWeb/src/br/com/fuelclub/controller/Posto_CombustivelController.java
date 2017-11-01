package br.com.fuelclub.controller;

import static javax.faces.context.FacesContext.getCurrentInstance;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.http.HttpSession;

import br.com.fuelclub.bo.CidadeBo;
import br.com.fuelclub.bo.EstadoBo;
import br.com.fuelclub.bo.PostoCombustivelBo;
import br.com.fuelclub.entity.Cidade;
import br.com.fuelclub.entity.Empresa;
import br.com.fuelclub.entity.Estado;
import br.com.fuelclub.entity.PostoCombustivel;

@ManagedBean (name = "Posto_CombustivelBean")
@SessionScoped
public class Posto_CombustivelController implements Serializable {
	
	private Estado estado;
	private List<Cidade> cidades;
	private HttpSession session;
	private static final long serialVersionUID = 2196835619619492603L;
	private PostoCombustivel posto_Combustivel;
	FacesContext context = FacesContext.getCurrentInstance();
	@ManagedProperty("#{EmpresaBean}")
	private EmpresaController empresaBean;

	public EmpresaController getEmpresaBean() {
		return empresaBean;
	}
	public void setEmpresaBean(EmpresaController empresaBean) {
		this.empresaBean = empresaBean;
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

	public FacesContext getContext() {
		return context;
	}

	public void setContext(FacesContext context) {
		this.context = context;
	}

	public PostoCombustivel getPosto_Combustivel() {
		return posto_Combustivel;
	}

	public void setPosto_Combustivel(PostoCombustivel postoCombustivel) {
		this.posto_Combustivel = postoCombustivel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Posto_CombustivelController(){
		posto_Combustivel = new PostoCombustivel();
	}
	
	public String salvar(){
		context = getCurrentInstance();
		PostoCombustivelBo postoCombustivelBo;
		try{
			postoCombustivelBo = new PostoCombustivelBo();
			postoCombustivelBo.salvar(posto_Combustivel);
		} catch (Exception e){
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			return "candidato";
		}
		return "sucesso";
	}
	
	public String novoCadastro() throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("cadastrarPosto.xhtml");
		return "novo";
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
}
