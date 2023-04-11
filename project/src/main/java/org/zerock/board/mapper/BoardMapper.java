package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.vo.BoardVO;

import com.webjjang.util.PageObject;

public interface BoardMapper {

	// DB 처리 기준
	public List<BoardVO> list(PageObject pageObject);
	public long getTotalRow(PageObject pageObject); // pageObject.setTotalRow() 처리해야 데이터를 가져온다.
	
	public BoardVO view(long no);
	public int increase(long no); // 조회수 1증가
	
	public int write(BoardVO vo);
	
	public int update(BoardVO vo);
	
	public int delete(BoardVO vo); // no, pw를 받는다. 
	
	
}
