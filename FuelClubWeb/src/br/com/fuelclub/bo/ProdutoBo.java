package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.ProdutoDao;
import br.com.fuelclub.entity.Produto;

public class ProdutoBo implements InterfaceBo<Produto>{

	ProdutoDao produtoFacade = new ProdutoDao();
	@Override
	public void salvar(Produto produto) throws Exception {
		try {
			produtoFacade.salvar(produto);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Produto> listar() {
		return produtoFacade.listas();
	}

	@Override
	public void editar(Produto produto) {
		produtoFacade.editar(produto);
	}

	@Override
	public Produto getObjectTById(Long id) {
		return produtoFacade.getObjectTById(id);
	}

	@Override
	public void excluir(Produto produto) {
		produtoFacade.excluir(produto);
	}

	public boolean existe(Produto produto){
		List<Produto> lista = new ProdutoDao().listar(produto);		
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}
}
