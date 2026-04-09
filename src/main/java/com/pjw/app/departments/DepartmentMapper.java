package com.pjw.app.departments;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface DepartmentMapper {
	
	//list
	public abstract List<DepartmentDTO> list()throws Exception;
	
	//detail
	public DepartmentDTO detail(DepartmentDTO departmentDTO) throws Exception;
	
	//create
	int create(DepartmentDTO departmentDTO) throws Exception;
	
	//update
	int update(DepartmentDTO departmentDTO)throws Exception;
	
	//delete
	int delete(DepartmentDTO departmentDTO)throws Exception;
}
