package com.kh.app99.notice.service;


import com.kh.app99.notice.dao.NoticeDao;
import com.kh.app99.notice.vo.NoticeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeDao dao;

    public List<NoticeVo> getNoticeList() {
        return dao.getNoticeList();
    }

    public int write(NoticeVo vo) {
        return dao.write(vo);
    }

    public int edit(String no, NoticeVo vo) {
        return dao.edit(no, vo);
    }

    public int delete(String no) {
        return dao.delete(no);
    }

    public NoticeVo getNoticeByNo(String no) {
        return dao.getNoticeByNo(no);
    }
}
