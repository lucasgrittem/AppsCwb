package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.CartaoDao;
import br.com.fuelclub.entity.Cartao;

public class CartaoBo implements InterfaceBo<Cartao>{

	CartaoDao cartaoBo = new CartaoDao();
	
	@Override
	public void salvar(Cartao cartao) throws Exception {
		try {
			cartaoBo.salvar(cartao);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Cartao> listar() {
		return cartaoBo.listas();
		
	}

	@Override
	public void editar(Cartao cartao) {
		cartaoBo.editar(cartao);
	}

	@Override
	public Cartao getObjectTById(Long id) {
		return cartaoBo.getObjectTById(id);
	}

	@Override
	public void excluir(Cartao cartao) {
		cartaoBo.excluir(cartao);
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
