package com.mkanchwala.examples.dao;

import java.util.List;

import org.hibernate.Criteria;

import com.mkanchwala.examples.beans.Actor;

public class FilmIndustryDAO extends BaseDAO {

	@SuppressWarnings("unchecked")
	public List<Actor> findAllActors() {
		Criteria criteria = getSession().createCriteria(Actor.class);
		return (List<Actor>) criteria.list();
	}
}
