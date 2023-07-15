package com.hopeing.service;

import java.util.List;

import com.hopeing.beans.vo.BoardVO;

public interface BoardService {
	// 게시글 삭제
	public int delete(Long board_no);
	
	// 게시글 수정
	public boolean update(BoardVO board);
	
	// 게시글 조회수
	public boolean viewsUpdate(Long board_no);
	
	// 게시글 조회
	public BoardVO read(Long board_no);
	
	// 글 등록
	public void register(BoardVO board);
	
	// 게시판 목록
	public List<BoardVO> getList();
}
