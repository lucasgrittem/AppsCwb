package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.ServicosConvenienciaDao;
import br.com.fuelclub.entity.Servicos_Conveniencia;

public class ServicosConvenienciaFacade implements InterfaceFacade<Servicos_Conveniencia>{

	@Override
	public void salvar(Servicos_Conveniencia servicosConveniencia) throws Exception {

		if(existe(servicosConveniencia)){

			throw new Exception("Este serviço de conveniencia já existe");
			
		}else{
			
			new ServicosConvenienciaDao().salvar(servicosConveniencia);
			
		}
		
	}

	@Override
	public List<Servicos_Conveniencia> listar() {

		return new ServicosConvenienciaDao().listas();
		
	}

	@Override
	public void editar(Servicos_Conveniencia servicosConveniencia) {

		new ServicosConvenienciaDao().editar(servicosConveniencia);
		
	}

	@Override
	public Servicos_Conveniencia getObjectTById(Long id) {

		ServicosConvenienciaDao servicosConvenienciaDao = new ServicosConvenienciaDao();
		return servicosConvenienciaDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Servicos_Conveniencia servicosConveniencia) {

		new ServicosConvenienciaDao().excluir(servicosConveniencia);
		
	}
	
	public boolean existe(Servicos_Conveniencia servicosConveniencia){
		
		List<Servicos_Conveniencia> lista = new ServicosConvenienciaDao().listar(servicosConveniencia);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
