package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Anuncio_Servico_Automotivo;

public class AnuncioServicoAutomotivoDao implements InterfaceDao<Anuncio_Servico_Automotivo>{

	@Override
	public void salvar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(anuncioServicoAutomotivo);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Anuncio_Servico_Automotivo> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Anuncio_Servico_Automotivo a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(anuncioServicoAutomotivo);

		em.getTransaction().commit();
		
	}

	@Override
	public Anuncio_Servico_Automotivo getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Anuncio_Servico_Automotivo.class, id);
		
	}

	@Override
	public void excluir(Anuncio_Servico_Automotivo t) {		
	}
	
	
	public List<Anuncio_Servico_Automotivo> listar(Anuncio_Servico_Automotivo anuncioServicoAutomotivo) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Anuncio_Servico_Automotivo a");

		return q.getResultList();
		
	}

}
