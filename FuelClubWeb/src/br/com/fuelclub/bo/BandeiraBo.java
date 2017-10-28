package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.BandeiraDao;
import br.com.fuelclub.entity.Bandeira;

public class BandeiraBo implements InterfaceBo<Bandeira>{
	BandeiraDao bandeiraDao = new BandeiraDao();

	@Override
	public void salvar(Bandeira bandeira) throws Exception {
		try {
			bandeiraDao.salvar(bandeira);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Bandeira> listar() {
		return bandeiraDao.listas();
	}

	@Override
	public void editar(Bandeira bandeira) {
		bandeiraDao.editar(bandeira);
	}

	@Override
	public Bandeira getObjectTById(Long id) {
		return bandeiraDao.getObjectTById(id);
	}

	@Override
	public void excluir(Bandeira bandeira) {
		bandeiraDao.excluir(bandeira);
	}
	
	public boolean existe(Bandeira bandeira){
		List<Bandeira> lista = new BandeiraDao().listar(bandeira);		
		if(lista.size() > 0){
			return true;
		}else{
			
			return false;
		}
	}
}
