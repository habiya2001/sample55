package com.woori.study06.DAO;

import com.woori.study06.VO.MemberVO;

public interface MemberDAO {
	public String getTime();

	public void insertMeber(MemberVO memberVo);
	
	public MemberVO readMember (String userId) throws Exception;
	
	public MemberVO readWithPW(String userId,String userPw) throws Exception;
}
