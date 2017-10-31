package br.com.fuelclub.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fuelclub.entity.Administrador_Sistema;
import br.com.fuelclub.entity.Empresa;

public class AdministradorSistemaDao implements InterfaceDao <Administrador_Sistema> {

	EntityManager em = Conexao.getEntityManager();
	
	@Override
	public void salvar(Administrador_Sistema administradorSistema) {
		em.getTransaction().begin();
		em.persist(administradorSistema);
		em.getTransaction().commit();
	}

	@Override
	public List<Administrador_Sistema> listas() {
		Query q =em.createQuery("select a from Administrador_Sistema a");
		return q.getResultList();
	}

	@Override
	public void editar(Administrador_Sistema administradorSistema) {
		em.getTransaction().begin();
		em.merge(administradorSistema);
		em.getTransaction().commit();
	}

	@Override
	public Administrador_Sistema getObjectTById(Long id) {
		return em.find(Administrador_Sistema.class, id);
	}

	@Override
	public void excluir(Administrador_Sistema administradorSistema) {
		em = Conexao.getEntityManager();
		em.getTransaction().begin();
		Administrador_Sistema administradorSistemaEm = em.merge(administradorSistema);	
		em.remove(administradorSistemaEm);
		em.getTransaction().commit();
	}
	
	
	public Administrador_Sistema listar(Administrador_Sistema administradorSistema) {
		Query q =em.createQuery("select a from Administrador_Sistema a "+
				"where a.administrador_sistema_usuario = '"+administradorSistema.getAdministrador_sistema_usuario() +"' and a.administrador_sistema_senha = '"+ administradorSistema.getAdministrador_sistema_senha() +"'");
		Administrador_Sistema administrador_sistema = new Administrador_Sistema();
		if(q.getResultList().size() == 0){
			return null;
		}
		else{
			administrador_sistema = (Administrador_Sistema) q.getSingleResult();
			return administrador_sistema;
		}
	}

}
