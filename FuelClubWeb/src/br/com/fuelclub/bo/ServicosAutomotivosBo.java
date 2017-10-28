package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.ServicosAutomotivosDao;
import br.com.fuelclub.entity.Servicos_Automotivos;

public class ServicosAutomotivosBo implements InterfaceBo<Servicos_Automotivos>{

	ServicosAutomotivosDao servicosAutomotivosDao = new ServicosAutomotivosDao();
	@Override
	public void salvar(Servicos_Automotivos servicosAutomotivos) throws Exception {
		try {
			servicosAutomotivosDao.salvar(servicosAutomotivos);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Servicos_Automotivos> listar() {
		return servicosAutomotivosDao.listas();
	}

	@Override
	public void editar(Servicos_Automotivos servicosAutomotivos) {
		servicosAutomotivosDao.editar(servicosAutomotivos);
	}

	@Override
	public Servicos_Automotivos getObjectTById(Long id) {
		return servicosAutomotivosDao.getObjectTById(id);
	}

	@Override
	public void excluir(Servicos_Automotivos servicosAutomotivos) {
		servicosAutomotivosDao.excluir(servicosAutomotivos);
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
