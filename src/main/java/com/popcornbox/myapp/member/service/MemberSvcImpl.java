package com.popcornbox.myapp.member.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.popcornbox.myapp.member.dao.MemberDAO;
import com.popcornbox.myapp.member.dto.MemberDTO;
import com.popcornbox.myapp.member.dto.PasswdDTO;

@Service
public class MemberSvcImpl implements MemberSvc {

	@Inject
	MemberDAO memberDAO;
	
	@Override
	public int join(MemberDTO memberDTO) {

		return memberDAO.join(memberDTO);
	}

	@Override
	public int modify(MemberDTO memberDTO) {

		return memberDAO.modify(memberDTO);
	}

	@Override
	public int delete(String id, String pw) {

		return memberDAO.delete(id, pw);
	}

	@Override
	public int memberGrade(String id) {

		return memberDAO.memberGrade(id);
	}

	@Override
	public MemberDTO getMember(String id) {

		return memberDAO.getMember(id);
	}

	@Override
	public List<MemberDTO> getMemberList() {

		return memberDAO.getMemberList();
	}

	@Override
	public int changePw(PasswdDTO passwdDTO) {

		return memberDAO.changePw(passwdDTO);
	}

	@Override
	public int goodOrBad(String id, String goodOrBad) {
		
		return memberDAO.goodOrBad(id,goodOrBad);
	}


}
