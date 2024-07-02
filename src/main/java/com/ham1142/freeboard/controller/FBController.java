package com.ham1142.freeboard.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ham1142.freeboard.dao.BoardDao;
import com.ham1142.freeboard.dto.BoardDto;

@Controller
public class FBController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping (value = "/write")
	public String write() {
		return "write_form";
		
	}
	
	@RequestMapping (value = "/writeOk")
	public String writeOk(HttpServletRequest request, Model model) {
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		
		BoardDao boardDao = sqlSession.getMapper(BoardDao.class);
		
		boardDao.writeDao(bname, btitle, bcontent);
		
		return "redirect:list";
		
	}
	
	@RequestMapping (value = "/list")
	public String list(Model model) {
		
		BoardDao boardDao = sqlSession.getMapper(BoardDao.class);

		ArrayList<BoardDto> bDtos = boardDao.listDao();
		
		model.addAttribute("bDtos",bDtos);
		
		return "list";
		
	}
}
