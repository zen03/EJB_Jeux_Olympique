package com.cours.dao;

import java.util.List;

import javax.ejb.Remote;

import com.cours.entities.Discipline;

@Remote
public interface IDisciplineRemote {
	public List<Discipline>liste();
	public int add(Discipline discipline);
}
