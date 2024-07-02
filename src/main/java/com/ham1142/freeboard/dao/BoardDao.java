package com.ham1142.freeboard.dao;

import java.util.ArrayList;

import com.ham1142.freeboard.dto.BoardDto;

public interface BoardDao {

	public void writeDao(String bname, String btitle, String bcontent);
	
	public ArrayList<BoardDto> listDao(); // 글목록 가져오기
}
