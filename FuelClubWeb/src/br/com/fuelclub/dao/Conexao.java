package br.com.fuelclub.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("fuelclub");
		
			
	public static EntityManager getEntityManager(){
				return emf.createEntityManager();
	}
}

