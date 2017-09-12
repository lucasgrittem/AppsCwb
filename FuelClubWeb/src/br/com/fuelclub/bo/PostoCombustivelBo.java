package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.PostoCombustivelDao;
import br.com.fuelclub.entity.PostoCombustivel;
import br.com.fuelclub.facade.PostoCombustivelFacade;

public class PostoCombustivelBo implements InterfaceBo<PostoCombustivel>{

	@Override
	public void salvar(PostoCombustivel postoCombustivel) throws Exception {

		PostoCombustivelFacade postoCombustivelFacade = new PostoCombustivelFacade();
		try {
			postoCombustivelFacade.salvar(postoCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<PostoCombustivel> listar() {

		PostoCombustivelFacade postoCombustivelFacade = new PostoCombustivelFacade();
		return postoCombustivelFacade.listar();
		
	}

	@Override
	public void editar(PostoCombustivel postoCombustivel) {

		PostoCombustivelFacade postoCombustivelFacade = new PostoCombustivelFacade();
		postoCombustivelFacade.editar(postoCombustivel);
		
	}

	@Override
	public PostoCombustivel getObjectTById(Long id) {

		PostoCombustivelFacade postoCombustivelFacade = new PostoCombustivelFacade();
		return postoCombustivelFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(PostoCombustivel postoCombustivel) {

		PostoCombustivelFacade postoCombustivelFacade = new PostoCombustivelFacade();
		postoCombustivelFacade.excluir(postoCombustivel);
		
	}
	
	public PostoCombustivel autenticar (PostoCombustivel postoCombustivel){
		
		return new PostoCombustivelDao().autenticar(postoCombustivel);
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
