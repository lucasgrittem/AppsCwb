package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.entity.Anuncio_Conveniencia;
import br.com.fuelclub.facade.AnuncioConvenienciaFacade;

public class AnuncioConvenienciaBo implements InterfaceBo<Anuncio_Conveniencia>{

	@Override
	public void salvar(Anuncio_Conveniencia anuncioConveniencia) throws Exception {

		AnuncioConvenienciaFacade anuncioConvenienciaFacade = new AnuncioConvenienciaFacade();
		try {
			anuncioConvenienciaFacade.salvar(anuncioConveniencia);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Anuncio_Conveniencia> listar() {

		AnuncioConvenienciaFacade anuncioConvenienciaFacade = new AnuncioConvenienciaFacade();
		return anuncioConvenienciaFacade.listar();
		
	}

	@Override
	public void editar(Anuncio_Conveniencia anuncioConveniencia) {

		AnuncioConvenienciaFacade anuncioConvenienciaFacade = new AnuncioConvenienciaFacade();
		anuncioConvenienciaFacade.editar(anuncioConveniencia);
		
	}

	@Override
	public Anuncio_Conveniencia getObjectTById(Long id) {

		AnuncioConvenienciaFacade anuncioConvenienciaFacade = new AnuncioConvenienciaFacade();
		return anuncioConvenienciaFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Anuncio_Conveniencia anuncioConveniencia) {

		AnuncioConvenienciaFacade anuncioConvenienciaFacade = new AnuncioConvenienciaFacade();
		anuncioConvenienciaFacade.excluir(anuncioConveniencia);
		
	}

}
