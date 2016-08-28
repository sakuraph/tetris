package org.sakuraph.tetris.bean;

import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class BackgroundLayer extends Layer {


    public BackgroundLayer(int x, int y, int width, int height, String url) {
        super(x, y, width, height, url);
    }

    @Override
    protected void paint(Graphics g, Image image) {
        g.drawImage(image, x, y, w, h, null);
    }
}
