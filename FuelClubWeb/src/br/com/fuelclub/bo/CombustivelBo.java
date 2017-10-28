package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.CombustivelDao;
import br.com.fuelclub.entity.Combustivel;

public class CombustivelBo implements InterfaceBo<Combustivel>{

	CombustivelDao combustivelDao = new CombustivelDao();
	@Override
	public void salvar(Combustivel combustivel) throws Exception {
		try {
			combustivelDao.salvar(combustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Combustivel> listar() {
		return combustivelDao.listas();
	}

	@Override
	public void editar(Combustivel combustivel) {
		combustivelDao.editar(combustivel);
	}

	@Override
	public Combustivel getObjectTById(Long id) {
		return combustivelDao.getObjectTById(id);
	}

	@Override
	public void excluir(Combustivel combustivel) {
		combustivelDao.excluir(combustivel);
	}
	
	public boolean existe(Combustivel combustivel){
		List<Combustivel> lista = new CombustivelDao().listar(combustivel);		
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}
}
