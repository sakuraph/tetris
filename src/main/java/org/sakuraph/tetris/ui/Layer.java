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
    protected int border = PropertyLoader.getContainerProperty().getBorder();
    protected int padding = PropertyLoader.getContainerProperty().getPadding();
    protected String url;
    protected ClassLoader loader = this.getClass().getClassLoader();
    protected GraphicDataTransferObject gdto;

    public Layer(int x, int y, int w, int h, String url) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.url = url;
    }

    public void render(Graphics g) {
        if (!StringUtils.isEmpty(url)) {
            URL url = loader.getResource(this.url);
            if (url != null) {
                paint(g, new ImageIcon(url).getImage());
            }
        }
    }

    protected abstract void paint(Graphics g, Image image);

    public void setGdto(GraphicDataTransferObject gdto) {
        this.gdto = gdto;
    }
}
