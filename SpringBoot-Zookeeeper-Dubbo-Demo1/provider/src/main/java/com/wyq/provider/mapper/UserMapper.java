package com.wyq.provider.mapper;

import com.wyq.common.domin.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
/**
 * @ClassName UserMapper
 * @Description: //TODO 接口
 * @Author wyq
 * @Date 2022/4/1 20:07
 */
@Mapper
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "sex", property = "sex")})
    @Select("SELECT * FROM u_user")
    List<User> getAll();

    @Select("SELECT * FROM u_user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(Long id);
}
