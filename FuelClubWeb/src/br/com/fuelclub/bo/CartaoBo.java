package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.CartaoDao;
import br.com.fuelclub.entity.Cartao;
import br.com.fuelclub.facade.CartaoFacade;

public class CartaoBo implements InterfaceBo<Cartao>{

	@Override
	public void salvar(Cartao cartao) throws Exception {

		CartaoFacade cartaoFacade = new CartaoFacade();
		try {
			cartaoFacade.salvar(cartao);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Cartao> listar() {

		CartaoFacade cartaoFacade = new CartaoFacade();
		return cartaoFacade.listar();
		
	}

	@Override
	public void editar(Cartao cartao) {

		CartaoFacade cartaoFacade = new CartaoFacade();
		cartaoFacade.editar(cartao);
		
	}

	@Override
	public Cartao getObjectTById(Long id) {

		CartaoFacade cartaoFacade = new CartaoFacade();
		return cartaoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Cartao cartao) {
		
		CartaoFacade cartaoFacade = new CartaoFacade();
		cartaoFacade.excluir(cartao);
		
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
