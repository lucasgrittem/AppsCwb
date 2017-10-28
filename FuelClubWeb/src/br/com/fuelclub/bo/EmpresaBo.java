package br.com.fuelclub.bo;

import static javax.faces.context.FacesContext.getCurrentInstance;

import java.io.IOException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import br.com.fuelclub.dao.EmpresaDao;
import br.com.fuelclub.entity.Empresa;

public class EmpresaBo implements InterfaceBo<Empresa> {

	private boolean exibeDialog;
	private String mensagem;
	EmpresaDao empresaDao = new EmpresaDao();
	
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
	public void salvar(Empresa empresa) throws Exception {
		if(existe(empresa)){
			throw new Exception("Usuário já cadastrado");
		}else{
			empresaDao.salvar(empresa);
		}
	}

	@Override
	public List<Empresa> listar() {
		return empresaDao.listas();
	}

	@Override
	public void editar(Empresa empresa) {
		empresaDao.editar(empresa);
	}

	@Override
	public Empresa getObjectTById(Long id) {
		return empresaDao.getObjectTById(id);
	}

	@Override
	public void excluir(Empresa empresa) {
		empresaDao.excluir(empresa);
	}
	
	public Empresa autenticarUsuario(Empresa empresa){
		Empresa empresas = empresaDao.listar(empresa);
		if(empresas != null){
			try{
				getCurrentInstance().getExternalContext().redirect("principal.xhtml");
			} catch (IOException e){
				e.printStackTrace();
				FacesContext ctx = getCurrentInstance();
				ctx.addMessage("mensagensErro", new FacesMessage("Login Incorreto!"));
			}
			return empresas;
		}
		else{
			return null;
		}
	}
	
	public Empresa recuperarSenha(Empresa empresa){
		return empresaDao.recuperarSenha(empresa);
	}
	
	public boolean existe(Empresa empresa){
		List<Empresa> lista = (List<Empresa>) new EmpresaDao().verificaCadastro(empresa);
		if(lista.size() > 0 ){
			return true;
		}
		else{
			return false;
		}
	}

}
