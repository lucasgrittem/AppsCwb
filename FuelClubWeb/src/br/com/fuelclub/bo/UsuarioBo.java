package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.UsuarioDao;
import br.com.fuelclub.entity.Usuario;
import br.com.fuelclub.facade.UsuarioFacade;

public class UsuarioBo implements InterfaceBo<Usuario>{

	@Override
	public void salvar(Usuario usuario) throws Exception {

		UsuarioFacade usuarioFacade = new UsuarioFacade();
		try {
			usuarioFacade.salvar(usuario);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Usuario> listar() {

		UsuarioFacade usuarioFacade = new UsuarioFacade();
		return usuarioFacade.listar();
		
	}

	@Override
	public void editar(Usuario usuario) {

		UsuarioFacade usuarioFacade = new UsuarioFacade();
		usuarioFacade.editar(usuario);
		
	}

	@Override
	public Usuario getObjectTById(Long id) {

		UsuarioFacade usuarioFacade = new UsuarioFacade();
		return usuarioFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Usuario usuario) {

		UsuarioFacade usuarioFacade = new UsuarioFacade();
		usuarioFacade.excluir(usuario);
		
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
