package br.com.fuelclub.controller;

import static javax.faces.context.FacesContext.getCurrentInstance;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.fuelclub.bo.BandeiraBo;
import br.com.fuelclub.entity.Bandeira;

@ManagedBean (name = "BandeiraBean")
public class BandeiraController implements Serializable{

	private static final long serialVersionUID = -3683001519206476882L;
	private Bandeira bandeira;
	private HttpSession session;
	FacesContext context = FacesContext.getCurrentInstance();
	public Bandeira getBandeira() {
		return bandeira;
	}
	public void setBandeira(Bandeira bandeira) {
		this.bandeira = bandeira;
	}
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		this.session = session;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BandeiraController (){
		bandeira = new Bandeira();
	}
	public String salvar(){
		context = getCurrentInstance();
		BandeiraBo bandeiraBo;
		try{
			bandeiraBo = new BandeiraBo();
			bandeiraBo.salvar(bandeira);
		} catch (Exception e){
			context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(),""));
			return "candidato";
		}
		return "sucesso";
	}
}
