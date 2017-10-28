package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.AnuncioConvenienciaDao;
import br.com.fuelclub.entity.Anuncio_Conveniencia;

public class AnuncioConvenienciaBo implements InterfaceBo<Anuncio_Conveniencia>{

	AnuncioConvenienciaDao anuncioConvenienciaDao = new AnuncioConvenienciaDao();
	@Override
	public void salvar(Anuncio_Conveniencia anuncioConveniencia) throws Exception {
		try {
			anuncioConvenienciaDao.salvar(anuncioConveniencia);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Anuncio_Conveniencia> listar() {
		return anuncioConvenienciaDao.listas();
	}

	@Override
	public void editar(Anuncio_Conveniencia anuncioConveniencia) {
		anuncioConvenienciaDao.editar(anuncioConveniencia);
	}

	@Override
	public Anuncio_Conveniencia getObjectTById(Long id) {
		return anuncioConvenienciaDao.getObjectTById(id);
	}

	@Override
	public void excluir(Anuncio_Conveniencia anuncioConveniencia) {
		anuncioConvenienciaDao.excluir(anuncioConveniencia);
	}

}
