package cn.edu.cdu.chen.test;

import cn.edu.cdu.chen.mapper.userMapper;
import cn.edu.cdu.chen.pojo.user;
import cn.edu.cdu.chen.utils.Dbutil;
import org.apache.ibatis.session.SqlSession;

public class Testconnection {
    public static  void  main(String[] agrs){
        SqlSession sqlSession = Dbutil.getSqlSession();
        userMapper usermapper = sqlSession.getMapper(userMapper.class);
        user u =usermapper.getUser(1);
        System.out.print(u.getName());
    }
}
