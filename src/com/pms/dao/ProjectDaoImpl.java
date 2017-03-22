package com.pms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pms.form.Project;
import com.pms.form.Task;

public class ProjectDaoImpl implements ProjectDao {

	@Autowired
	DataSource dataSource;

	public void deleteProject(int projectid) {
		String sql = "delete from project where projectid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql, new Object[] { projectid });
	}

	public List<Project> getAllProjects() {
		String sql = "select * from project";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		List<Project> projectList = jdbcTemplate.query(sql, new RowMapper<Project>() {

			public Project mapRow(ResultSet rs, int rownum) throws SQLException {
				Project project = new Project();
				project.setProjectid(rs.getInt(1));
				project.setProjectname(rs.getString(2));
				project.setProjectstartdate(rs.getString(3));
				project.setProjectenddate(rs.getString(4));
				project.setTeamid(rs.getInt(5));

				return project;
			}

		});
		return projectList;

	}
}
