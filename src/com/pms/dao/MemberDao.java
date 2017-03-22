package com.pms.dao;

import java.util.List;

import com.pms.form.Member;
import com.pms.form.Task;

public interface MemberDao {

	public List<Member> getUserId(int memberid);

	public List<Member> getAllMembers();

	public List<Member> getUserid(int projectid, int memberid);
	
	public List<Member> getProjectMemberRole(int projectid);
}
