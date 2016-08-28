package org.sakuraph.tetris.bean;

import org.sakuraph.tetris.bean.LayerProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sakuraph@sina.cn
 */
public class ContainerProperty {
    private int width;
    private int height;
    private int padding;
    private int border;
    private String title;
    private int windowTop;
    private List<LayerProperty> layerProperties = new ArrayList<>();

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPadding() {
        return padding;
    }

    public void setPadding(int padding) {
        this.padding = padding;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<LayerProperty> getLayerProperties() {
        return layerProperties;
    }

    public int getWindowTop() {
        return windowTop;
    }

    public void setWindowTop(int windowTop) {
        this.windowTop = windowTop;
    }

    public void setLayerProperties(List<LayerProperty> layerProperties) {
        this.layerProperties = layerProperties;
    }


}
