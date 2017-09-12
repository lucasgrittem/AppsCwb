package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.DiasDaSemanaDao;
import br.com.fuelclub.entity.Dias_Da_Semana;
import br.com.fuelclub.facade.DiasDaSemanaFacade;

public class DiasDaSemanaBo implements InterfaceBo<Dias_Da_Semana>{

	@Override
	public void salvar(Dias_Da_Semana diasDaSemana) throws Exception {
		
		DiasDaSemanaFacade diasDaSemanaFacade = new DiasDaSemanaFacade();
		try {
			diasDaSemanaFacade.salvar(diasDaSemana);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Dias_Da_Semana> listar() {

		DiasDaSemanaFacade diasDaSemanaFacade = new DiasDaSemanaFacade();
		return diasDaSemanaFacade.listar();
		
	}

	@Override
	public void editar(Dias_Da_Semana diasDaSemana) {

		DiasDaSemanaFacade diasDaSemanaFacade = new DiasDaSemanaFacade();
		diasDaSemanaFacade.editar(diasDaSemana);
		
	}

	@Override
	public Dias_Da_Semana getObjectTById(Long id) {

		DiasDaSemanaFacade diasDaSemanaFacade = new DiasDaSemanaFacade();
		return diasDaSemanaFacade.getObjectTById(id);
		
	}

	@Override
	public void excluir(Dias_Da_Semana diasDaSemana) {
		
		DiasDaSemanaFacade diasDaSemanaFacade = new DiasDaSemanaFacade();
		diasDaSemanaFacade.excluir(diasDaSemana);
		
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
