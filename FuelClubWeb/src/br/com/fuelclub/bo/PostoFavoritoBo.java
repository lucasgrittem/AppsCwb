package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.PostoFavoritoDao;
import br.com.fuelclub.entity.Posto_Favorito;

public class PostoFavoritoBo implements InterfaceBo<Posto_Favorito>{

	PostoFavoritoDao postoCombustivelDao = new PostoFavoritoDao();
	@Override
	public void salvar(Posto_Favorito postoFavorito) throws Exception {
		try {
			postoCombustivelDao.salvar(postoFavorito);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Posto_Favorito> listar() {
		return postoCombustivelDao.listas();
	}

	@Override
	public void editar(Posto_Favorito postoFavorito) {
		postoCombustivelDao.editar(postoFavorito);
	}

	@Override
	public Posto_Favorito getObjectTById(Long id) {
		return postoCombustivelDao.getObjectTById(id);
	}

	@Override
	public void excluir(Posto_Favorito postoFavorito) {
		postoCombustivelDao.excluir(postoFavorito);
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
