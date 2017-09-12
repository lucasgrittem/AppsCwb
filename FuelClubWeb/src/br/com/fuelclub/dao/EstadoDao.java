package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Estado;

public class EstadoDao implements InterfaceDao<Estado>{

	@Override
	public void salvar(Estado estado) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(estado);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Estado> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Estado a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Estado estado) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(estado);

		em.getTransaction().commit();
		
	}

	@Override
	public Estado getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Estado.class, id);
		
	}

	@Override
	public void excluir(Estado t) {		
	}
	
	
	public List<Estado> listar(Estado estado) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Estado a");

		return q.getResultList();
		
	}

}
