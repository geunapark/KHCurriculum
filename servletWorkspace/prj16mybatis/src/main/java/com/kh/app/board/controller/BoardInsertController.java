package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // GET 요청에 대한 처리
        // 현재는 부모 클래스의 doGet 메서드를 호출하는데, 필요시 여기에 GET 요청에 대한 로직 추가 가능
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            // 요청에서 제목과 내용을 추출
            String title = req.getParameter("title");
            String content = req.getParameter("content");

            // BoardVo 객체 생성 및 제목과 내용 설정
            BoardVo vo = new BoardVo();
            vo.setContent(content);
            vo.setTitle(title);

            // BoardService 객체 생성
            BoardService bs = new BoardService();

            // BoardService의 insertBoard 메서드를 호출하여 게시글 작성
            int result = bs.insertBoard(vo);

            // 결과를 클라이언트에 응답
            PrintWriter out = resp.getWriter();
            out.write("result: " + result);
        } catch (Exception e) {
            // 예외 발생 시 스택 트레이스 출력
            e.printStackTrace();
        }
    }
}
