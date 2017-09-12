package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.ServicosConvenienciaDao;
import br.com.fuelclub.entity.Servicos_Conveniencia;
import br.com.fuelclub.facade.ServicosConvenienciaFacade;

public class ServicosConvenienciaBo implements InterfaceBo<Servicos_Conveniencia>{

	@Override
	public void salvar(Servicos_Conveniencia servicosConveniencia) throws Exception {

		ServicosConvenienciaFacade servicosConvenienciaFacade = new ServicosConvenienciaFacade();
		try {
			servicosConvenienciaFacade.salvar(servicosConveniencia);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Servicos_Conveniencia> listar() {

		ServicosConvenienciaFacade servicosConvenienciaFacade = new ServicosConvenienciaFacade();
		return servicosConvenienciaFacade.listar();
		
	}

	@Override
	public void editar(Servicos_Conveniencia servicosConveniencia) {

		ServicosConvenienciaFacade servicosConvenienciaFacade = new ServicosConvenienciaFacade();
		servicosConvenienciaFacade.editar(servicosConveniencia);
		
	}

	@Override
	public Servicos_Conveniencia getObjectTById(Long id) {

		ServicosConvenienciaFacade servicosConvenienciaFacade = new ServicosConvenienciaFacade();
		return servicosConvenienciaFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Servicos_Conveniencia servicosConveniencia) {

		ServicosConvenienciaFacade servicosConvenienciaFacade = new ServicosConvenienciaFacade();
		servicosConvenienciaFacade.excluir(servicosConveniencia);
		
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
