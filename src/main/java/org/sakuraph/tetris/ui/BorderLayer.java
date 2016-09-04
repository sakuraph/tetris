package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class BorderLayer extends Layer {
    private static final Image BORDER_IMAGE = new ImageIcon("graphics/window/border.png").getImage();
    private static final int BORDER_IMAGE_WIDTH = BORDER_IMAGE.getWidth(null);
    private static final int BORDER_IMAGE_HEIGHT = BORDER_IMAGE.getHeight(null);

    public BorderLayer(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    protected void paintLayer(Graphics g) {
        //左上
        g.drawImage(BORDER_IMAGE, x, y, x + BORDER, y + BORDER, 0, 0, BORDER, BORDER, null);
        //中上
        g.drawImage(BORDER_IMAGE, x + BORDER, y, x + w - BORDER, y + BORDER, BORDER, 0, BORDER_IMAGE_WIDTH - BORDER, BORDER, null);
        //右上
        g.drawImage(BORDER_IMAGE, x + w - BORDER, y, x + w, y + BORDER, BORDER_IMAGE_WIDTH - BORDER, 0, BORDER_IMAGE_WIDTH, BORDER, null);
        //左中
        g.drawImage(BORDER_IMAGE, x, y + BORDER, x + BORDER, y + h - BORDER, 0, BORDER, BORDER, BORDER_IMAGE_HEIGHT - BORDER, null);
        //中
        g.drawImage(BORDER_IMAGE, x + BORDER, y + BORDER, x + w - BORDER, y + h - BORDER, BORDER, BORDER, BORDER_IMAGE_WIDTH - BORDER, BORDER_IMAGE_HEIGHT - BORDER, null);
        //右中
        g.drawImage(BORDER_IMAGE, x + w - BORDER, y + BORDER, x + w, y + h - BORDER, BORDER_IMAGE_WIDTH - BORDER, BORDER, BORDER_IMAGE_WIDTH, BORDER_IMAGE_HEIGHT - BORDER, null);
        //左下
        g.drawImage(BORDER_IMAGE, x, y + h - BORDER, x + BORDER, y + h, 0, BORDER_IMAGE_HEIGHT - BORDER, BORDER, BORDER_IMAGE_HEIGHT, null);
        //中下
        g.drawImage(BORDER_IMAGE, x + BORDER, y + h - BORDER, x + w - BORDER, y + h, BORDER, BORDER_IMAGE_HEIGHT - BORDER, BORDER_IMAGE_WIDTH - BORDER, BORDER_IMAGE_HEIGHT, null);
        //右下
        g.drawImage(BORDER_IMAGE, x + w - BORDER, y + h - BORDER, x + w, y + h, BORDER_IMAGE_WIDTH - BORDER, BORDER_IMAGE_HEIGHT - BORDER, BORDER_IMAGE_WIDTH, BORDER_IMAGE_HEIGHT, null);
    }


}
