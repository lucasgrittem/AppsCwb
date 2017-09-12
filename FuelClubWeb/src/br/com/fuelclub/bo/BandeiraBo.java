package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.BandeiraDao;
import br.com.fuelclub.entity.Bandeira;
import br.com.fuelclub.facade.BandeiraFacade;

public class BandeiraBo implements InterfaceBo<Bandeira>{

	@Override
	public void salvar(Bandeira bandeira) throws Exception {

		BandeiraFacade bandeiraFacade = new BandeiraFacade();
		try {
			bandeiraFacade.salvar(bandeira);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Bandeira> listar() {

		BandeiraFacade bandeiraFacade = new BandeiraFacade();
		return bandeiraFacade.listar();
		
	}

	@Override
	public void editar(Bandeira bandeira) {

		BandeiraFacade bandeiraFacade = new BandeiraFacade();
		bandeiraFacade.editar(bandeira);
		
	}

	@Override
	public Bandeira getObjectTById(Long id) {

		BandeiraFacade bandeiraFacade = new BandeiraFacade();
		return bandeiraFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Bandeira bandeira) {

		BandeiraFacade bandeiraFacade = new BandeiraFacade();
		bandeiraFacade.excluir(bandeira);
		
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
