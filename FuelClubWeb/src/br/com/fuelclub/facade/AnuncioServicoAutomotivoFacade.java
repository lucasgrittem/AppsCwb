package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.AnuncioServicoAutomotivoDao;
import br.com.fuelclub.entity.Anuncio_Servico_Automotivo;

public class AnuncioServicoAutomotivoFacade implements InterfaceFacade<Anuncio_Servico_Automotivo>{

	@Override
	public void salvar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) throws Exception {

		if(existe(anuncioServicoAutomotivo)){

			throw new Exception("Este anuncio de serviço automotivo já existe");
			
		}else{
			
			new AnuncioServicoAutomotivoDao().salvar(anuncioServicoAutomotivo);
			
		}
		
	}

	@Override
	public List<Anuncio_Servico_Automotivo> listar() {

		return new AnuncioServicoAutomotivoDao().listas();
		
	}

	@Override
	public void editar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		new AnuncioServicoAutomotivoDao().editar(anuncioServicoAutomotivo);
		
	}

	@Override
	public Anuncio_Servico_Automotivo getObjectTById(Long id) {

		AnuncioServicoAutomotivoDao anuncioServicoAutomotivoDao = new AnuncioServicoAutomotivoDao();
		return anuncioServicoAutomotivoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		new AnuncioServicoAutomotivoDao().excluir(anuncioServicoAutomotivo);
		
	}
	
	
	public boolean existe(Anuncio_Servico_Automotivo anuncioServicoAutomotivo){
		
		List<Anuncio_Servico_Automotivo> lista = new AnuncioServicoAutomotivoDao().listar(anuncioServicoAutomotivo);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
