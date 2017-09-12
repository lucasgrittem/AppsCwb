package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.TipoCombustivelDao;
import br.com.fuelclub.entity.Tipo_Combustivel;
import br.com.fuelclub.facade.TipoCombustivelFacade;

public class TipoCombustivelBo implements InterfaceBo<Tipo_Combustivel>{

	@Override
	public void salvar(Tipo_Combustivel tipoCombustivel) throws Exception {

		TipoCombustivelFacade tipoCombustivelFacade = new TipoCombustivelFacade();
		try {
			tipoCombustivelFacade.salvar(tipoCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Tipo_Combustivel> listar() {

		TipoCombustivelFacade tipoCombustivelFacade = new TipoCombustivelFacade();
		return tipoCombustivelFacade.listar();
		
	}

	@Override
	public void editar(Tipo_Combustivel tipoCombustivel) {

		TipoCombustivelFacade tipoCombustivelFacade = new TipoCombustivelFacade();
		tipoCombustivelFacade.editar(tipoCombustivel);
		
	}

	@Override
	public Tipo_Combustivel getObjectTById(Long id) {
		
		TipoCombustivelFacade tipoCombustivelFacade = new TipoCombustivelFacade();
		return tipoCombustivelFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Tipo_Combustivel tipoCombustivel) {

		TipoCombustivelFacade tipoCombustivelFacade = new TipoCombustivelFacade();
		tipoCombustivelFacade.excluir(tipoCombustivel);
		
	}
	
	public boolean existe(Tipo_Combustivel tipoCombustivel){
		
		List<Tipo_Combustivel> lista = new TipoCombustivelDao().listar(tipoCombustivel);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}
	
}
