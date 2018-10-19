package cn.edu.cdu.chen.test;

import cn.edu.cdu.chen.mapper.gameMapper;
import cn.edu.cdu.chen.mapper.userMapper;
import cn.edu.cdu.chen.pojo.Game;
import cn.edu.cdu.chen.pojo.User;
import cn.edu.cdu.chen.utils.Dbutil;
import org.apache.ibatis.session.SqlSession;

import java.util.Iterator;
import java.util.List;


public class Testconnection {
    public static void main(String[] agrs) {
        SqlSession sqlSession = Dbutil.getSqlSession();
        userMapper usermapper = sqlSession.getMapper(userMapper.class);
        User user = usermapper.getUser(1);
        List<Game> games = user.getGames();
        Iterator iterator = games.iterator();
        while (iterator.hasNext()){
            Game game = (Game) iterator.next();
            System.out.println(game.getGameName());
        }
    }
}
