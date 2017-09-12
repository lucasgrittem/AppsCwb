package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Produto;

public class ProdutoDao implements InterfaceDao<Produto>{

	@Override
	public void salvar(Produto produto) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(produto);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Produto> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Produto a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Produto produto) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(produto);

		em.getTransaction().commit();
		
	}

	@Override
	public Produto getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Produto.class, id);
		
	}

	@Override
	public void excluir(Produto t) {	
	}
	
	
	public List<Produto> listar(Produto produto) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Produto a");

		return q.getResultList();
		
	}

}
