package org.sakuraph.tetris.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.sakuraph.tetris.bean.ContainerProperty;
import org.sakuraph.tetris.bean.LayerProperty;

import java.io.InputStream;
import java.util.Iterator;

/**
 * @author sakuraph@sina.cn
 */
public abstract class PropertyLoader {
    private static final ContainerProperty containerProperty = new ContainerProperty();

    static {
        SAXReader reader = new SAXReader();
        try {
            InputStream stream = PropertyLoader.class.getClassLoader().getResourceAsStream("conf.xml");
            Document document = reader.read(stream);
            Element tetris = document.getRootElement();
            Element container = tetris.element("container");
            Iterator layers = container.elementIterator("layer");
            loadContainerProperty(container);
            loadLayerProperties(layers);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    private static void loadContainerProperty(Element container) {
        containerProperty.setBorder(Integer.parseInt(container.attributeValue("border")));
        containerProperty.setHeight(Integer.parseInt(container.attributeValue("height")));
        containerProperty.setWidth(Integer.parseInt(container.attributeValue("width")));
        containerProperty.setTitle(container.attributeValue("title"));
        containerProperty.setWindowTop(Integer.parseInt(container.attributeValue("windowTop")));
        containerProperty.setPadding(Integer.parseInt(container.attributeValue("padding")));
    }

    private static void loadLayerProperties(Iterator layers) {
        while (layers.hasNext()) {
            Element layer = (Element) layers.next();
            LayerProperty layerProperty = new LayerProperty();
            layerProperty.setClz(layer.attributeValue("class"));
            layerProperty.setW(Integer.parseInt(layer.attributeValue("w")));
            layerProperty.setH(Integer.parseInt(layer.attributeValue("h")));
            layerProperty.setX(Integer.parseInt(layer.attributeValue("x")));
            layerProperty.setY(Integer.parseInt(layer.attributeValue("y")));
            containerProperty.getLayerProperties().add(layerProperty);
        }
    }

    public static ContainerProperty getContainerProperty() {
        return containerProperty;
    }
}
