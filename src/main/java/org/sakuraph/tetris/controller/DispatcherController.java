package org.sakuraph.tetris.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author sakuraph@sina.cn
 */
public class DispatcherController extends KeyAdapter {
    private GraphicController controller;

    public DispatcherController(GraphicController controller) {
        this.controller = controller;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                controller.keyUp();
                break;
            case KeyEvent.VK_DOWN:
                controller.keyDown();
                break;
            case KeyEvent.VK_LEFT:
                controller.keyLeft();
                break;
            case KeyEvent.VK_RIGHT:
                controller.keyRight();
                break;
        }
    }
}
