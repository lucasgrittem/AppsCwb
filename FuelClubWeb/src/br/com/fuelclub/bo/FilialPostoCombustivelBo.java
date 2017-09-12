package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.FilialPostoCombustivelDao;
import br.com.fuelclub.entity.Filial_Posto_Combustivel;
import br.com.fuelclub.facade.FilialPostoCombustivelFacade;

public class FilialPostoCombustivelBo implements InterfaceBo<Filial_Posto_Combustivel>{

	@Override
	public void salvar(Filial_Posto_Combustivel filialPostoCombustivel) throws Exception {

		FilialPostoCombustivelFacade filialPostoCombustivelFacade = new FilialPostoCombustivelFacade();
		try {
			filialPostoCombustivelFacade.salvar(filialPostoCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Filial_Posto_Combustivel> listar() {

		FilialPostoCombustivelFacade filialPostoCombustivelFacade = new FilialPostoCombustivelFacade();
		return filialPostoCombustivelFacade.listar();
		
	}

	@Override
	public void editar(Filial_Posto_Combustivel filialPostoCombustivel) {

		FilialPostoCombustivelFacade filialPostoCombustivelFacade = new FilialPostoCombustivelFacade();
		filialPostoCombustivelFacade.editar(filialPostoCombustivel);
		
	}

	@Override
	public Filial_Posto_Combustivel getObjectTById(Long id) {

		FilialPostoCombustivelFacade filialPostoCombustivelFacade = new FilialPostoCombustivelFacade();
		return filialPostoCombustivelFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Filial_Posto_Combustivel filialPostoCombustivel) {

		FilialPostoCombustivelFacade filialPostoCombustivelFacade = new FilialPostoCombustivelFacade();
		filialPostoCombustivelFacade.excluir(filialPostoCombustivel);
		
	}

	public boolean existe(Filial_Posto_Combustivel filialPostoCombustivel){
		
		List<Filial_Posto_Combustivel> lista = new FilialPostoCombustivelDao().listar(filialPostoCombustivel);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
