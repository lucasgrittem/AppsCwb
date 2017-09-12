package br.com.fuelclub.facade;

import java.util.List;

public interface InterfaceFacade <T>{
	
	public void salvar (T t) throws Exception;
	public List<T> listar();
	public void editar (T t);
	public T getObjectTById (Long id);
	public void excluir (T t);

}
