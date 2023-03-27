package com.study.board.controller;

import com.study.board.entity.Board;
import com.study.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class boardController {

    @Autowired
    private BoardService boardService;
    @GetMapping("/board/write")
    public String boardWrite(){

        return "boardWrite";
    }

    @PostMapping("/board/writeGet")
    public String boardWriteGet(Board board) {

        boardService.write(board);

        return "";
    }

    @GetMapping("/board/boardList")
    public String boardList(Model model) {
        model.addAttribute("list", boardService.boardList());
        return "boardList";
    }
}
