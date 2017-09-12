package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.PaisDao;
import br.com.fuelclub.entity.Pais;
import br.com.fuelclub.facade.PaisFacade;

public class PaisBo implements InterfaceBo<Pais>{

	@Override
	public void salvar(Pais pais) throws Exception {

		PaisFacade paisFacade = new PaisFacade();
		try {
			paisFacade.salvar(pais);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Pais> listar() {

		PaisFacade paisFacade = new PaisFacade();
		return paisFacade.listar();
		
	}

	@Override
	public void editar(Pais pais) {

		PaisFacade paisFacade = new PaisFacade();
		paisFacade.editar(pais);
		
	}

	@Override
	public Pais getObjectTById(Long id) {

		PaisFacade paisFacade = new PaisFacade();
		return paisFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Pais pais) {

		PaisFacade paisFacade = new PaisFacade();
		paisFacade.excluir(pais);
		
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
