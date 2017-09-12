package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Servicos_Automotivos;

public class ServicosAutomotivosDao implements InterfaceDao<Servicos_Automotivos>{

	@Override
	public void salvar(Servicos_Automotivos servicosAutomotivos) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(servicosAutomotivos);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Servicos_Automotivos> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Servicos_Automotivos a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Servicos_Automotivos servicosAutomotivos) {
		
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(servicosAutomotivos);

		em.getTransaction().commit();
		
	}

	@Override
	public Servicos_Automotivos getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Servicos_Automotivos.class, id);
		
	}

	@Override
	public void excluir(Servicos_Automotivos t) {	
	}
	
	
	public List<Servicos_Automotivos> listar(Servicos_Automotivos servicosAutomotivos) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Servicos_Automotivos a");

		return q.getResultList();
		
	}

}
