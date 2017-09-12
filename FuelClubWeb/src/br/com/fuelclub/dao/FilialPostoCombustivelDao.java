package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Filial_Posto_Combustivel;

public class FilialPostoCombustivelDao implements InterfaceDao<Filial_Posto_Combustivel>{

	@Override
	public void salvar(Filial_Posto_Combustivel filialPostoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(filialPostoCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Filial_Posto_Combustivel> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Filial_Posto_Combustivel a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Filial_Posto_Combustivel filialPostoCombustivel) {
		
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(filialPostoCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public Filial_Posto_Combustivel getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Filial_Posto_Combustivel.class, id);
		
	}

	@Override
	public void excluir(Filial_Posto_Combustivel t) {
	}
	
	
	public List<Filial_Posto_Combustivel> listar(Filial_Posto_Combustivel filialPostoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Filial_Posto_Combustivel a");

		return q.getResultList();
		
	}

}
