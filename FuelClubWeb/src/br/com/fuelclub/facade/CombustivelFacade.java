package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.CombustivelDao;
import br.com.fuelclub.entity.Combustivel;

public class CombustivelFacade implements InterfaceFacade<Combustivel>{

	@Override
	public void salvar(Combustivel combustivel) throws Exception {

		if(existe(combustivel)){

			throw new Exception("Este combustivel já existe");
			
		}else{
			
			new CombustivelDao().salvar(combustivel);
			
		}
		
	}

	@Override
	public List<Combustivel> listar() {

		return new CombustivelDao().listas();
		
	}

	@Override
	public void editar(Combustivel combustivel) {

		new CombustivelDao().editar(combustivel);
		
	}

	@Override
	public Combustivel getObjectTById(Long id) {

		CombustivelDao combustivelDao = new CombustivelDao();
		return combustivelDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Combustivel combustivel) {

		new CombustivelDao().excluir(combustivel);
		
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
