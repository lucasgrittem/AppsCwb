package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.TipoCombustivelDao;
import br.com.fuelclub.entity.Tipo_Combustivel;

public class TipoCombustivelFacade implements InterfaceFacade<Tipo_Combustivel>{

	@Override
	public void salvar(Tipo_Combustivel tipoCombustivel) throws Exception {

		if(existe(tipoCombustivel)){

			throw new Exception("Este tipo de combustivel já existe");
			
		}else{
			
			new TipoCombustivelDao().salvar(tipoCombustivel);
			
		}
		
	}

	@Override
	public List<Tipo_Combustivel> listar() {

		return new TipoCombustivelDao().listas();
		
	}

	@Override
	public void editar(Tipo_Combustivel tipoCombustivel) {

		new TipoCombustivelDao().editar(tipoCombustivel);
		
	}

	@Override
	public Tipo_Combustivel getObjectTById(Long id) {

		TipoCombustivelDao tipoCombustivelDao = new TipoCombustivelDao();
		return tipoCombustivelDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Tipo_Combustivel tipoCombustivel) {

		new TipoCombustivelDao().excluir(tipoCombustivel);
		
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
