package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Pais;

public class PaisDao implements InterfaceDao<Pais>{

	@Override
	public void salvar(Pais pais) {
		
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(pais);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Pais> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Pais a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Pais pais) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(pais);

		em.getTransaction().commit();
		
	}

	@Override
	public Pais getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Pais.class, id);
		
	}

	@Override
	public void excluir(Pais t) {	
	}
	
	
	public List<Pais> listar(Pais pais) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Pais a");

		return q.getResultList();
		
	}

}
