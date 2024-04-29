package org.zerock.springex.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    // 셀렉트문 select now()로 DB에서 시간을 가져옴
    @Select("select now()")
    String getTime();
}
