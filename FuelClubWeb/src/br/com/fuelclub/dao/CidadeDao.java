package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Cidade;

public class CidadeDao implements InterfaceDao<Cidade>{

	@Override
	public void salvar(Cidade cidade) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(cidade);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Cidade> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Cidade a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Cidade cidade) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(cidade);

		em.getTransaction().commit();
		
	}

	@Override
	public Cidade getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Cidade.class, id);
		
	}

	@Override
	public void excluir(Cidade t) {			
	}
	
	public List<Cidade> listar(Cidade cidade) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Cidade a");

		return q.getResultList();
		
	}

}
