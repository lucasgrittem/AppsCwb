package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Tipo_Pagamento;

public class TipoPagamentoDao implements InterfaceDao<Tipo_Pagamento>{

	@Override
	public void salvar(Tipo_Pagamento tipoPagamento) {
		
		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(tipoPagamento);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Tipo_Pagamento> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Tipo_Pagamento a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Tipo_Pagamento tipoPagamento) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(tipoPagamento);

		em.getTransaction().commit();
		
	}

	@Override
	public Tipo_Pagamento getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Tipo_Pagamento.class, id);
		
	}

	@Override
	public void excluir(Tipo_Pagamento t) {
	}
	
	
	public List<Tipo_Pagamento> listar(Tipo_Pagamento tipoPagamento) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Tipo_Pagamento a");

		return q.getResultList();
		
	}

}
