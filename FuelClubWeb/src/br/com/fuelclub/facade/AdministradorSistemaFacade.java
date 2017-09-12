package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.AdministradorSistemaDao;
import br.com.fuelclub.entity.Administrador_Sistema;

public class AdministradorSistemaFacade implements InterfaceFacade<Administrador_Sistema>{

	@Override
	public void salvar(Administrador_Sistema administradorSistema) throws Exception {

		if(existe(administradorSistema)){

			throw new Exception("Este administrador de sistema já existe");
			
		}else{
			
			new AdministradorSistemaDao().salvar(administradorSistema);
			
		}
		
	}

	@Override
	public List<Administrador_Sistema> listar() {

		return new AdministradorSistemaDao().listas();
			
	}

	@Override
	public void editar(Administrador_Sistema administradorSistema) {
		
		new AdministradorSistemaDao().editar(administradorSistema);
		
	}

	@Override
	public Administrador_Sistema getObjectTById(Long id) {

		AdministradorSistemaDao administradorSistemaDao = new AdministradorSistemaDao();
		return administradorSistemaDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Administrador_Sistema administradorSistema) {

		new AdministradorSistemaDao().excluir(administradorSistema);
		
	}
	
	public boolean existe(Administrador_Sistema administradorSistema){
		
		List<Administrador_Sistema> lista = new AdministradorSistemaDao().listar(administradorSistema);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
