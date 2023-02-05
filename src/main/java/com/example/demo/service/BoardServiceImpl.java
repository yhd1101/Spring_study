package com.example.demo.service;

import com.example.demo.model.Board;
import com.example.demo.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //bean 등록
@RequiredArgsConstructor //bean 쓰기
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository; // 호출

    @Override
    public List<Board> readBoardList() {
        List<Board> boardList = boardRepository.findAll();
        return boardList;
    }

    @Override
    public Board readBoard(Long id) {
        Board resultBoard = boardRepository.findById(id).orElseThrow(() -> new RuntimeException()); //optional 알아보기

        return resultBoard;
    }
//안녕
    @Override
    public Board createBoard(Board board) {
        Board newBoard = Board.builder().title(board.getTitle()).content(board.getContent()).build();

        boardRepository.save(newBoard);

        return newBoard;
    }

    @Override
    public String updateBoard() {
        return null;
    }

    @Override
    public String deleteBoard() {
        return null;
    }
}
