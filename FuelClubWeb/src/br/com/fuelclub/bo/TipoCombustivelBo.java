package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.TipoCombustivelDao;
import br.com.fuelclub.entity.Tipo_Combustivel;

public class TipoCombustivelBo implements InterfaceBo<Tipo_Combustivel>{

	TipoCombustivelDao tipoCombustivelDao = new TipoCombustivelDao();
	@Override
	public void salvar(Tipo_Combustivel tipoCombustivel) throws Exception {

		try {
			tipoCombustivelDao.salvar(tipoCombustivel);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Tipo_Combustivel> listar() {
		return tipoCombustivelDao.listas();
	}

	@Override
	public void editar(Tipo_Combustivel tipoCombustivel) {
		tipoCombustivelDao.editar(tipoCombustivel);
	}

	@Override
	public Tipo_Combustivel getObjectTById(Long id) {
		return tipoCombustivelDao.getObjectTById(id);
	}

	@Override
	public void excluir(Tipo_Combustivel tipoCombustivel) {
		tipoCombustivelDao.excluir(tipoCombustivel);
	}
	
	public boolean existe(Tipo_Combustivel tipoCombustivel){
		List<Tipo_Combustivel> lista = new TipoCombustivelDao().listar(tipoCombustivel);		
		if(lista.size() > 0){
			return true;
		}else{
			return false;
		}
	}
}
