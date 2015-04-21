package com.mkanchwala.examples.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkanchwala.examples.beans.Actor;
import com.mkanchwala.examples.dao.FilmIndustryDAO;

@Service
public class FilmIndustryService {
	
	@Autowired
	private FilmIndustryDAO filmIndustryDAO;
	
	public List<Actor> findAllActors() {
		return filmIndustryDAO.findAllActors();
	}

}
