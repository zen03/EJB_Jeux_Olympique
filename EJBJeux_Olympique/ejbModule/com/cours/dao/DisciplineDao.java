package com.cours.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cours.entities.Discipline;

@Stateless
public class DisciplineDao implements IDisciplineLocal, IDisciplineRemote{
	@PersistenceContext(unitName="Jeux_Olympique_UP")
	private EntityManager em;
	@Override
	public List<Discipline> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT d FROM Discipline d").getResultList();
	}

	@Override
	public int add(Discipline discipline) {
		// TODO Auto-generated method stub
		int ok=0;
		try {
			//em.getTransaction().begin();
			em.persist(discipline);
			//em.getTransaction().commit();
			ok=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

}
