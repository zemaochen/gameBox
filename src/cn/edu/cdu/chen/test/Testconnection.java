package cn.edu.cdu.chen.test;

import cn.edu.cdu.chen.mapper.userMapper;
import cn.edu.cdu.chen.pojo.User;
import cn.edu.cdu.chen.utils.Dbutil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class Testconnection {
    public static  void  main(String[] agrs){
        SqlSession sqlSession = Dbutil.getSqlSession();
        userMapper usermapper = sqlSession.getMapper(userMapper.class);
        List<User> users = usermapper.getAll();
        System.err.println("listSize:"+users.size());
    }
}
