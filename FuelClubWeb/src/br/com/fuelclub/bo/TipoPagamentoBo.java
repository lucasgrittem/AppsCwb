package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.TipoPagamentoDao;
import br.com.fuelclub.entity.Tipo_Pagamento;
import br.com.fuelclub.facade.TipoPagamentoFacade;

public class TipoPagamentoBo implements InterfaceBo<Tipo_Pagamento>{

	@Override
	public void salvar(Tipo_Pagamento tipoPagamento) throws Exception {

		TipoPagamentoFacade tipoPagamentoFacade = new TipoPagamentoFacade();
		try {
			tipoPagamentoFacade.salvar(tipoPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Tipo_Pagamento> listar() {

		TipoPagamentoFacade tipoPagamentoFacade = new TipoPagamentoFacade();
		return tipoPagamentoFacade.listar();
		
	}

	@Override
	public void editar(Tipo_Pagamento tipoPagamento) {

		TipoPagamentoFacade tipoPagamentoFacade = new TipoPagamentoFacade();
		tipoPagamentoFacade.editar(tipoPagamento);
		
	}

	@Override
	public Tipo_Pagamento getObjectTById(Long id) {

		TipoPagamentoFacade tipoPagamentoFacade = new TipoPagamentoFacade();
		return tipoPagamentoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Tipo_Pagamento tipoPagamento) {

		TipoPagamentoFacade tipoPagamentoFacade = new TipoPagamentoFacade();
		tipoPagamentoFacade.excluir(tipoPagamento);
		
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
