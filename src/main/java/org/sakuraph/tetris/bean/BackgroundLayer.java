package org.sakuraph.tetris.bean;

import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class BackgroundLayer extends Layer {

    public BackgroundLayer(int x, int y, int width, int height, int size, int padding, String url) {
        super(x, y, width, height, size, padding, url);
    }

    @Override
    protected void paint(Graphics g, Image image) {
        g.drawImage(image, 0, 0, width, height, null);
    }
}
