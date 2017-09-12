package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Bandeira;

public class BandeiraDao implements InterfaceDao<Bandeira>{

	@Override
	public void salvar(Bandeira bandeira) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(bandeira);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Bandeira> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Bandeira a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Bandeira bandeira) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(bandeira);

		em.getTransaction().commit();
		
	}

	@Override
	public Bandeira getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Bandeira.class, id);
		
	}

	@Override
	public void excluir(Bandeira t) {	
	}
	
	
	public List<Bandeira> listar(Bandeira bandeira) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Bandeira a");

		return q.getResultList();
		
	}

}
