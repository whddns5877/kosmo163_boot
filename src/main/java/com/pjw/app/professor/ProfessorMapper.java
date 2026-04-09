package com.pjw.app.professor;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface ProfessorMapper {

	
	//list
	public List<ProfessorDTO> list() throws Exception;
	
	//detail
	public ProfessorDTO detail(ProfessorDTO professorDTO)throws Exception;
	
	//create
	public int create(ProfessorDTO professorDTO) throws Exception;
	
	//update
	public int update(ProfessorDTO professorDTO) throws Exception;
	
	//delete
	public int delete(ProfessorDTO professorDTO) throws Exception;
}
