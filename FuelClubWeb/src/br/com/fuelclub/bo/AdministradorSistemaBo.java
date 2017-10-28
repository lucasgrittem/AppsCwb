package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.AdministradorSistemaDao;
import br.com.fuelclub.entity.Administrador_Sistema;
public class AdministradorSistemaBo implements InterfaceBo<Administrador_Sistema>{

	AdministradorSistemaDao administradorSistemaDao = new AdministradorSistemaDao();
	@Override
	public void salvar(Administrador_Sistema administradorSistema) throws Exception {

		try {
			administradorSistemaDao.salvar(administradorSistema);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Administrador_Sistema> listar() {
		return administradorSistemaDao.listas();
	}

	@Override
	public void editar(Administrador_Sistema administradorSistema) {
		administradorSistemaDao.editar(administradorSistema);
	}

	@Override
	public Administrador_Sistema getObjectTById(Long id) {
		return administradorSistemaDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Administrador_Sistema administradorSistema) {
		administradorSistemaDao.excluir(administradorSistema);
	}

}
