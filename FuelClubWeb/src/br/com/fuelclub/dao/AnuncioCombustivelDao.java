package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Anuncio_Combustivel;

public class AnuncioCombustivelDao implements InterfaceDao<Anuncio_Combustivel> {

	@Override
	public void salvar(Anuncio_Combustivel anuncioCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(anuncioCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Anuncio_Combustivel> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Anuncio_Combustivel a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Anuncio_Combustivel anuncioCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(anuncioCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public Anuncio_Combustivel getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Anuncio_Combustivel.class, id);
		
	}

	@Override
	public void excluir(Anuncio_Combustivel t) {	
	}
	
	
	public List<Anuncio_Combustivel> listar(Anuncio_Combustivel anuncioCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Anuncio_Combustivel a");

		return q.getResultList();
		
	}

}
