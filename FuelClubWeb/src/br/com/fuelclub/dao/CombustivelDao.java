package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Combustivel;

public class CombustivelDao implements InterfaceDao<Combustivel>{

	@Override
	public void salvar(Combustivel combustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(combustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Combustivel> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Combustivela a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Combustivel combustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(combustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public Combustivel getObjectTById(Long id) {
		
		EntityManager em = Conexao.getEntityManager();
		return em.find(Combustivel.class, id);
		
	}

	@Override
	public void excluir(Combustivel t) {
	}
	
	
	public List<Combustivel> listar(Combustivel combustivel) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Combustivela a");

		return q.getResultList();
		
	}

}
