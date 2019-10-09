package com.springcloud.resttemplateserver.mapper;

import com.springcloud.resttemplateserver.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huangyi
 * @date 2019/10/9 22:39
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
