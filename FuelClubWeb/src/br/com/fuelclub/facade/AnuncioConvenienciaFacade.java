package br.com.fuelclub.facade;

import java.util.List;


import br.com.fuelclub.dao.AnuncioConvenienciaDao;
import br.com.fuelclub.entity.Anuncio_Conveniencia;

public class AnuncioConvenienciaFacade implements InterfaceFacade<Anuncio_Conveniencia>{

	@Override
	public void salvar(Anuncio_Conveniencia anuncioConveniencia) throws Exception {

		if(existe(anuncioConveniencia)){

			throw new Exception("Este anuncio de conveniencia já existe");
			
		}else{
			
			new AnuncioConvenienciaDao().salvar(anuncioConveniencia);
			
		}
		
	}

	@Override
	public List<Anuncio_Conveniencia> listar() {

		return new AnuncioConvenienciaDao().listas();
		
	}

	@Override
	public void editar(Anuncio_Conveniencia anuncioConveniencia) {

		new AnuncioConvenienciaDao().editar(anuncioConveniencia);
		
	}

	@Override
	public Anuncio_Conveniencia getObjectTById(Long id) {

		AnuncioConvenienciaDao anuncioConvenienciaDao = new AnuncioConvenienciaDao();
		return anuncioConvenienciaDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Anuncio_Conveniencia anuncioConveniencia) {
		
		new AnuncioConvenienciaDao().excluir(anuncioConveniencia);
		
	}
	
	
	public boolean existe(Anuncio_Conveniencia anuncioConveniencia){
		
		List<Anuncio_Conveniencia> lista = new AnuncioConvenienciaDao().listar(anuncioConveniencia);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
