package br.com.fuelclub.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.fuelclub.entity.Cidade;

public class CidadeDao implements InterfaceDao<Cidade>{
	
	EntityManager em = Conexao.getEntityManager();
	@Override
	public void salvar(Cidade cidade) {
		em.getTransaction().begin();
		em.persist(cidade);
		em.getTransaction().commit();
	}

	@Override
	public List<Cidade> listas() {
		Query q =em.createQuery("select a from Cidade a");
		return q.getResultList();
	}

	@Override
	public void editar(Cidade cidade) {
		em.getTransaction().begin();
		em.merge(cidade);
		em.getTransaction().commit();
	}

	@Override
	public Cidade getObjectTById(Long id) {
		return em.find(Cidade.class, id);
	}

	@Override
	public void excluir(Cidade t) {			
	}
	
	public List<Cidade> listar(Cidade cidade) {
		Query q =em.createQuery("select a from Cidade a");
		return q.getResultList();
	}
	
	public List<Cidade> listarPorEstado(Long id){
		Query q = em.createQuery("select a from Cidade a where estado_id = " + id);
		return q.getResultList();
	}
}
