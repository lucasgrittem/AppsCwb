package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.FilialPostoCombustivelDao;
import br.com.fuelclub.entity.Filial_Posto_Combustivel;

public class FilialPostoCombustivelFacade implements InterfaceFacade<Filial_Posto_Combustivel>{

	@Override
	public void salvar(Filial_Posto_Combustivel filialPostoCombustivel) throws Exception {

		if(existe(filialPostoCombustivel)){

			throw new Exception("Esta filial de posto já existe");
			
		}else{
			
			new FilialPostoCombustivelDao().salvar(filialPostoCombustivel);
			
		}
		
	}

	@Override
	public List<Filial_Posto_Combustivel> listar() {
		
		return new FilialPostoCombustivelDao().listas();
		
	}

	@Override
	public void editar(Filial_Posto_Combustivel filialPostoCombustivel) {

		new FilialPostoCombustivelDao().editar(filialPostoCombustivel);
		
	}

	@Override
	public Filial_Posto_Combustivel getObjectTById(Long id) {

		FilialPostoCombustivelDao filialPostoCombustivelDao = new FilialPostoCombustivelDao();
		return filialPostoCombustivelDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Filial_Posto_Combustivel filialPostoCombustivel) {

		new FilialPostoCombustivelDao().excluir(filialPostoCombustivel);
		
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
