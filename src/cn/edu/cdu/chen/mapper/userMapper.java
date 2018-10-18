package cn.edu.cdu.chen.mapper;

import cn.edu.cdu.chen.pojo.User;

import java.util.List;

public interface userMapper {
    public User getUser(int userId);
    public List<User> getAll();
}
