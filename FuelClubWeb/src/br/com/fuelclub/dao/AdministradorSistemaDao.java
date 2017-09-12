package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;

public class AdministradorSistemaDao implements InterfaceDao <Administrador_Sistema> {

	
	@Override
	public void salvar(Administrador_Sistema administradorSistema) {
		
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(administradorSistema);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Administrador_Sistema> listas() {
		
		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Administrador_Sistema a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Administrador_Sistema administradorSistema) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(administradorSistema);

		em.getTransaction().commit();
		
	}

	@Override
	public Administrador_Sistema getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Administrador_Sistema.class, id);
		
	}

	@Override
	public void excluir(Administrador_Sistema t) {	
	}
	
	
	public List<Administrador_Sistema> listar(Administrador_Sistema administradorSistema) {
		
		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Administrador_Sistema a");

		return q.getResultList();
		
	}

}
