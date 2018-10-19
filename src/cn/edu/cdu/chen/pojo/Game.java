package cn.edu.cdu.chen.pojo;

public class Game {
    private int gameId;
    private String gameName;
    private  int userId;
    public Game() {
    }

    public Game(int gameId, String gameName, int userId) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.userId = userId;
    }

    public Game(int gameId, String gameName) {
        this.gameId = gameId;
        this.gameName = gameName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
}
