package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Cartao;

public class CartaoDao implements InterfaceDao<Cartao>{

	@Override
	public void salvar(Cartao cartao) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(cartao);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Cartao> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Cartao a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Cartao cartao) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(cartao);

		em.getTransaction().commit();
		
	}

	@Override
	public Cartao getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Cartao.class, id);
		
	}

	@Override
	public void excluir(Cartao t) {		
	}

	
	public List<Cartao> listar(Cartao cartao) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Cartao a");

		return q.getResultList();
		
	}
}
