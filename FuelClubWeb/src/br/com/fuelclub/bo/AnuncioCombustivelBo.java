package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.AnuncioCombustivelDao;
import br.com.fuelclub.entity.Anuncio_Combustivel;

public class AnuncioCombustivelBo implements InterfaceBo<Anuncio_Combustivel>{

	AnuncioCombustivelDao anuncioCombustivelDao = new AnuncioCombustivelDao();
	@Override
	public void salvar(Anuncio_Combustivel anuncioCombustivel) throws Exception {

		try {
			anuncioCombustivelDao.salvar(anuncioCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Anuncio_Combustivel> listar() {
		return anuncioCombustivelDao.listas();
	}

	@Override
	public void editar(Anuncio_Combustivel anuncioCombustivel) {
		anuncioCombustivelDao.editar(anuncioCombustivel);
	}

	@Override
	public Anuncio_Combustivel getObjectTById(Long id) {
		return anuncioCombustivelDao.getObjectTById(id);
	}

	@Override
	public void excluir(Anuncio_Combustivel anuncioCombustivel) {
		anuncioCombustivelDao.excluir(anuncioCombustivel);
	}
}
