package com.kh.app14;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HelloMapper {

    @Select("""
            SELECT * FROM GEUNA
            """)
    List<HelloVo> getList();


    @Insert("""
            INSERT INTO GEUNA(FOOD)
            VALUES(#{food})
            """)
    int insert(HelloVo vo);
}
