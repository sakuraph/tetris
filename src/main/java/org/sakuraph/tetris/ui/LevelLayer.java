package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author sakuraph@sina.cn
 */
public class LevelLayer extends NumberLayer {

    private static final Image LEVEL_IMAGE = new ImageIcon("graphics/string/level.png").getImage();
    private static final int LEVEL_IMAGE_WIDTH = LEVEL_IMAGE.getWidth(null);

    public LevelLayer(int x, int y, int w, int h) {
        super(x, y, w, h);

    }

    @Override
    protected void paintLayer(Graphics g) {
        super.paintLayer(g);
        //显示等级字符串
        g.drawImage(LEVEL_IMAGE, x + (w - LEVEL_IMAGE_WIDTH >> 1), y + PADDING, null);
        //显示等级数字
        paintNumber(g, w - (NUMBER_IMAGE_WIDTH << 1) >> 1, 60, gdto.getLevel(), 2);
    }


}
