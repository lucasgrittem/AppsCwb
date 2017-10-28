package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.AnuncioServicoAutomotivoDao;
import br.com.fuelclub.entity.Anuncio_Servico_Automotivo;

public class AnuncioServicoAutomotivoBo implements InterfaceBo<Anuncio_Servico_Automotivo>{

	AnuncioServicoAutomotivoDao anuncioServicoAutomotivoDao = new AnuncioServicoAutomotivoDao();
	@Override
	public void salvar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) throws Exception {

		try {
			anuncioServicoAutomotivoDao.salvar(anuncioServicoAutomotivo);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Anuncio_Servico_Automotivo> listar() {
		return anuncioServicoAutomotivoDao.listas();
	}

	@Override
	public void editar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {
		anuncioServicoAutomotivoDao.editar(anuncioServicoAutomotivo);
	}

	@Override
	public Anuncio_Servico_Automotivo getObjectTById(Long id) {
		return anuncioServicoAutomotivoDao.getObjectTById(id);
	}

	@Override
	public void excluir(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {
		anuncioServicoAutomotivoDao.excluir(anuncioServicoAutomotivo);
	}
}
