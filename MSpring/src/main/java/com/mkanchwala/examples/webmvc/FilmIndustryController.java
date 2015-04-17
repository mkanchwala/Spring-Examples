package com.mkanchwala.examples.webmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mkanchwala.examples.beans.Actor;
import com.mkanchwala.examples.service.FilmIndustryService;

public class FilmIndustryController {
	
	@Autowired
	private FilmIndustryService filmIndustryService;

	@Transactional(readOnly = true)
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "/actors", method = RequestMethod.GET)
	public List<Actor> getActors() {
		System.out.println("REST-API : Call to Retrieve the Actors Details ");
		return filmIndustryService.findAllActors();
    }
}
