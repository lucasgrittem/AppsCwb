package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.CidadeDao;
import br.com.fuelclub.entity.Cidade;

public class CidadeFacade implements InterfaceFacade<Cidade>{

	@Override
	public void salvar(Cidade cidade) throws Exception {

		if(existe(cidade)){

			throw new Exception("Esta cidade já existe");
			
		}else{
			
			new CidadeDao().salvar(cidade);
			
		}
		
	}

	@Override
	public List<Cidade> listar() {

		return new CidadeDao().listas();
		
	}

	@Override
	public void editar(Cidade cidade) {

		new CidadeDao().editar(cidade);
		
	}

	@Override
	public Cidade getObjectTById(Long id) {

		CidadeDao cidadeDao = new CidadeDao();
		return cidadeDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Cidade cidade) {

		new CidadeDao().excluir(cidade);
		
	}
	
	public boolean existe(Cidade cidade){
		
		List<Cidade> lista = new CidadeDao().listar(cidade);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}
}
