package br.com.fuelclub.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.fuelclub.entity.Empresa;

public class EmpresaDao implements InterfaceDao<Empresa> {

	EntityManager em = Conexao.getEntityManager();
	@Override
	public void salvar(Empresa empresa) {
		em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.persist(empresa);

		em.getTransaction().commit();
	}

	@Override
	public List<Empresa> listas() {
		em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Empresa a");

		return q.getResultList();
	}

	@Override
	public void editar(Empresa empresa) {
		em = Conexao.getEntityManager();
		em.getTransaction().begin();
		em.merge(empresa);
		em.getTransaction().commit();
		
	}

	@Override
	public Empresa getObjectTById(Long id) {
		em = Conexao.getEntityManager();
		return em.find(Empresa.class, id);
	}

	@Override
	public void excluir(Empresa empresa) {
		em = Conexao.getEntityManager();
		em.getTransaction().begin();
		Empresa emp = em.merge(empresa);	
		em.remove(emp);
		em.getTransaction().commit();
	}
	
	public List<Empresa> verificaCadastro(Empresa empresa){
		em = Conexao.getEntityManager();
		Query q = em.createQuery("select a from Empresa a " + "where a.empresa_cnpj = '" + empresa.getEmpresa_cnpj() + "'");
		return q.getResultList();
	}
	
	public Empresa recuperarSenha(Empresa empresa){
		
		em = Conexao.getEntityManager();
		Query q = em.createQuery("select a from Empresa a "
				+ "where empresa_login = '" + empresa.getEmpresa_login() + "' or "
						+ "empresa_email = '" + empresa.getEmpresa_email() + "'");
		Empresa empresaRecuperacao = new Empresa();
		if(q.getResultList().size() == 0){
			return null;
		}
		else{
			empresaRecuperacao = (Empresa) q.getSingleResult();
			return empresaRecuperacao;
		}
		
	}
	
	public Empresa listar(Empresa empresa) {
		em = Conexao.getEntityManager();
		Query q =em.createQuery("select a from Empresa a "+
				"where a.empresa_login = '"+empresa.getEmpresa_login() +"' and a.empresa_senha = '"+empresa.getEmpresa_senha()+"'");
		Empresa empresaRet = new Empresa();
		if(q.getResultList().size() == 0){
			return null;
		}
		else{
			empresaRet = (Empresa) q.getSingleResult();
			return empresaRet;
		}
	}

}
