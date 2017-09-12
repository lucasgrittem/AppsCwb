package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Usuario;

public class UsuarioDao implements InterfaceDao<Usuario>{

	@Override
	public void salvar(Usuario usuario) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(usuario);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Usuario> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Usuario a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Usuario usuario) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(usuario);

		em.getTransaction().commit();
		
	}

	@Override
	public Usuario getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Usuario.class, id);
		
	}

	@Override
	public void excluir(Usuario t) {
	}
	
	
	public List<Usuario> listar(Usuario usuario) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Usuario a");

		return q.getResultList();
		
	}

}
