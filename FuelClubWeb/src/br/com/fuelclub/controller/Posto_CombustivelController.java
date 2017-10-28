package br.com.fuelclub.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;


import br.com.fuelclub.bo.PostoCombustivelBo;
import br.com.fuelclub.entity.PostoCombustivel;

@ManagedBean (name = "Posto_CombustivelBean")
@SessionScoped
public class Posto_CombustivelController implements Serializable {

	
	private static final long serialVersionUID = 2196835619619492603L;

	private PostoCombustivel posto_Combustivel;

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
		
		FacesContext context = FacesContext.getCurrentInstance();
		PostoCombustivelBo postoCombustivelBo;
				
		try{
			postoCombustivelBo = new PostoCombustivelBo();
			postoCombustivelBo.salvar(posto_Combustivel);
		} catch (Exception e){
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			
			return "candidato";
		}
		
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Realize seu primeiro acesso e conclua seu cadastro!", "Realize o acesso!"));
		
		return "sucesso";
		
	
		
	}
	
	public String autenticar() throws IOException {
		
		PostoCombustivelBo postoCombustivelBo = new PostoCombustivelBo();
		this.posto_Combustivel = postoCombustivelBo.autenticar(posto_Combustivel);
		
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
		session.setAttribute("POSTO_COMBUSTIVEL", this.posto_Combustivel);
		
		if(this.posto_Combustivel != null){
			
			return "sucesso";
		}
		else{
			
			posto_Combustivel = new PostoCombustivel();
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage("mensagensErro", new FacesMessage("Login ou Senha Incorretos!"));
			
			return "loginAdm";
			
		}
	}
	
	public String novoCadastro() throws IOException{
		
		FacesContext.getCurrentInstance().getExternalContext().redirect("novoCadastro.xhtml");
		
		return "novo";
		
		
		
	}
	public String sair() throws IOException{
		
		posto_Combustivel = new PostoCombustivel();
		
		FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
		
		return "logout";
	}


	
}
