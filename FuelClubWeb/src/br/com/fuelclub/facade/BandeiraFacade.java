package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.BandeiraDao;
import br.com.fuelclub.entity.Bandeira;

public class BandeiraFacade implements InterfaceFacade<Bandeira>{

	@Override
	public void salvar(Bandeira bandeira) throws Exception {

		if(existe(bandeira)){

			throw new Exception("Esta bandeira já existe");
			
		}else{
			
			new BandeiraDao().salvar(bandeira);
			
		}
		
	}

	@Override
	public List<Bandeira> listar() {

		return new BandeiraDao().listas();
		
	}

	@Override
	public void editar(Bandeira bandeira) {

		new BandeiraDao().editar(bandeira);
		
	}

	@Override
	public Bandeira getObjectTById(Long id) {

		BandeiraDao bandeiraDao = new BandeiraDao();
		return bandeiraDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Bandeira bandeira) {

		new BandeiraDao().excluir(bandeira);
		
	}
	
	public boolean existe(Bandeira bandeira){
		
		List<Bandeira> lista = new BandeiraDao().listar(bandeira);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}


}
