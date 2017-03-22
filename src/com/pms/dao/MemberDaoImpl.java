package com.pms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pms.form.Member;
import com.pms.form.Task;

public class MemberDaoImpl implements MemberDao {

	@Autowired
	DataSource dataSource;

	public List<Member> getUserId(int memberid) {
		String sql = "select * from member where memberid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Member> memberList = jdbcTemplate.query(sql, new Object[] { memberid }, new RowMapper<Member>() {

			public Member mapRow(ResultSet rs, int rownum) throws SQLException {
				Member member = new Member();
				member.setMemberid(rs.getInt(1));
				member.setMemberrole(rs.getInt(2));
				member.setProjectid(rs.getInt(3));
				member.setTeamid(rs.getInt(4));
				member.setUserid(rs.getInt(5));
				member.setProjectmemberrole(rs.getInt(6));

				return member;
			}

		});
		return memberList;

	}

	public List<Member> getProjectMemberRole(int projectid) {
		String sql = "select * from member where projectid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Member> memberList = jdbcTemplate.query(sql, new Object[] { projectid }, new RowMapper<Member>() {

			public Member mapRow(ResultSet rs, int rownum) throws SQLException {
				Member member = new Member();
				member.setMemberid(rs.getInt(1));
				member.setMemberrole(rs.getInt(2));
				member.setProjectid(rs.getInt(3));
				member.setTeamid(rs.getInt(4));
				member.setUserid(rs.getInt(5));
				member.setProjectmemberrole(rs.getInt(6));

				return member;
			}

		});
		return memberList;

	}

	public List<Member> getUserid(int projectid, int memberid) {
		String sql = "select * from member where projectid=? and memberid=?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		List<Member> memberList = jdbcTemplate.query(sql, new Object[] { projectid, memberid },
				new RowMapper<Member>() {

					public Member mapRow(ResultSet rs, int rownum) throws SQLException {
						Member member = new Member();
						member.setMemberid(rs.getInt(1));
						member.setMemberrole(rs.getInt(2));
						member.setProjectid(rs.getInt(3));
						member.setTeamid(rs.getInt(4));
						member.setUserid(rs.getInt(5));
						member.setProjectmemberrole(rs.getInt(6));

						return member;
					}

				});
		return memberList;
	}

	public List<Member> getAllMembers() {
		String sql = "select * from member";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		List<Member> memberList = jdbcTemplate.query(sql, new RowMapper<Member>() {

			public Member mapRow(ResultSet rs, int rownum) throws SQLException {
				Member member = new Member();
				member.setMemberid(rs.getInt("memberid"));
				member.setMemberrole(rs.getInt("memberrole"));
				member.setProjectid(rs.getInt("projectid"));
				member.setTeamid(rs.getInt("teamid"));
				member.setUserid(rs.getInt("userid"));
				member.setProjectmemberrole(rs.getInt("projectmemberrole"));

				return member;
			}

		});
		return memberList;

	}

}
