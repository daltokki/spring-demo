package com.book.interfaces.member;

import com.book.interfaces.common.AjaxResult;
import com.book.interfaces.member.exception.AlreadyExistsMemberException;
import com.book.interfaces.member.exception.UnMatchedPasswordException;
import com.book.interfaces.member.model.MemberRequestForm;
import com.book.repository.entity.Member;
import com.book.services.application.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/profile")
	@ResponseBody
	public AjaxResult getUserAll() {
		List<Member> memberAll = memberService.getUserAll();
		return AjaxResult.builder().success(true).message("success").build();
	}
}
