package br.com.fuelclub.bo;

import java.util.List;

import br.com.fuelclub.dao.DiasDaSemanaDao;
import br.com.fuelclub.entity.Dias_Da_Semana;

public class DiasDaSemanaBo implements InterfaceBo<Dias_Da_Semana>{

	DiasDaSemanaDao diasDaSemanaDao = new DiasDaSemanaDao();
	@Override
	public void salvar(Dias_Da_Semana diasDaSemana) throws Exception {
		
		try {
			diasDaSemanaDao.salvar(diasDaSemana);
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	@Override
	public List<Dias_Da_Semana> listar() {
		return diasDaSemanaDao.listas();
	}

	@Override
	public void editar(Dias_Da_Semana diasDaSemana) {
		diasDaSemanaDao.editar(diasDaSemana);
	}

	@Override
	public Dias_Da_Semana getObjectTById(Long id) {
		return diasDaSemanaDao.getObjectTById(id);
	}

	@Override
	public void excluir(Dias_Da_Semana diasDaSemana) {
		diasDaSemanaDao.excluir(diasDaSemana);
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
