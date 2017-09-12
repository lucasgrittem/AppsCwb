package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.PaisDao;
import br.com.fuelclub.entity.Pais;

public class PaisFacade implements InterfaceFacade<Pais>{

	@Override
	public void salvar(Pais pais) throws Exception {

		if(existe(pais)){

			throw new Exception("Este pais já existe");
			
		}else{
			
			new PaisDao().salvar(pais);
			
		}
		
	}

	@Override
	public List<Pais> listar() {

		return new PaisDao().listas();
		
	}

	@Override
	public void editar(Pais pais) {
		
		new PaisDao().editar(pais);
		
	}

	@Override
	public Pais getObjectTById(Long id) {

		PaisDao paisDao = new PaisDao();
		return paisDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Pais pais) {
		
		new PaisDao().excluir(pais);
		
	}
	
	public boolean existe(Pais pais){
		
		List<Pais> lista = new PaisDao().listar(pais);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
