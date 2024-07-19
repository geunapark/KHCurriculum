package com.kh.app99.notice.dao;


import com.kh.app99.notice.mapper.NoticeMapper;
import com.kh.app99.notice.vo.NoticeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class NoticeDao {

    private final NoticeMapper mapper;

    public List<NoticeVo> getNoticeList() {
        return mapper.getNoticeList();
    }

    public int write(NoticeVo vo) {
        return mapper.write(vo);
    }

    public int edit(String no, NoticeVo vo) {
        return mapper.edit(no,vo);
    }

    public int delete(String no) {
        return mapper.delete(no);
    }

    public NoticeVo getNoticeByNo(String no) {

        return mapper.getNoticeByNo(no);
    }
}
