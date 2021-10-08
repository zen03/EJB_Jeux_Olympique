package com.cours.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cours.entities.Joueur;

@Stateless
public class JoueurDao implements IJoueurLocal, IJoueurRemote{
	@PersistenceContext(unitName="Jeux_Olympique_UP")
	private EntityManager em;
	@Override
	public List<Joueur> liste() {
		// TODO Auto-generated method stub
		return em.createQuery("SELECT j FROM Joueur j").getResultList();
	}

	@Override
	public int add(Joueur joueur) {
		// TODO Auto-generated method stub
		int ok=0;
		try {
			//em.getTransaction().begin();
			em.persist(joueur);
			//em.getTransaction().commit();
			ok=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

}
