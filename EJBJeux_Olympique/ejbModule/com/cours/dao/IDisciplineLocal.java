package com.cours.dao;

import java.util.List;

import javax.ejb.Local;

import com.cours.entities.Discipline;



@Local
public interface IDisciplineLocal {
	public List<Discipline>liste();
	public int add(Discipline discipline);
}
