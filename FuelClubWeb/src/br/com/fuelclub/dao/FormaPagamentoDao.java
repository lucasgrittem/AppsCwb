package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Forma_Pagamento;

public class FormaPagamentoDao implements InterfaceDao<Forma_Pagamento>{

	@Override
	public void salvar(Forma_Pagamento formaPagamento) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(formaPagamento);

		em.getTransaction().commit();
		
	}

	@Override
	public List<Forma_Pagamento> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Forma_Pagamento a");

		return q.getResultList();
		
	}

	@Override
	public void editar(Forma_Pagamento formaPagamento) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(formaPagamento);

		em.getTransaction().commit();
		
	}

	@Override
	public Forma_Pagamento getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(Forma_Pagamento.class, id);
		
	}

	@Override
	public void excluir(Forma_Pagamento t) {	
	}
	
	
	public List<Forma_Pagamento> listar(Forma_Pagamento formaPagamento) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Forma_Pagamento a");

		return q.getResultList();
		
	}

}
