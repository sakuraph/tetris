package org.sakuraph.tetris.ui;

import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class GameLayer extends BorderLayer {

    public GameLayer(int x, int y, int w, int h, String url) {
        super(x, y, w, h, url);
    }

    @Override
    protected void paint(Graphics g, Image image) {
        super.paint(g, image);
        g.drawString(gdto.getPoint() + "",x+padding, y+padding);
    }
}
