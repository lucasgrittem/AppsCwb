package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Dias_Da_Semana;

public class DiasDaSemanaDao implements InterfaceDao<Dias_Da_Semana>{

	@Override
	public void salvar(Dias_Da_Semana diasDaSemana) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(diasDaSemana);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Dias_Da_Semana> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Dias_Da_Semana a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Dias_Da_Semana diasDaSemana) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(diasDaSemana);

		em.getTransaction().commit();
		
	}

	@Override
	public Dias_Da_Semana getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Dias_Da_Semana.class, id);
		
	}

	@Override
	public void excluir(Dias_Da_Semana t) {
	}
	

	public List<Dias_Da_Semana> listar(Dias_Da_Semana diasDaSemana) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Dias_Da_Semana a");

		return q.getResultList();
		
	}
}
