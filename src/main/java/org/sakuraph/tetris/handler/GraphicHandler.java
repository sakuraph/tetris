package org.sakuraph.tetris.handler;

import org.sakuraph.tetris.dto.GameAct;
import org.sakuraph.tetris.dto.GraphicDataTransferObject;

import java.awt.*;
import java.util.Random;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicHandler {
    private GraphicDataTransferObject gdto;
    private final Random random = new Random();

    public GraphicHandler(GraphicDataTransferObject gdto) {
        this.gdto = gdto;
        gdto.setGameAct(new GameAct(new Random().nextInt(7)));
    }

    public void keyUp() {
        gdto.getGameAct().round(gdto.getGameMap());
    }


    public void keyDown() {
        //获取地图对象
        boolean[][] map = gdto.getGameMap();
        if (gdto.getGameAct().move(0, 1, map)) {
            return;
        }
        //获取方块坐标数组
        Point[] points = gdto.getGameAct().getPoints();
        //堆积方块到地图
        for (Point point : points) {
            map[point.x][point.y] = true;
        }
        // TODO: 2016-09-03 判断是否可以消行
        // TODO: 2016-09-03 消行操作
        // TODO: 2016-09-03 算分操作
        // TODO: 2016-09-03 判断是否升级
        // TODO: 2016-09-03 升级
        // 刷新一个新的方块
        gdto.getGameAct().init(gdto.getNext());
        // 随机生成下一个方块
        gdto.setNext(random.nextInt(7));
    }

    public void keyLeft() {
        gdto.getGameAct().move(-1, 0, gdto.getGameMap());
    }

    public void keyRight() {
        gdto.getGameAct().move(1, 0, gdto.getGameMap());
    }
}
