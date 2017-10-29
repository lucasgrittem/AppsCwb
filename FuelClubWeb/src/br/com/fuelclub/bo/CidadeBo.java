package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.CidadeDao;
import br.com.fuelclub.entity.Cidade;

public class CidadeBo implements InterfaceBo<Cidade>{

	CidadeDao cidadeDao = new CidadeDao();
	@Override
	public void salvar(Cidade cidade) throws Exception {
		try {
			cidadeDao.salvar(cidade);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public List<Cidade> listar() {
		return cidadeDao.listas();
	}

	@Override
	public void editar(Cidade cidade) {
		cidadeDao.editar(cidade);
	}

	@Override
	public Cidade getObjectTById(Long id) {
		return cidadeDao.getObjectTById(id);
	}

	@Override
	public void excluir(Cidade cidade) {
		cidadeDao.excluir(cidade);
	}

	public boolean existe(Cidade cidade){
		List<Cidade> lista = new CidadeDao().listar(cidade);		
		if(lista.size() > 0){
			return true;
			
		}else{
			return false;
		}
	}
	
	public List<Cidade> listarPorEstado(Long id){
		return new CidadeDao().listarPorEstado(id);
	}
	

}
