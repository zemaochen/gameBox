package cn.edu.cdu.chen.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Dbutil {
    private static SqlSessionFactory sqlSessionFactory;
    private Dbutil() {}
    static {
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    /**
     *
     * @return sqlsession
     */
    public synchronized static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
