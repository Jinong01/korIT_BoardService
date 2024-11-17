package project1.view;

import project1.controller.BoardController;
import project1.model.dao.BoardDao;
import project1.model.dto.Board;
import project1.model.dto.User;

import java.util.Scanner;

public class BoardView {
    public Scanner sc = new Scanner(System.in);
    private static BoardView boardView = new BoardView();
    public BoardController boardController = new BoardController();
    public static BoardView getInstance(){
        return boardView;
    }

    public void boardWrite(User user){
        System.out.println("게시글을 입력하세요.");
        String content = sc.nextLine();
        boardController.boardWrite(content,user);
    }

    public void boardRead(User user){
        System.out.println("게시글 출력");
        boardController.boardRead(user);
    }
}
