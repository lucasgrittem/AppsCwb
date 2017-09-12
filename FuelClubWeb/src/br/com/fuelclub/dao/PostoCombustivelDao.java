package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.PostoCombustivel;

public class PostoCombustivelDao implements InterfaceDao<PostoCombustivel>{

	@Override
	public void salvar(PostoCombustivel postoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(postoCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public List<PostoCombustivel> listas() {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from PostoCombustivel a");

		return q.getResultList();
		
	}

	@Override
	public void editar(PostoCombustivel postoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(postoCombustivel);

		em.getTransaction().commit();
		
	}

	@Override
	public PostoCombustivel getObjectTById(Long id) {

		EntityManager em = Conexao.getEntityManager();
		return em.find(PostoCombustivel.class, id);
		
	}

	@Override
	public void excluir(PostoCombustivel t) {
	}
	
	
	public List<PostoCombustivel> listar(PostoCombustivel postoCombustivel) {

		EntityManager em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from PostoCombustivel a where postoCombustivel_cnpj = '" + postoCombustivel.postoCombustivel_cnpj + "'");

		return q.getResultList();
		
	}
	
	public PostoCombustivel autenticar(PostoCombustivel postoCombustivel){
		
		EntityManager em = Conexao.getEntityManager();
		
		Query q = em.createQuery("select a from PostoCombustivel a where postoCombustivel_cnpj = '" + postoCombustivel.postoCombustivel_cnpj +"' "
				+ "and postoCombustivel_senha = '" + postoCombustivel.postoCombustivel_senha + "'");
		
		PostoCombustivel postoCombustivelRet = new PostoCombustivel();
		
		if (q.getResultList().size() == 0){
			return null;
		}
		else{
			postoCombustivelRet = (PostoCombustivel) q.getSingleResult();
			return postoCombustivelRet;
		}
		
	}

}
