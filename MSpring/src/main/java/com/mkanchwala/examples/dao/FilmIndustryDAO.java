package com.mkanchwala.examples.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Service;

import com.mkanchwala.examples.beans.Actor;

@Service
public class FilmIndustryDAO extends BaseDAO {

	@SuppressWarnings("unchecked")
	public List<Actor> findAllActors() {
		Criteria criteria = getSession().createCriteria(Actor.class);
		return (List<Actor>) criteria.list();
	}
}
