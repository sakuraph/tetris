package org.sakuraph.tetris;

import org.sakuraph.tetris.view.GraphicPanel;
import org.sakuraph.tetris.view.Container;

/**
 * @author sakuraph@sina.cn
 */
public class Initializer {
    public static void main(String[] args) {
        Container container = new Container();
        container.setContentPane(new GraphicPanel());
        container.setVisible(true);
    }
}
