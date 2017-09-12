package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.FormaPagamentoDao;
import br.com.fuelclub.entity.Forma_Pagamento;

public class FormaPagamentoFacade implements InterfaceFacade<Forma_Pagamento>{

	@Override
	public void salvar(Forma_Pagamento formaPagamento) throws Exception {

		if(existe(formaPagamento)){

			throw new Exception("Esta forma de pagamento já existe");
			
		}else{
			
			new FormaPagamentoDao().salvar(formaPagamento);
			
		}
		
	}

	@Override
	public List<Forma_Pagamento> listar() {

		return new FormaPagamentoDao().listas();
		
	}

	@Override
	public void editar(Forma_Pagamento formaPagamento) {

		new FormaPagamentoDao().editar(formaPagamento);
		
	}

	@Override
	public Forma_Pagamento getObjectTById(Long id) {

		FormaPagamentoDao formaPagamentoDao = new FormaPagamentoDao();
		return formaPagamentoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Forma_Pagamento formaPagamento) {

		new FormaPagamentoDao().excluir(formaPagamento);
		
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
