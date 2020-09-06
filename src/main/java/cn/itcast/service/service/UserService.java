package cn.itcast.service.service;

import cn.itcast.service.mapper.UserMapper;
import cn.itcast.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/6  14:34
 * @Modified By:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
