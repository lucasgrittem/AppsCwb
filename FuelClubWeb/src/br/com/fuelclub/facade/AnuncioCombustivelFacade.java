package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.AnuncioCombustivelDao;
import br.com.fuelclub.entity.Anuncio_Combustivel;

public class AnuncioCombustivelFacade implements InterfaceFacade<Anuncio_Combustivel>{

	@Override
	public void salvar(Anuncio_Combustivel anuncioCombustivel) throws Exception {

		if(existe(anuncioCombustivel)){

			throw new Exception("Este Anuncio de Combustivel já existe");
			
		}else{
			
			new AnuncioCombustivelDao().salvar(anuncioCombustivel);
			
		}
		
	}

	@Override
	public List<Anuncio_Combustivel> listar() {

		return new AnuncioCombustivelDao().listas();
		
	}

	@Override
	public void editar(Anuncio_Combustivel anuncioCombustivel) {

		new AnuncioCombustivelDao().editar(anuncioCombustivel);
		
	}

	@Override
	public Anuncio_Combustivel getObjectTById(Long id) {

		AnuncioCombustivelDao anuncioCombustiveDao = new AnuncioCombustivelDao();
		return anuncioCombustiveDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Anuncio_Combustivel anuncioCombustivel) {

		new AnuncioCombustivelDao().excluir(anuncioCombustivel);
		
	}
	
	public boolean existe(Anuncio_Combustivel anuncioCombustivel){
		
		List<Anuncio_Combustivel> lista = new AnuncioCombustivelDao().listar(anuncioCombustivel);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}


}
