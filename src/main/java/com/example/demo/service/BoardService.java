package com.example.demo.service;

import com.example.demo.model.Board;

import java.util.List;

public interface BoardService {
    List<Board> readBoardList();
    Board readBoard(Long id);

    Board createBoard(Board board);


    Board updateBoard(Long id, Board board);

    void deleteBoard(Long id);
}
