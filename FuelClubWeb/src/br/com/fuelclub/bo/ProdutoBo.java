package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.ProdutoDao;
import br.com.fuelclub.entity.Produto;
import br.com.fuelclub.facade.ProdutoFacade;

public class ProdutoBo implements InterfaceBo<Produto>{

	@Override
	public void salvar(Produto produto) throws Exception {

		ProdutoFacade produtoFacade = new ProdutoFacade();
		try {
			produtoFacade.salvar(produto);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Produto> listar() {

		ProdutoFacade produtoFacade = new ProdutoFacade();
		return produtoFacade.listar();
		
	}

	@Override
	public void editar(Produto produto) {

		ProdutoFacade produtoFacade = new ProdutoFacade();
		produtoFacade.editar(produto);
		
	}

	@Override
	public Produto getObjectTById(Long id) {

		ProdutoFacade produtoFacade = new ProdutoFacade();
		return produtoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Produto produto) {

		ProdutoFacade produtoFacade = new ProdutoFacade();
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
