package org.sakuraph.tetris.handler;

import org.sakuraph.tetris.dto.GraphicDataTransferObject;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicHandler {
    private GraphicDataTransferObject gdto;

    public GraphicHandler(GraphicDataTransferObject gdto) {
        this.gdto = gdto;
    }

    public void keyUp() {
        gdto.setPoint(gdto.getPoint() + 1);
    }
}
