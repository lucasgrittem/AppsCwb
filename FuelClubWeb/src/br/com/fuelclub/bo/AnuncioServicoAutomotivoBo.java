package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.entity.Anuncio_Servico_Automotivo;
import br.com.fuelclub.facade.AnuncioServicoAutomotivoFacade;

public class AnuncioServicoAutomotivoBo implements InterfaceBo<Anuncio_Servico_Automotivo>{

	@Override
	public void salvar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) throws Exception {

		AnuncioServicoAutomotivoFacade anuncioServicoAutomotivoFacade = new AnuncioServicoAutomotivoFacade();
		try {
			anuncioServicoAutomotivoFacade.salvar(anuncioServicoAutomotivo);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Anuncio_Servico_Automotivo> listar() {

		AnuncioServicoAutomotivoFacade anuncioServicoAutomotivoFacade = new AnuncioServicoAutomotivoFacade();
		return anuncioServicoAutomotivoFacade.listar();
		
	}

	@Override
	public void editar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		AnuncioServicoAutomotivoFacade anuncioServicoAutomotivoFacade = new AnuncioServicoAutomotivoFacade();
		anuncioServicoAutomotivoFacade.editar(anuncioServicoAutomotivo);
		
	}

	@Override
	public Anuncio_Servico_Automotivo getObjectTById(Long id) {

		AnuncioServicoAutomotivoFacade anuncioServicoAutomotivoFacade = new AnuncioServicoAutomotivoFacade();
		return anuncioServicoAutomotivoFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		AnuncioServicoAutomotivoFacade anuncioServicoAutomotivoFacade = new AnuncioServicoAutomotivoFacade();
		anuncioServicoAutomotivoFacade.excluir(anuncioServicoAutomotivo);
		
	}
	
}
