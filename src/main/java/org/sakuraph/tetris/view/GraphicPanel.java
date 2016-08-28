package org.sakuraph.tetris.view;

import org.sakuraph.tetris.bean.BackgroundLayer;
import org.sakuraph.tetris.bean.BorderLayer;
import org.sakuraph.tetris.bean.GraphicLayer;

import javax.swing.*;
import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicPanel extends JPanel {


    @Override
    protected void paintComponent(Graphics g) {
        new BackgroundLayer(0, 0, 1200, 700, 0, 0, "graphics/background.jpg").render(g);
        new BorderLayer(40, 32, 334, 279, 7, 0, "graphics/border.png").render(g);
        new GraphicLayer(40, 32, 0, 0, 0, 32, "graphics/string/db.png").render(g);
        new GraphicLayer(40, 32, 0, 0, 0, 32, "graphics/string/db.png").render(g);
        new GraphicLayer(40, 32, 0, 0, 0, 32, "graphics/string/db.png").render(g);
        new GraphicLayer(40, 32, 0, 0, 0, 32, "graphics/string/db.png").render(g);
    }


}
