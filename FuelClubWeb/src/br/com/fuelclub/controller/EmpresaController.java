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

import br.com.fuelclub.bo.CidadeBo;
import br.com.fuelclub.bo.EmpresaBo;
import br.com.fuelclub.bo.EstadoBo;
import br.com.fuelclub.email.EmailJava;
import br.com.fuelclub.entity.Cidade;
import br.com.fuelclub.entity.Empresa;
import br.com.fuelclub.entity.Estado;

@ManagedBean(name = "EmpresaBean")
@SessionScoped
public class EmpresaController implements Serializable{

	private static final long serialVersionUID = -4204106460659777965L;

	private Empresa empresa;
	private Empresa empresaNovo;
	private Empresa empresaRecuperar;
	private Estado estado;
	private List<Cidade> cidades;
	private HttpSession session;
	private FacesContext fc;

	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Empresa getEmpresaNovo() {
		return empresaNovo;
	}
	public void setEmpresaNovo(Empresa empresaNovo) {
		this.empresaNovo = empresaNovo;
	}
	public Empresa getEmpresaRecuperar() {
		return empresaRecuperar;
	}
	public void setEmpresaRecuperar(Empresa empresaRecuperar) {
		this.empresaRecuperar = empresaRecuperar;
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

	public EmpresaController (){
		empresa = new Empresa();
		empresaNovo = new Empresa();
		empresaRecuperar = new Empresa();
	}

	public String salvar() throws Exception{
		fc = getCurrentInstance();
		EmpresaBo empresaBo;
		try{
			empresaBo = new EmpresaBo();
			empresaBo.salvar(empresaNovo);
		} catch (Exception e){
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			e.printStackTrace();
			return "empresa";
		}
		fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empresa cadastrada com sucesso", "Sucesso"));
		empresaNovo = new Empresa();
		return "sucesso";
	}

	public String recuperarSenha () throws IOException{
		FacesContext.getCurrentInstance().getExternalContext().redirect("recuperarSenhaAdministrador.xhtml");
		return "recuperar";
	}

	public String salvarEditar() throws Exception{
		fc = getCurrentInstance();
		EmpresaBo empresaBo;
		try{
			empresaBo = new EmpresaBo();
			empresaBo.editar(empresa);

		}catch (Exception e){
			fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			return "administrador";
		}
		fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuário alterado com sucesso", "Sucesso"));
		return "sucesso";
	}

	public String autenticar() throws IOException {
		EmpresaBo empresaBo = new EmpresaBo();
		this.empresa = empresaBo.autenticarUsuario(empresa);
		fc = FacesContext.getCurrentInstance();
		session = (HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("ADMINISTRADOR", this.empresa);
		if(this.empresa != null){
			return "sucesso";
		}
		else{
			empresa = new Empresa();
			fc = getCurrentInstance();
			fc.addMessage("mensagensErro", new FacesMessage("Login ou Senha Incorretos!"));
			return "loginAdm";

		}
	}

	public String recuperarSenhaEmpresa() throws IOException{
		EmpresaBo administradorBo = new EmpresaBo();
		this.empresa = administradorBo.recuperarSenha(empresaRecuperar);
		if(this.empresa != null){
			EmailJava emailJava = new EmailJava();
			emailJava.enviarEmailEmpresa(empresa);
			fc = getCurrentInstance();
			fc.addMessage("mensagensErro", new FacesMessage("Email enviado com sucesso! Enviado para: " + empresa.getEmpresa_email()));
			return "enviado";
		}
		else{
			FacesContext context = getCurrentInstance();
			context.addMessage("mensagensErro", new FacesMessage("Usuário não cadastrado"));
			return "erro";
		}
	}

	public String sair() throws IOException{
		empresa = new Empresa();
		fc = getCurrentInstance();
		session = (HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("EMPRESA", this.empresa);
		FacesContext.getCurrentInstance().getExternalContext().redirect("areaRestrita.xhtml");
		return "logoutAdm";
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
