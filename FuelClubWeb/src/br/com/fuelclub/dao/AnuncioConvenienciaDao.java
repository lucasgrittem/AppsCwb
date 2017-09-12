package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Anuncio_Conveniencia;

public class AnuncioConvenienciaDao implements InterfaceDao<Anuncio_Conveniencia> {

	@Override
	public void salvar(Anuncio_Conveniencia anuncioConveniencia) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(anuncioConveniencia);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Anuncio_Conveniencia> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Anuncio_Conveniencia a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Anuncio_Conveniencia anuncioConveniencia) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(anuncioConveniencia);

		em.getTransaction().commit();
		
	}

	@Override
	public Anuncio_Conveniencia getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Anuncio_Conveniencia.class, id);
		
	}

	@Override
	public void excluir(Anuncio_Conveniencia t) {	
	}
	
	public List<Anuncio_Conveniencia> listar(Anuncio_Conveniencia anuncioConveniencia) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Anuncio_Conveniencia a");

		return q.getResultList();
		
	}

}
