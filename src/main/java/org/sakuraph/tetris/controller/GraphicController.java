package org.sakuraph.tetris.controller;

import org.sakuraph.tetris.handler.GraphicHandler;
import org.sakuraph.tetris.ui.GraphicPanel;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicController {
    private GraphicPanel panel;
    private GraphicHandler handler;

    public GraphicController(GraphicPanel panel, GraphicHandler handler) {
        this.panel = panel;
        this.handler = handler;
    }

    public void keyUp() {
        handler.keyUp();
        panel.repaint();
    }

    public void keyDown() {

    }

    public void keyLeft() {

    }

    public void keyRight() {

    }
}
