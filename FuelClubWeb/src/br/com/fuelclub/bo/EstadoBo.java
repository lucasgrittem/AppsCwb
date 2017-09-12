package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.EstadoDao;
import br.com.fuelclub.entity.Estado;

public class EstadoBo implements InterfaceBo<Estado>{

	@Override
	public void salvar(Estado estado) throws Exception {

		if(existe(estado)){

			throw new Exception("Este estado já existe");
			
		}else{
			
			new EstadoDao().salvar(estado);
			
		}
		
	}

	@Override
	public List<Estado> listar() {

		return new EstadoDao().listas();
		
	}

	@Override
	public void editar(Estado estado) {

		new EstadoDao().editar(estado);
		
	}

	@Override
	public Estado getObjectTById(Long id) {

		EstadoDao estadoDao = new EstadoDao();
		return estadoDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Estado estado) {

		new EstadoDao().excluir(estado);
		
	}
	
	public boolean existe(Estado estado){
		
		List<Estado> lista = new EstadoDao().listar(estado);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}
}
