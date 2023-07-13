package com.hopeing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopeing.beans.vo.BoardVO;
import com.hopeing.mappers.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	
	// 게시글 조회
	@Override
	public BoardVO read(Long bno) {
		return boardMapper.read(bno);
	}
	
	// 게시글 등록
	@Override
	public void register(BoardVO board) {
		boardMapper.register(board);
		
	}
	
	// 게시글 목록
	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}
}