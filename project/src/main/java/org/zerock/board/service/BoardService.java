package org.zerock.board.service;

import java.util.List;

import org.zerock.board.vo.BoardVO;

import com.webjjang.util.PageObject;

public interface BoardService {
	
	// 요구 처리 기준
	public List<BoardVO> list(PageObject pageObject);
	
	public BoardVO view(long no, int inc);
	
	public int write(BoardVO vo);
	
	public int update(BoardVO vo);
	
	public int delete(BoardVO vo); // no, pw를 받는다. 
	

}
