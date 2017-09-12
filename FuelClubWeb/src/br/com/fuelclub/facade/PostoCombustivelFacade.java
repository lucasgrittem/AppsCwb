package br.com.fuelclub.facade;

import java.io.IOException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.fuelclub.bo.PostoCombustivelBo;
import br.com.fuelclub.dao.PostoCombustivelDao;
import br.com.fuelclub.entity.PostoCombustivel;

public class PostoCombustivelFacade implements InterfaceFacade<PostoCombustivel>{

	@Override
	public void salvar(PostoCombustivel postoCombustivel) throws Exception {

		if(existe(postoCombustivel)){

			throw new Exception("Este Posto de Combustível já foi cadastrado");
			
		}else{
			
			new PostoCombustivelDao().salvar(postoCombustivel);
			
		}
		
	}

	@Override
	public List<PostoCombustivel> listar() {

		return new PostoCombustivelDao().listas();
		
	}

	@Override
	public void editar(PostoCombustivel postoCombustivel) {

		new PostoCombustivelDao().editar(postoCombustivel);
		
	}

	@Override
	public PostoCombustivel getObjectTById(Long id) {

		PostoCombustivelDao postoCombustivelDao = new PostoCombustivelDao();
		return postoCombustivelDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(PostoCombustivel postoCombustivel) {

		new PostoCombustivelDao().excluir(postoCombustivel);
		
	}
	
	public PostoCombustivel autenticar(PostoCombustivel postoCombustivel){
		
		PostoCombustivelBo postocombustivelBo = new PostoCombustivelBo();
		PostoCombustivel postoCombustivelValida = postocombustivelBo.autenticar(postoCombustivel);
		
		if(postoCombustivelValida != null){
			try{
				
				FacesContext.getCurrentInstance().getExternalContext().redirect("administrar.xhtml");
				
			} catch (IOException e){
				
				e.printStackTrace();
				FacesContext ctx = FacesContext.getCurrentInstance();
				ctx.addMessage("mensagensErro", new FacesMessage("Login Incorreto!"));
			}
			return postoCombustivelValida;
		}
		else{
			
			System.out.println("Não pode logar");
			return null;
			
		}
		
	}
	
	public boolean existe(PostoCombustivel postoCombustivel){
		
		List<PostoCombustivel> lista = new PostoCombustivelDao().listar(postoCombustivel);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
