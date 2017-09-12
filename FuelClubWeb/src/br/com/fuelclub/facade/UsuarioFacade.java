package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.UsuarioDao;
import br.com.fuelclub.entity.Usuario;

public class UsuarioFacade implements InterfaceFacade<Usuario>{

	@Override
	public void salvar(Usuario usuario) throws Exception {

		if(existe(usuario)){

			throw new Exception("Este usuario já existe");
			
		}else{
			
			new UsuarioDao().salvar(usuario);
			
		}
		
	}

	@Override
	public List<Usuario> listar() {

		return new UsuarioDao().listas();
		
	}

	@Override
	public void editar(Usuario usuario) {

		new UsuarioDao().editar(usuario);
		
	}

	@Override
	public Usuario getObjectTById(Long id) {

		UsuarioDao usuarioDao = new UsuarioDao();
		return usuarioDao.getObjectTById(id);
				
	}

	@Override
	public void excluir(Usuario usuario) {
		
		new UsuarioDao().excluir(usuario);
		
	}
	
	public boolean existe(Usuario usuario){
		
		List<Usuario> lista = new UsuarioDao().listar(usuario);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
