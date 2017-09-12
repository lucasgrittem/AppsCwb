package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.CartaoDao;
import br.com.fuelclub.entity.Cartao;

public class CartaoFacade implements InterfaceFacade<Cartao>{
	
	@Override
	public void salvar(Cartao cartao) throws Exception {

		if(existe(cartao)){

			throw new Exception("Este cartão já existe");
			
		}else{
			
			new CartaoDao().salvar(cartao);
			
		}
		
	}

	@Override
	public List<Cartao> listar() {

		return new CartaoDao().listas();
		
	}

	@Override
	public void editar(Cartao cartao) {

		new CartaoDao().editar(cartao);
		
	}

	@Override
	public Cartao getObjectTById(Long id) {

		CartaoDao cartaoDao = new CartaoDao();
		return cartaoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Cartao cartao) {

		new CartaoDao().excluir(cartao);
		
	}
	
	public boolean existe(Cartao cartao){
		
		List<Cartao> lista = new CartaoDao().listar(cartao);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
