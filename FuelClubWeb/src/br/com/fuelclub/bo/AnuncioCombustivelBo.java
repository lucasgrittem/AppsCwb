package br.com.fuelclub.bo;

import java.util.List;


import br.com.fuelclub.entity.Anuncio_Combustivel;
import br.com.fuelclub.facade.AnuncioCombustivelFacade;

public class AnuncioCombustivelBo implements InterfaceBo<Anuncio_Combustivel>{

	@Override
	public void salvar(Anuncio_Combustivel anuncioCombustivel) throws Exception {

		AnuncioCombustivelFacade anuncioCombustivelFacade = new AnuncioCombustivelFacade();
		try {
			anuncioCombustivelFacade.salvar(anuncioCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Anuncio_Combustivel> listar() {

		AnuncioCombustivelFacade anuncioCombustivelFacade = new AnuncioCombustivelFacade();
		return anuncioCombustivelFacade.listar();
		
	}

	@Override
	public void editar(Anuncio_Combustivel anuncioCombustivel) {

		AnuncioCombustivelFacade anuncioCombustivelFacade = new AnuncioCombustivelFacade();
		anuncioCombustivelFacade.editar(anuncioCombustivel);
		
	}

	@Override
	public Anuncio_Combustivel getObjectTById(Long id) {

		AnuncioCombustivelFacade anuncioCombustivelFacade = new AnuncioCombustivelFacade();
		return anuncioCombustivelFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Anuncio_Combustivel anuncioCombustivel) {

		AnuncioCombustivelFacade anuncioCombustivelFacade = new AnuncioCombustivelFacade();
		anuncioCombustivelFacade.excluir(anuncioCombustivel);
		
	}
}
