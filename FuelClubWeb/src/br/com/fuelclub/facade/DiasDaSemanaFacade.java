package br.com.fuelclub.facade;

import java.util.List;

import br.com.fuelclub.dao.DiasDaSemanaDao;
import br.com.fuelclub.entity.Dias_Da_Semana;

public class DiasDaSemanaFacade implements InterfaceFacade<Dias_Da_Semana>{

	@Override
	public void salvar(Dias_Da_Semana diasDaSemana) throws Exception {

		if(existe(diasDaSemana)){

			throw new Exception("Este dia da semana já existe");
			
		}else{
			
			new DiasDaSemanaDao().salvar(diasDaSemana);
			
		}
		
	}

	@Override
	public List<Dias_Da_Semana> listar() {

		return new DiasDaSemanaDao().listas();
		
	}

	@Override
	public void editar(Dias_Da_Semana diasDaSemana) {

		new DiasDaSemanaDao().editar(diasDaSemana);
		
	}

	@Override
	public Dias_Da_Semana getObjectTById(Long id) {

		DiasDaSemanaDao diasDaSemanaDao = new DiasDaSemanaDao();
		return diasDaSemanaDao.getObjectTById(id);
		
	}

	@Override
	public void excluir(Dias_Da_Semana diasDaSemana) {

		new DiasDaSemanaDao().excluir(diasDaSemana);
		
	}
	
	
	public boolean existe(Dias_Da_Semana diasDaSemana){
		
		List<Dias_Da_Semana> lista = new DiasDaSemanaDao().listar(diasDaSemana);		
		
		if(lista.size() > 0){
			
			return true;
			
		}else{
			
			return false;
			
		}
			
	}

}
