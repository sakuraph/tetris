package org.sakuraph.tetris.dto;

import java.util.List;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicDataTransferObject {
    private List<Player> dbPlayers;
    private List<Player> localPlayer;
    private boolean[][] gameMap;
    private GameAct gameAct;
    private int next;
    private int level;
    private int point;
    private int line;

    public GraphicDataTransferObject() {
        init();
    }

    public void init() {
        gameMap=new boolean[10][18];
    }

    public List<Player> getDbPlayers() {
        return dbPlayers;
    }

    public void setDbPlayers(List<Player> dbPlayers) {
        this.dbPlayers = dbPlayers;
    }

    public List<Player> getLocalPlayer() {
        return localPlayer;
    }

    public void setLocalPlayer(List<Player> localPlayer) {
        this.localPlayer = localPlayer;
    }

    public boolean[][] getGameMap() {
        return gameMap;
    }

    public void setGameMap(boolean[][] gameMap) {
        this.gameMap = gameMap;
    }

    public GameAct getGameAct() {
        return gameAct;
    }

    public void setGameAct(GameAct gameAct) {
        this.gameAct = gameAct;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
