package org.sakuraph.tetris.ui;

import javax.swing.*;
import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class PointLayer extends NumberLayer {
    private static final Image POINT_IMAGE = new ImageIcon("graphics/string/point.png").getImage();
    private static final Image RMLINE_IMAGE = new ImageIcon("graphics/string/rmline.png").getImage();

    public PointLayer(int x, int y, int w, int h) {
        super(x, y, w, h);

    }

    @Override
    protected void paintLayer(Graphics g) {
        super.paintLayer(g);
        g.drawImage(POINT_IMAGE, x + PADDING, y + PADDING, null);
        g.drawImage(RMLINE_IMAGE, x + PADDING, y + (PADDING << 2), null);
    }
}
