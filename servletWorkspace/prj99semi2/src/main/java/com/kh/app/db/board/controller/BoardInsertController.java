
package com.kh.app.db.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.db.board.service.BoardService;
import com.kh.app.db.board.vo.BoardVo;
import com.kh.app.db.board.vo.categoryVo;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet {

    // 게시글 작성 화면 요청 처리
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	try {
    		BoardService bs =new BoardService();
        	List<categoryVo> categoryVoList =bs.getCategoryVoList();
        	
            req.setAttribute("categoryVoList", categoryVoList);
            req.getRequestDispatcher("/WEB-INF/views/board/insert.jsp").forward(req, resp);
        
        
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    		e.printStackTrace();
    		req.setAttribute("errMsg", e.getMessage());
    		req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
    	}
    	
    }
    // 게시글 작성 처리
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        try {
            HttpSession session = req.getSession();
            
            // 요청 파라미터에서 데이터 추출
            String title = req.getParameter("title"); // 제목
            String content = req.getParameter("content"); // 내용
            String category = req.getParameter("category"); // 카테고리
            
            // 세션에서 로그인 회원 정보 가져오기
            MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
            String writerNo = loginMemberVo.getNo(); // 작성자 회원 번호
            
            // 게시글 정보를 담은 BoardVo 객체 생성 및 설정
            //
            //게시글 정보를 담은 BoardVo 객체를 생성하고 설정하는 이유는 게시글 작성에 필요한 데이터를 객체로 구성하여 서비스 계층(BoardService)로 전달하기 위함입니다.
            BoardVo vo = new BoardVo();
            vo.setTitle(title);
            vo.setContent(content);
            vo.setCategoryNo(category);
            vo.setWriterNo(writerNo);
            
            // 게시글 작성 서비스 호출
            BoardService bs = new BoardService();
            int result = bs.insert(vo);
            
            // 작성 결과 확인 후 리다이렉트
            if (result != 1) {
                throw new Exception("게시글 작성 실패...");
            }
            resp.sendRedirect("/app/board/list"); // 목록 페이지로 리다이렉트
            
        } catch (Exception e) {
            // 예외 발생 시 처리
            System.out.println(e.getMessage());
            e.printStackTrace();
            
            // 에러 메시지를 request 속성에 저장하고 에러 페이지로 포워딩
            req.setAttribute("errMsg", e.getMessage());
            req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
        }
        
    }
    
}