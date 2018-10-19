package cn.edu.cdu.chen.pojo;

import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Game> games;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, List<Game> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }

    public User(int id) {
        this.id = id;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
