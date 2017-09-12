package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.TipoPagamentoDao;
import br.com.fuelclub.entity.Tipo_Pagamento;

public class TipoPagamentoFacade implements InterfaceFacade<Tipo_Pagamento>{

	@Override
	public void salvar(Tipo_Pagamento tipoPagamento) throws Exception {

		if(existe(tipoPagamento)){

			throw new Exception("Este tipo de pagamento já existe");
			
		}else{
			
			new TipoPagamentoDao().salvar(tipoPagamento);
			
		}
		
	}

	@Override
	public List<Tipo_Pagamento> listar() {

		return new TipoPagamentoDao().listas();
		
	}

	@Override
	public void editar(Tipo_Pagamento tipoPagamento) {

		new TipoPagamentoDao().editar(tipoPagamento);
		
	}

	@Override
	public Tipo_Pagamento getObjectTById(Long id) {

		TipoPagamentoDao tipoPagamentoDao = new TipoPagamentoDao();
		return tipoPagamentoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Tipo_Pagamento tipoPagamento) {

		new TipoPagamentoDao().excluir(tipoPagamento);
		
	}
	
	public boolean existe(Tipo_Pagamento tipoPagamento){
		
		List<Tipo_Pagamento> lista = new TipoPagamentoDao().listar(tipoPagamento);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
