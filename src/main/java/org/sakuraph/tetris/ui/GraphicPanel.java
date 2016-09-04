package org.sakuraph.tetris.ui;

import org.sakuraph.tetris.bean.*;
import org.sakuraph.tetris.dto.GraphicDataTransferObject;
import org.sakuraph.tetris.util.PropertyLoader;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Constructor;
import java.util.List;

/**
 * @author sakuraph@sina.cn
 */
public class GraphicPanel extends JPanel {
    private GraphicDataTransferObject gdto;

    public GraphicPanel(GraphicDataTransferObject gdto) {
        this.gdto = gdto;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ContainerProperty property = PropertyLoader.getContainerProperty();
        List<LayerProperty> layerProperties = property.getLayerProperties();
        for (LayerProperty layerProperty : layerProperties) {
            try {
                Class<?> clz = Class.forName(layerProperty.getClz());
                Constructor<?> constructor = clz.getConstructor(int.class, int.class, int.class, int.class);
                Layer layer = (Layer) constructor.newInstance(layerProperty.getX(), layerProperty.getY(), layerProperty.getW(), layerProperty.getH());
                layer.setGdto(gdto);
                layer.paintLayer(g);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.requestFocus();
    }


}
