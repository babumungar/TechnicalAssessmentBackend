package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Skill;
import com.stg.service.SkillService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "skill")
public class SkillController {
	@Autowired
	private SkillService skillService;
//
//	@PostMapping(value = "create/{}")
//	public ResponseEntity<Skill> createSkill(@RequestBody Skill skill, @PathVariable("rating") ) {
//		return new ResponseEntity<Skill>(skillService.add(skill, rating), HttpStatus.CREATED);
//	}

}
