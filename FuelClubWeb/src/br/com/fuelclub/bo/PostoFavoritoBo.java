package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.PostoFavoritoDao;
import br.com.fuelclub.entity.Posto_Favorito;
import br.com.fuelclub.facade.PostoFavoritoFacade;

public class PostoFavoritoBo implements InterfaceBo<Posto_Favorito>{

	@Override
	public void salvar(Posto_Favorito postoFavorito) throws Exception {

		PostoFavoritoFacade postoFavoritoFacade = new PostoFavoritoFacade();
		try {
			postoFavoritoFacade.salvar(postoFavorito);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Posto_Favorito> listar() {

		PostoFavoritoFacade postoFavoritoFacade = new PostoFavoritoFacade();
		return postoFavoritoFacade.listar();
		
	}

	@Override
	public void editar(Posto_Favorito postoFavorito) {

		PostoFavoritoFacade postoFavoritoFacade = new PostoFavoritoFacade();
		postoFavoritoFacade.editar(postoFavorito);
		
	}

	@Override
	public Posto_Favorito getObjectTById(Long id) {

		PostoFavoritoFacade postoFavoritoFacade = new PostoFavoritoFacade();
		return postoFavoritoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Posto_Favorito postoFavorito) {

		PostoFavoritoFacade postoFavoritoFacade = new PostoFavoritoFacade();
		postoFavoritoFacade.excluir(postoFavorito);
		
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
