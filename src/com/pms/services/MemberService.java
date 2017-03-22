package com.pms.services;

import java.util.List;

import com.pms.form.Member;

public interface MemberService {

	public List<Member> getUserId(int memberid);

	public List<Member> getUserid(int projectid, int memberid);

	public List<Member> getProjectMemberRole(int projectid);

	public List<Member> getAllMembers();
}
