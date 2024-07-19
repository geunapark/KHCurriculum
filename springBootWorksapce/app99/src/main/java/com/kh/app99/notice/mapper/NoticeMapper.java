package com.kh.app99.notice.mapper;

import com.kh.app99.notice.vo.NoticeVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface NoticeMapper {

    @Select("SELECT * FROM NOTICE")
    List<NoticeVo> getNoticeList();

    @Insert("INSERT INTO NOTICE (NO , TITLE , CONTENT ,WRITER_NO ) VALUES (SEQ_NOTICE.NEXTVAL , #{title} , #{content} , #{writerNo})")
    int write(NoticeVo vo);

    @Update("UPDATE NOTICE SET TITLE = #{vo.title} WHERE NO = #{no}")
    int edit(@RequestParam String no, NoticeVo vo);

    @Update("DELETE FROM NOTICE WHERE NO = #{no} ")
    int delete(String no);

    @Select("SELECT * FROM NOTICE WHERE NO = #{no}")
    NoticeVo getNoticeByNo(String no);

}
