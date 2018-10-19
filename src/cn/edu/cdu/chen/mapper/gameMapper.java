package cn.edu.cdu.chen.mapper;

import cn.edu.cdu.chen.pojo.Game;

import java.util.List;

public interface gameMapper {
    public Game getGame(int gameId);
    public List<Game> getGames(int userId);
    public List<Game> getAll();
}
