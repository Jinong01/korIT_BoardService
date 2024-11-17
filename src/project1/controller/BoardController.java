package project1.controller;

import project1.model.dao.BoardDao;
import project1.model.dto.Board;
import project1.model.dto.User;

public class BoardController {
    public BoardDao boardDao = BoardDao.getInstance();
    public void boardWrite(String content, User user) {
        Board board = new Board(content, user.getName());
        boardDao.boards.add(board);
    }

    public void boardRead(User user){
        for (Board board : boardDao.boards) {
            if (user.getName().equals(board.getWriter())) {
                System.out.println(board);
            }
        }
    }
}