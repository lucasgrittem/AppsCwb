package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.CombustivelDao;
import br.com.fuelclub.entity.Combustivel;
import br.com.fuelclub.facade.CombustivelFacade;

public class CombustivelBo implements InterfaceBo<Combustivel>{

	@Override
	public void salvar(Combustivel combustivel) throws Exception {
		
		CombustivelFacade combustivelFacade = new CombustivelFacade();
		try {
			combustivelFacade.salvar(combustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Combustivel> listar() {

		CombustivelFacade combustivelFacade = new CombustivelFacade();
		return combustivelFacade.listar();
		
	}

	@Override
	public void editar(Combustivel combustivel) {
		
		CombustivelFacade combustivelFacade = new CombustivelFacade();
		combustivelFacade.editar(combustivel);
		
	}

	@Override
	public Combustivel getObjectTById(Long id) {
		
		CombustivelFacade combustivelFacade = new CombustivelFacade();
		return combustivelFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Combustivel combustivel) {

		CombustivelFacade combustivelFacade = new CombustivelFacade();
		combustivelFacade.excluir(combustivel);
		
	}
	
	public boolean existe(Combustivel combustivel){
		
		List<Combustivel> lista = new CombustivelDao().listar(combustivel);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

	
}
