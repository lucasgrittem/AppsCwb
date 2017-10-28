package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.FormaPagamentoDao;
import br.com.fuelclub.entity.Forma_Pagamento;

public class FormaPagamentoBo implements InterfaceBo<Forma_Pagamento>{

	FormaPagamentoDao formaPagamentoDao = new FormaPagamentoDao();
	@Override
	public void salvar(Forma_Pagamento formaPagamento) throws Exception {
		try {
			formaPagamentoDao.salvar(formaPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Forma_Pagamento> listar() {
		return formaPagamentoDao.listas();
		
	}

	@Override
	public void editar(Forma_Pagamento formaPagamento) {
		formaPagamentoDao.editar(formaPagamento);
	}

	@Override
	public Forma_Pagamento getObjectTById(Long id) {
		return formaPagamentoDao.getObjectTById(id);
	}

	@Override
	public void excluir(Forma_Pagamento formaPagamento) {
		formaPagamentoDao.excluir(formaPagamento);
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
