package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.ServicosAutomotivosDao;
import br.com.fuelclub.entity.Servicos_Automotivos;

public class ServicosAutomotivosFacade implements InterfaceFacade<Servicos_Automotivos>{

	@Override
	public void salvar(Servicos_Automotivos servicosAutomotivos) throws Exception {

		if(existe(servicosAutomotivos)){

			throw new Exception("Este serviço automotivo já existe");
			
		}else{
			
			new ServicosAutomotivosDao().salvar(servicosAutomotivos);
			
		}
		
	}

	@Override
	public List<Servicos_Automotivos> listar() {

		return new ServicosAutomotivosDao().listas();
		
	}

	@Override
	public void editar(Servicos_Automotivos servicosAutomotivos) {

		new ServicosAutomotivosDao().editar(servicosAutomotivos);
		
	}

	@Override
	public Servicos_Automotivos getObjectTById(Long id) {

		ServicosAutomotivosDao servicosAutomotivosDao = new ServicosAutomotivosDao();
		return servicosAutomotivosDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Servicos_Automotivos servicosAutomotivos) {

		new ServicosAutomotivosDao().excluir(servicosAutomotivos);
		
	}
	
	public boolean existe(Servicos_Automotivos servicosAutomotivos){
		
		List<Servicos_Automotivos> lista = new ServicosAutomotivosDao().listar(servicosAutomotivos);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}
}
