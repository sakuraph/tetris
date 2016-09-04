package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class BackgroundLayer extends Layer {

    private static final Image BACKGROUND_IMAGE = new ImageIcon("graphics/background/light.jpg").getImage();

    public BackgroundLayer(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    protected void paintLayer(Graphics g) {
        g.drawImage(BACKGROUND_IMAGE, x, y, w, h, null);
    }
}
