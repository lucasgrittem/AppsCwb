package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.ServicosConvenienciaDao;
import br.com.fuelclub.entity.Servicos_Conveniencia;

public class ServicosConvenienciaBo implements InterfaceBo<Servicos_Conveniencia>{

	ServicosConvenienciaDao servicosConvenienciaDao = new ServicosConvenienciaDao();
	@Override
	public void salvar(Servicos_Conveniencia servicosConveniencia) throws Exception {

		try {
			servicosConvenienciaDao.salvar(servicosConveniencia);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Servicos_Conveniencia> listar() {
		return servicosConvenienciaDao.listas();
	}

	@Override
	public void editar(Servicos_Conveniencia servicosConveniencia) {
		servicosConvenienciaDao.editar(servicosConveniencia);
	}

	@Override
	public Servicos_Conveniencia getObjectTById(Long id) {
		return servicosConvenienciaDao.getObjectTById(id);
	}

	@Override
	public void excluir(Servicos_Conveniencia servicosConveniencia) {
		servicosConvenienciaDao.excluir(servicosConveniencia);
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
