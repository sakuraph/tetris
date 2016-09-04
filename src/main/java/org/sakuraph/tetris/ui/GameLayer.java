package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author sakuraph@sina.cn
 */
public class GameLayer extends BorderLayer {
    private static final Image RECT_IMAGE = new ImageIcon("graphics/game/rect.png").getImage();

    public GameLayer(int x, int y, int w, int h) {
        super(x, y, w, h);
    }


    @Override
    protected void paintLayer(Graphics g) {
        super.paintLayer(g);
        //获取当前屏幕上的方块坐标点集合
        Point[] points = gdto.getGameAct().getPoints();
        //获取方块类型
        int type = gdto.getGameAct().getType();
        //绘制方块
        for (Point point : points) {
            drawDiamonds(g, point.x, point.y, type + 1);
        }
        //获取地图
        boolean[][] map = gdto.getGameMap();
        for (int x = 0; x < map.length; x++) {
            for (int y = 0; y < map[x].length; y++) {
                if (map[x][y]) {
                    drawDiamonds(g, x, y, 0);
                }
            }
        }
    }

    private void drawDiamonds(Graphics g, int x, int y, int imageIndex) {
        g.drawImage(RECT_IMAGE,
                this.x + (x << 5) + 7,
                this.y + (y << 5) + 7,
                this.x + (x + 1 << 5) + 7,
                this.y + (y + 1 << 5) + 7,
                imageIndex << 5,
                0,
                (imageIndex + 1) << 5,
                1 << 5
                , null);
    }

}
