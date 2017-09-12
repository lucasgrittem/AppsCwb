package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.ServicosAutomotivosDao;
import br.com.fuelclub.entity.Servicos_Automotivos;
import br.com.fuelclub.facade.ServicosAutomotivosFacade;

public class ServicosAutomotivosBo implements InterfaceBo<Servicos_Automotivos>{

	@Override
	public void salvar(Servicos_Automotivos servicosAutomotivos) throws Exception {

		ServicosAutomotivosFacade servicosAutomotivosFacade = new ServicosAutomotivosFacade();
		try {
			servicosAutomotivosFacade.salvar(servicosAutomotivos);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Servicos_Automotivos> listar() {

		ServicosAutomotivosFacade servicosAutomotivosFacade = new ServicosAutomotivosFacade();
		return servicosAutomotivosFacade.listar();
		
	}

	@Override
	public void editar(Servicos_Automotivos servicosAutomotivos) {

		ServicosAutomotivosFacade servicosAutomotivosFacade = new ServicosAutomotivosFacade();
		servicosAutomotivosFacade.editar(servicosAutomotivos);
		
	}

	@Override
	public Servicos_Automotivos getObjectTById(Long id) {
		
		ServicosAutomotivosFacade servicosAutomotivosFacade = new ServicosAutomotivosFacade();
		return servicosAutomotivosFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Servicos_Automotivos servicosAutomotivos) {

		ServicosAutomotivosFacade servicosAutomotivosFacade = new ServicosAutomotivosFacade();
		servicosAutomotivosFacade.excluir(servicosAutomotivos);
		
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
