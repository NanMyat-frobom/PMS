package com.pms.dao;

import java.util.List;

import com.pms.form.Project;
import com.pms.form.Task;

public interface ProjectDao {

	public void deleteProject(int projectid);

	public List<Project> getAllProjects();
}
