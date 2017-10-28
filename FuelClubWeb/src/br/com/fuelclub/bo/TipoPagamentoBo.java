package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.TipoPagamentoDao;
import br.com.fuelclub.entity.Tipo_Pagamento;

public class TipoPagamentoBo implements InterfaceBo<Tipo_Pagamento>{

	TipoPagamentoDao tipoPagamentoDao = new TipoPagamentoDao();
	@Override
	public void salvar(Tipo_Pagamento tipoPagamento) throws Exception {

		try {
			tipoPagamentoDao.salvar(tipoPagamento);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Tipo_Pagamento> listar() {
		return tipoPagamentoDao.listas();
	}

	@Override
	public void editar(Tipo_Pagamento tipoPagamento) {
		tipoPagamentoDao.editar(tipoPagamento);
	}

	@Override
	public Tipo_Pagamento getObjectTById(Long id) {
		return tipoPagamentoDao.getObjectTById(id);
	}

	@Override
	public void excluir(Tipo_Pagamento tipoPagamento) {
		tipoPagamentoDao.excluir(tipoPagamento);
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
