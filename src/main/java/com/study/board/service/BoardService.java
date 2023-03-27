package com.study.board.service;

import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.study.board.entity.Board;

@Service
public class BoardService {

    @Autowired // spring been이 알아서 주입해준다.
    private BoardRepository boardRepository;
    public void write(Board board){
        boardRepository.save(board);
    }
}
