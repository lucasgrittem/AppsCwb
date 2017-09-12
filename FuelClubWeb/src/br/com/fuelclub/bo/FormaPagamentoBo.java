package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.FormaPagamentoDao;
import br.com.fuelclub.entity.Forma_Pagamento;
import br.com.fuelclub.facade.FormaPagamentoFacade;

public class FormaPagamentoBo implements InterfaceBo<Forma_Pagamento>{

	@Override
	public void salvar(Forma_Pagamento formaPagamento) throws Exception {

		FormaPagamentoFacade formaPagamentoFacade = new FormaPagamentoFacade();
		try {
			formaPagamentoFacade.salvar(formaPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Forma_Pagamento> listar() {

		FormaPagamentoFacade formaPagamentoFacade = new FormaPagamentoFacade();
		return formaPagamentoFacade.listar();
		
	}

	@Override
	public void editar(Forma_Pagamento formaPagamento) {

		FormaPagamentoFacade formaPagamentoFacade = new FormaPagamentoFacade();
		formaPagamentoFacade.editar(formaPagamento);
		
	}

	@Override
	public Forma_Pagamento getObjectTById(Long id) {

		FormaPagamentoFacade formaPagamentoFacade = new FormaPagamentoFacade();
		return formaPagamentoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Forma_Pagamento formaPagamento) {

		FormaPagamentoFacade formaPagamentoFacade = new FormaPagamentoFacade();
		formaPagamentoFacade.excluir(formaPagamento);
		
	}

	public boolean existe(Forma_Pagamento formaPagamento){
		
		List<Forma_Pagamento> lista = new FormaPagamentoDao().listar(formaPagamento);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}	

}
