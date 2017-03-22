package com.pms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pms.dao.MemberDao;
import com.pms.dao.TaskDao;
import com.pms.form.Member;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberdao;

	public List<Member> getUserId(int memberid) {
		return memberdao.getUserId(memberid);
	}

	public List<Member> getUserid(int projectid, int memberid) {
		return memberdao.getUserid(projectid, memberid);
	}

	public List<Member> getAllMembers() {
		return memberdao.getAllMembers();
	}

	public List<Member> getProjectMemberRole(int projectid) {
		return memberdao.getProjectMemberRole(projectid);
	}

}
