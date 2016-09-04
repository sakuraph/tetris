package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author sakuraph@sina.cn
 */
public class NextLayer extends BorderLayer {
    private final static Image[] diamonds = new Image[7];

    static {
        for (int i = 0; i < diamonds.length; i++) {
            diamonds[i] = new ImageIcon("graphics/game/"+i+".png").getImage();
        }
    }

    public NextLayer(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    protected void paintLayer(Graphics g) {
        super.paintLayer(g);
        paintAtLayerCenter(g, diamonds[gdto.getNext()]);
    }

    private void paintAtLayerCenter(Graphics g, Image image) {

        g.drawImage(image, x + (w - image.getWidth(null) >> 1), y + (h - image.getHeight(null) >> 1), null);
    }

}
