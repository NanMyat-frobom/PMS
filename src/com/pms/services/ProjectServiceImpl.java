package com.pms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pms.dao.ProjectDao;

import com.pms.form.Project;

public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectDao projectdao;

	@Override
	public void deleteProject(int projectid) {
		projectdao.deleteProject(projectid);
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return projectdao.getAllProjects();
	}

}
