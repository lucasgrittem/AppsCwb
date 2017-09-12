package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.facade.AdministradorSistemaFacade;

public class AdministradorSistemaBo implements InterfaceBo<Administrador_Sistema>{

	@Override
	public void salvar(Administrador_Sistema administradorSistema) throws Exception {

		AdministradorSistemaFacade administradorSistemaFacade = new AdministradorSistemaFacade();
		try {
			administradorSistemaFacade.salvar(administradorSistema);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Administrador_Sistema> listar() {

		AdministradorSistemaFacade administradorSistemaFacade = new AdministradorSistemaFacade();
		return administradorSistemaFacade.listar();
		
	}

	@Override
	public void editar(Administrador_Sistema administradorSistema) {

		AdministradorSistemaFacade administradorSistemaFacade = new AdministradorSistemaFacade();
		administradorSistemaFacade.editar(administradorSistema);
		
	}

	@Override
	public Administrador_Sistema getObjectTById(Long id) {

		AdministradorSistemaFacade administradorSistemaFacade = new AdministradorSistemaFacade();
		return administradorSistemaFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Administrador_Sistema administradorSistema) {
		
		AdministradorSistemaFacade administradorSistemaFacade = new AdministradorSistemaFacade();
		administradorSistemaFacade.excluir(administradorSistema);
		
	}

}
