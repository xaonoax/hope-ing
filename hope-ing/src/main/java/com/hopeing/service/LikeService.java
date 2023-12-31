package com.hopeing.service;

import com.hopeing.beans.vo.BoardVO;
import com.hopeing.beans.vo.LikeVO;

public interface LikeService {
	// 게시글의 좋아요 수
	public Long boardLikeCount(Long like_bno);
	
	// 게시글 좋아요 업데이트
	public void updateBoardLikeCount(BoardVO board);
	
	// 좋아요 업데이트
	public void updateLikeCount(LikeVO like);
	
	// 게시글 좋아요 상태
	public void toggle(Long board_no, String user_id);
	
	// 좋아요 취소
	public void delete(LikeVO like);
	
	// 좋아요
	public void insert(LikeVO like);
}