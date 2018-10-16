package cn.edu.cdu.chen.mapper;

import cn.edu.cdu.chen.pojo.user;

public interface userMapper {
    public user getUser(int userId);
    public int deleteUser(int userId);
    public int insertUser(user user);
}
