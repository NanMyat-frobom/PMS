package com.pms.services;

import java.util.List;

import com.pms.form.Project;

public interface ProjectService {
	public void deleteProject(int projectid);

	public List<Project> getAllProjects();
}
