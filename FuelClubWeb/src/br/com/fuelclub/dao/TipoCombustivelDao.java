package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Tipo_Combustivel;

public class TipoCombustivelDao implements InterfaceDao<Tipo_Combustivel>{

	@Override
	public void salvar(Tipo_Combustivel tipoCombustivel) {
		
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(tipoCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Tipo_Combustivel> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Tipo_Combustivel a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Tipo_Combustivel tipoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(tipoCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public Tipo_Combustivel getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Tipo_Combustivel.class, id);
		
	}

	@Override
	public void excluir(Tipo_Combustivel t) {	
	}
	
	
	public List<Tipo_Combustivel> listar(Tipo_Combustivel tipoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Tipo_Combustivel a");

		return q.getResultList();
		
	}

}
