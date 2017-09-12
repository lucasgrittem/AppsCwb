package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Servicos_Conveniencia;

public class ServicosConvenienciaDao implements InterfaceDao<Servicos_Conveniencia>{

	@Override
	public void salvar(Servicos_Conveniencia servicosConveniencia) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(servicosConveniencia);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Servicos_Conveniencia> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Servicos_Conveniencia a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Servicos_Conveniencia servicosConveniencia) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(servicosConveniencia);

		em.getTransaction().commit();
		
	}

	@Override
	public Servicos_Conveniencia getObjectTById(Long id) {
		
		EntityManager em = Conexao.getEntityManager();
		return em.find(Servicos_Conveniencia.class, id);
		
	}

	@Override
	public void excluir(Servicos_Conveniencia t) {	
	}
	
	
	public List<Servicos_Conveniencia> listar(Servicos_Conveniencia servicosConveniencia) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Servicos_Conveniencia a");

		return q.getResultList();
		
	}

}
