package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.UsuarioDao;
import br.com.fuelclub.entity.Usuario;

public class UsuarioBo implements InterfaceBo<Usuario>{

	UsuarioDao usuarioDao = new UsuarioDao();
	@Override
	public void salvar(Usuario usuario) throws Exception {

		try {
			usuarioDao.salvar(usuario);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Usuario> listar() {
		return usuarioDao.listas();
	}

	@Override
	public void editar(Usuario usuario) {
		usuarioDao.editar(usuario);
	}

	@Override
	public Usuario getObjectTById(Long id) {
		return usuarioDao.getObjectTById(id);
	}

	@Override
	public void excluir(Usuario usuario) {
		usuarioDao.excluir(usuario);
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
