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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Joueur implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idJ;
	@Column(length=100)
	private String nomJ;
	@Column(length=100)
	private String prenomJ;
	
	@ManyToOne
	@JoinColumn(name="discipline_ID")
	private Discipline discipline;
	
	@ManyToOne
	@JoinColumn(name="joueur_ID")
	private Joueur entraineur;
	

	@OneToMany(mappedBy="entraineur", fetch=FetchType.LAZY)
	private List<Joueur> joueurs = new ArrayList<Joueur>();
	
	public Joueur() {
		
	}

	public int getIdJ() {
		return idJ;
	}

	public void setIdJ(int idJ) {
		this.idJ = idJ;
	}

	public String getNomJ() {
		return nomJ;
	}

	public void setNomJ(String nomJ) {
		this.nomJ = nomJ;
	}

	public String getPrenomJ() {
		return prenomJ;
	}

	public void setPrenomJ(String prenomJ) {
		this.prenomJ = prenomJ;
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public Joueur getEntraineur() {
		return entraineur;
	}

	public void setEntraineur(Joueur entraineur) {
		this.entraineur = entraineur;
	}

	public List<Joueur> getJoueurs() {
		return joueurs;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	
	
}
