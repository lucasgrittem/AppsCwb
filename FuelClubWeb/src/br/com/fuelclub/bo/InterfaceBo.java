package br.com.fuelclub.bo;

import java.util.List;

public interface InterfaceBo <T>{
	
	public void salvar (T t) throws Exception;
	public List<T> listar();
	public void editar (T t);
	public T getObjectTById (Long id);
	public void excluir (T t);

}
