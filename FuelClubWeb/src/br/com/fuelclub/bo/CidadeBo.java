package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.CidadeDao;
import br.com.fuelclub.entity.Cidade;
import br.com.fuelclub.facade.CidadeFacade;

public class CidadeBo implements InterfaceBo<Cidade>{

	@Override
	public void salvar(Cidade cidade) throws Exception {

		CidadeFacade cidadeFacade = new CidadeFacade();
		try {
			cidadeFacade.salvar(cidade);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Cidade> listar() {

		CidadeFacade cidadeFacade = new CidadeFacade();
		return cidadeFacade.listar();
		
	}

	@Override
	public void editar(Cidade cidade) {

		CidadeFacade cidadeFacade = new CidadeFacade();
		cidadeFacade.editar(cidade);
		
	}

	@Override
	public Cidade getObjectTById(Long id) {

		CidadeFacade cidadeFacade = new CidadeFacade();
		return cidadeFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Cidade cidade) {

		CidadeFacade cidadeFacade = new CidadeFacade();
		cidadeFacade.excluir(cidade);
		
	}

	public boolean existe(Cidade cidade){
		
		List<Cidade> lista = new CidadeDao().listar(cidade);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

	

}
