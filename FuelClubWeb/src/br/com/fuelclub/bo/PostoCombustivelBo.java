package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.controller.Posto_CombustivelController;
import br.com.fuelclub.dao.PostoCombustivelDao;
import br.com.fuelclub.entity.PostoCombustivel;

public class PostoCombustivelBo implements InterfaceBo<PostoCombustivel>{

	PostoCombustivelDao postoCombustivelDao = new PostoCombustivelDao();
	@Override
	public void salvar(PostoCombustivel postoCombustivel) throws Exception {
		try {
			postoCombustivelDao.salvar(postoCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<PostoCombustivel> listar() {
		return postoCombustivelDao.listas();
	}

	@Override
	public void editar(PostoCombustivel postoCombustivel) {
		postoCombustivelDao.editar(postoCombustivel);
	}

	@Override
	public PostoCombustivel getObjectTById(Long id) {
		return postoCombustivelDao.getObjectTById(id);
	}

	@Override
	public void excluir(PostoCombustivel postoCombustivel) {
		postoCombustivelDao.excluir(postoCombustivel);
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
