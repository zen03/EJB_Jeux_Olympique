package com.cours.dao;

import java.util.List;

import javax.ejb.Local;

import com.cours.entities.Joueur;


@Local
public interface IJoueurLocal {
	public List<Joueur>liste();
	public int add(Joueur joueur);
}
