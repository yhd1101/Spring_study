package com.example.demo.controller;

import com.example.demo.model.Board;
import com.example.demo.service.BoardService;
import com.example.demo.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {


    private final BoardService boardService;
    @GetMapping
    public List<Board> readBoardList(){
        List<Board> boardList = boardService.readBoardList();

        return  boardList;
    }

    @PostMapping
    public Board createBoard(@RequestBody Board board){
        return boardService.createBoard(board);
    }

    @GetMapping("/{id}")
    public Board readBoard(@PathVariable("id") Long id){
        Board resultBoard = boardService.readBoard(id);
        return resultBoard;
    }

    @PutMapping("/{id}")

    public Board updateBoard(@PathVariable("id") Long id,@RequestBody Board board ){
        return updateBoard(id,board);
    }

    @DeleteMapping
    public Board deleteBoard(@PathVariable("id") Long id){
        return deleteBoard(id);
    }
}
