package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {

    // GET 요청을 처리하는 메서드
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // BoardService 객체 생성
            BoardService bs = new BoardService();
            
            // BoardService의 getBoardList 메서드를 호출하여 게시글 목록 조회
            List<BoardVo> voList = bs.getBoardList();
            
            // 응답에 게시글 목록을 출력
            PrintWriter out = resp.getWriter();
            out.write("voList: " + voList);
        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스 출력
            e.printStackTrace();
        }
    }

    // POST 요청을 처리하는 메서드 (현재는 사용하지 않음)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 부모 클래스의 doPost 메서드를 호출 (필요 시 이 메서드를 오버라이드하여 POST 요청 처리 가능)
        super.doPost(req, resp);
    }
}
