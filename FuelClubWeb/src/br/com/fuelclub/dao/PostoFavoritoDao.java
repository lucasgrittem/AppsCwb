package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Posto_Favorito;

public class PostoFavoritoDao implements InterfaceDao<Posto_Favorito>{

	@Override
	public void salvar(Posto_Favorito postoFavorito) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(postoFavorito);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Posto_Favorito> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Posto_Favorito a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Posto_Favorito postoFavorito) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(postoFavorito);

		em.getTransaction().commit();
		
	}

	@Override
	public Posto_Favorito getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Posto_Favorito.class, id);
		
	}

	@Override
	public void excluir(Posto_Favorito t) {	
	}
	
	
	public List<Posto_Favorito> listar(Posto_Favorito postoFavorito) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Posto_Favorito a");

		return q.getResultList();
		
	}

}
