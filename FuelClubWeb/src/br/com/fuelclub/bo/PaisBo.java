package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.PaisDao;
import br.com.fuelclub.entity.Pais;

public class PaisBo implements InterfaceBo<Pais>{

	PaisDao paisDao = new PaisDao();
	@Override
	public void salvar(Pais pais) throws Exception {
		try {
			paisDao.salvar(pais);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Pais> listar() {
		return paisDao.listas();
	}

	@Override
	public void editar(Pais pais) {
		paisDao.editar(pais);
	}

	@Override
	public Pais getObjectTById(Long id) {
		return paisDao.getObjectTById(id);
	}

	@Override
	public void excluir(Pais pais) {
		paisDao.excluir(pais);
	}

	public boolean existe(Pais pais){
		List<Pais> lista = new PaisDao().listar(pais);		
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
			
	}

}
