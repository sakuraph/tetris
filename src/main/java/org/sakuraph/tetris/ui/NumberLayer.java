package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author sakuraph@sina.cn
 */
public abstract class NumberLayer extends BorderLayer {
    protected static final Image NUMBER_IMAGE = new ImageIcon("graphics/string/number.png").getImage();
    protected static final int NUMBER_IMAGE_WIDTH = NUMBER_IMAGE.getWidth(null)/10;
    protected static final int NUMBER_IMAGE_HEIGHT = NUMBER_IMAGE.getHeight(null);

    public NumberLayer(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    protected void paintNumber(Graphics g, int x, int y, int number, int size) {
        String numberStr = Integer.toString(number);
        for (int i = 0; i < size; i++) {
            if (size - i <= numberStr.length()) {
                //获取数字在字符串中的下标
                int index = i - size + numberStr.length();
                //取出数字
                int bit = numberStr.charAt(index) - '0';
                //绘制数字
                g.drawImage(NUMBER_IMAGE,
                        this.x + x + NUMBER_IMAGE_WIDTH * i,
                        this.y + y,
                        this.x + x + NUMBER_IMAGE_WIDTH * (i + 1),
                        this.y + y + NUMBER_IMAGE_HEIGHT,
                        bit * NUMBER_IMAGE_WIDTH, 0,
                        (bit + 1) * NUMBER_IMAGE_WIDTH,
                        NUMBER_IMAGE_HEIGHT, null);
            }

        }
    }
}
