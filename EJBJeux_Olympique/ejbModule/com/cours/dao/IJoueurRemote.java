package com.cours.dao;

import java.util.List;

import javax.ejb.Remote;

import com.cours.entities.Joueur;

@Remote
public interface IJoueurRemote {
	public List<Joueur>liste();
	public int add(Joueur joueur);
}
