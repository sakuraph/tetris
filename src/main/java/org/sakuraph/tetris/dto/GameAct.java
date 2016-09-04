package org.sakuraph.tetris.dto;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sakuraph@sina.cn
 */
public class GameAct {
    public GameAct(int type) {
        init(type);
    }

    private Point[] points;
    private int type;
    private static final List<Point[]> pointsArray;

    static {
        pointsArray = new ArrayList<>(7);
        pointsArray.add(new Point[]{new Point(4, 0), new Point(3, 0), new Point(5, 0), new Point(6, 0)});
        pointsArray.add(new Point[]{new Point(4, 0), new Point(3, 0), new Point(5, 0), new Point(4, 1)});
        pointsArray.add(new Point[]{new Point(4, 0), new Point(3, 0), new Point(5, 0), new Point(3, 1)});
        pointsArray.add(new Point[]{new Point(4, 0), new Point(5, 0), new Point(3, 1), new Point(4, 1)});
        pointsArray.add(new Point[]{new Point(4, 0), new Point(5, 0), new Point(4, 1), new Point(5, 1)});
        pointsArray.add(new Point[]{new Point(4, 0), new Point(3, 0), new Point(5, 0), new Point(5, 1)});
        pointsArray.add(new Point[]{new Point(4, 0), new Point(3, 0), new Point(4, 1), new Point(5, 1)});
    }

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public boolean move(int moveX, int moveY, boolean[][] map) {
        for (Point point : points) {
            if (isOverZone(moveX + point.x, moveY + point.y, map)) {
                return false;
            }
        }
        for (Point point : points) {
            point.x += moveX;
            point.y += moveY;
        }
        return true;
    }

    /**
     * 顺时针旋转 笛卡尔坐标系算法
     * 只不过电脑屏幕是笛卡尔坐标系以X为对称轴的镜像
     * 坐标公式：
     * A.x=O.y+O.x-B.y
     * A.y=O.y-O.x+B.x
     */
    public void round(boolean[][] map) {
        if (this.type == 4) {
            return;
        }
        for (Point point : points) {
            if (isOverZone(points[0].y + points[0].x - point.y, points[0].y - points[0].x + point.x, map)) {
                return;
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (i == 0) {
                continue;
            }
            int roundedX = points[0].y + points[0].x - points[i].y;
            int roundedY = points[0].y - points[0].x + points[i].x;
            points[i].x = roundedX;
            points[i].y = roundedY;
        }
    }

    private boolean isOverZone(int x, int y, boolean[][] map) {
        return x < 0 || x > 9 || y < 0 || y > 17 || map[x][y];
    }

    public void init(int type) {
        this.type = type;
        Point[] srcPoints = pointsArray.get(type);
        points = new Point[srcPoints.length];

        for (int i = 0; i < srcPoints.length; i++) {
            points[i] = new Point(srcPoints[i].x, srcPoints[i].y);
        }
    }

    public int getType() {
        return type;
    }
}
