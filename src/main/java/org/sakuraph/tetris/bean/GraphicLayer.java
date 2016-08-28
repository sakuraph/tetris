package org.sakuraph.tetris.bean;

import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicLayer extends Layer {

    public GraphicLayer(int x, int y, int width, int height, String url) {
        super(x, y, width, height, url);
    }

    @Override
    protected void paint(Graphics g, Image image) {
        g.drawImage(image, x + padding, y + padding, null);
    }
}
