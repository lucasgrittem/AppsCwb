package br.com.fuelclub.dao;

import java.util.List;

public interface InterfaceDao <T>{
	
	public void salvar (T t);
	public List<T> listas();
	public void editar (T t);
	public T getObjectTById (Long id);
	public void excluir (T t);

}
