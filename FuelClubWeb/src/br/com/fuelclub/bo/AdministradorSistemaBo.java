package br.com.fuelclub.bo;

import static javax.faces.context.FacesContext.getCurrentInstance;

import java.io.IOException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.fuelclub.dao.AdministradorSistemaDao;
import br.com.fuelclub.entity.Administrador_Sistema;
public class AdministradorSistemaBo implements InterfaceBo<Administrador_Sistema>{

	AdministradorSistemaDao administradorSistemaDao = new AdministradorSistemaDao();
	private boolean exibeDialog;
	private String mensagem;
	
	public boolean isExibeDialog() {
		return exibeDialog;
	}

	public void setExibeDialog(boolean exibeDialog) {
		this.exibeDialog = exibeDialog;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public void salvar(Administrador_Sistema administradorSistema) throws Exception {
		if(existe(administradorSistema))
			throw new Exception("Administrador já cadastrado!");
		else
			administradorSistemaDao.salvar(administradorSistema);
	}

	@Override
	public List<Administrador_Sistema> listar() {
		return administradorSistemaDao.listas();
	}

	@Override
	public void editar(Administrador_Sistema administradorSistema) {
		administradorSistemaDao.editar(administradorSistema);
	}

	@Override
	public Administrador_Sistema getObjectTById(Long id) {
		return administradorSistemaDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Administrador_Sistema administradorSistema) {
		administradorSistemaDao.excluir(administradorSistema);
	}
	
	public Administrador_Sistema autenticarUsuario(Administrador_Sistema administrador){
		Administrador_Sistema administradores = administradorSistemaDao.listar(administrador);
		if(administradores != null){
			try{
				getCurrentInstance().getExternalContext().redirect("administrar.xhtml");
			} catch (IOException e){
				e.printStackTrace();
				FacesContext ctx = getCurrentInstance();
				ctx.addMessage("mensagensErro", new FacesMessage("Login Incorreto!"));
			}
			return administradores;
		}
		else
			return null;
	}
	
	public Administrador_Sistema recuperarSenha(Administrador_Sistema administrador){
		return administradorSistemaDao.recuperarSenha(administrador);
	}
	
	public boolean existe(Administrador_Sistema administrador){
		List<Administrador_Sistema> lista = (List<Administrador_Sistema>) new AdministradorSistemaDao().verificaCadastro(administrador);
		if(lista.size() > 0 ){
			return true;
		}
		else{
			return false;
		}
	}

}
