package com.cours.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Discipline implements Serializable{
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int idD;
	@Column
	private String libD;
	
    @OneToMany(mappedBy="discipline", fetch=FetchType.LAZY)
    private List<Joueur> joueurs = new ArrayList<Joueur>();
	  
	public Discipline() {
		super();
	}
	public int getIdD() {
		return idD;
	}
	public void setIdD(int idD) {
		this.idD = idD;
	}
	public String getLibD() {
		return libD;
	}
	public void setLibD(String libD) {
		this.libD = libD;
	}
	public List<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
}
