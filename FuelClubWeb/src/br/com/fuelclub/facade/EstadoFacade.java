package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.EstadoDao;
import br.com.fuelclub.entity.Estado;

public class EstadoFacade implements InterfaceFacade<Estado>{

	@Override
	public void salvar(Estado estado) throws Exception {

		EstadoFacade estadoFacade = new EstadoFacade();
		try {
			estadoFacade.salvar(estado);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Estado> listar() {

		EstadoFacade estadoFacade = new EstadoFacade();
		return estadoFacade.listar();
		
	}

	@Override
	public void editar(Estado estado) {

		EstadoFacade estadoFacade = new EstadoFacade();
		estadoFacade.editar(estado);
		
	}

	@Override
	public Estado getObjectTById(Long id) {

		EstadoFacade estadoFacade = new EstadoFacade();
		return estadoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Estado estado) {

		EstadoFacade estadoFacade = new EstadoFacade();
		estadoFacade.excluir(estado);
		
	}
	
	public boolean existe(Estado estado){
		
		List<Estado> lista = new EstadoDao().listar(estado);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
