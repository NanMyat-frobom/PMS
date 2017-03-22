package com.pms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pms.form.Task;
import com.pms.form.User;

public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource dataSource;

	public List<User> getUserNameByUserId(int userid) {
		String sql = "select * from user where userid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> userList = jdbcTemplate.query(sql, new Object[] { userid }, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rownum) throws SQLException {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setUseremail(rs.getString("useremail"));
				user.setUserpassword(rs.getString("userpassword"));
				user.setUserphoneno(rs.getString("userphoneno"));
				user.setUsergender(rs.getString("usergender"));
				user.setUseraddress(rs.getString("useraddress"));
				return user;
			}

		});
		return userList;

	}

	public List<User> getAllUsers() {
		String sql = "select * from user";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {

			public User mapRow(ResultSet rs, int rownum) throws SQLException {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setUsername(rs.getString("username"));
				user.setUseremail(rs.getString("useremail"));
				user.setUserpassword(rs.getString("userpassword"));
				user.setUserphoneno(rs.getString("userphoneno"));
				user.setUsergender(rs.getString("usergender"));
				user.setUseraddress(rs.getString("useraddress"));
				return user;
			}

		});
		return userList;
	}

}
