package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.ProdutoDao;
import br.com.fuelclub.entity.Produto;

public class ProdutoFacade implements InterfaceFacade<Produto>{

	@Override
	public void salvar(Produto produto) throws Exception {

		if(existe(produto)){

			throw new Exception("Este produto já existe");
			
		}else{
			
			new ProdutoDao().salvar(produto);
			
		}
		
	}

	@Override
	public List<Produto> listar() {

		return new ProdutoDao().listas();
		
	}

	@Override
	public void editar(Produto produto) {

		new ProdutoDao().editar(produto);
		
	}

	@Override
	public Produto getObjectTById(Long id) {

		ProdutoDao produtoDao = new ProdutoDao();
		return produtoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Produto produto) {

		new ProdutoDao().excluir(produto);
		
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
