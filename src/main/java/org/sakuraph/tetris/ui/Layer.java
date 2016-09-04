package org.sakuraph.tetris.ui;

import org.sakuraph.tetris.dto.GraphicDataTransferObject;
import org.sakuraph.tetris.util.PropertyLoader;
import org.sakuraph.tetris.util.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author sakuraph@sina.cn
 */
public abstract class Layer {
    protected int x;
    protected int y;
    protected int w;
    protected int h;
    protected final int BORDER = PropertyLoader.getContainerProperty().getBorder();
    protected final int PADDING = PropertyLoader.getContainerProperty().getPadding();
    protected GraphicDataTransferObject gdto;

    public Layer(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

    }


    protected abstract void paintLayer(Graphics g);

    public void setGdto(GraphicDataTransferObject gdto) {
        this.gdto = gdto;
    }
}
