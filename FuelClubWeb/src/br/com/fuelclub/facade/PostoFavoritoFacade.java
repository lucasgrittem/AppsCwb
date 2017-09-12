package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.PostoFavoritoDao;
import br.com.fuelclub.entity.Posto_Favorito;

public class PostoFavoritoFacade implements InterfaceFacade<Posto_Favorito>{

	@Override
	public void salvar(Posto_Favorito postoFavorito) throws Exception {

		if(existe(postoFavorito)){

			throw new Exception("Este posto favorito já está cadastrado");
			
		}else{
			
			new PostoFavoritoDao().salvar(postoFavorito);
			
		}
		
	}

	@Override
	public List<Posto_Favorito> listar() {

		return new PostoFavoritoDao().listas();
		
	}

	@Override
	public void editar(Posto_Favorito postoFavorito) {

		new PostoFavoritoDao().editar(postoFavorito);
		
	}

	@Override
	public Posto_Favorito getObjectTById(Long id) {

		PostoFavoritoDao postoFavoritoDao = new PostoFavoritoDao();
		return postoFavoritoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Posto_Favorito postoFavorito) {

		new PostoFavoritoDao().excluir(postoFavorito);
		
	}
	
	public boolean existe(Posto_Favorito postoFavorito){
		
		List<Posto_Favorito> lista = new PostoFavoritoDao().listar(postoFavorito);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
