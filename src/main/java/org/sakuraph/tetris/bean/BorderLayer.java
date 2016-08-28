package org.sakuraph.tetris.bean;

import org.sakuraph.tetris.util.StringUtils;

import java.awt.*;
import java.net.URL;

/**
 * @author sakuraph@sina.cn
 */
public class BorderLayer extends Layer {

    public BorderLayer(int x, int y, int width, int height, int size, int padding, String url) {
        super(x, y, width, height, size, padding, url);
    }

    @Override
    protected void paint(Graphics g, Image image) {
        int image_width = image.getWidth(null);
        int image_height = image.getHeight(null);
        //左上
        g.drawImage(image, x, y, x + size, y + size, 0, 0, size, size, null);
        //中上
        g.drawImage(image, x + size, y, x + width - size, y + size, size, 0, image_width - size, size, null);
        //右上
        g.drawImage(image, x + width - size, y, x + width, y + size, image_width - size, 0, image_width, size, null);
        //左中
        g.drawImage(image, x, y + size, x + size, y + height - size, 0, size, size, image_height - size, null);
        //中
        g.drawImage(image, x + size, y + size, x + width - size, y + height - size, size, size, image_width - size, image_height - size, null);
        //右中
        g.drawImage(image, x + width - size, y + size, x + width, y + height - size, image_width - size, size, image_width, image_height - size, null);
        //左下
        g.drawImage(image, x, y + height - size, x + size, y + height, 0, image_height - size, size, image_height, null);
        //中下
        g.drawImage(image, x + size, y + height - size, x + width - size, y + height, size, image_height - size, image_width - size, image_height, null);
        //右下
        g.drawImage(image, x + width - size, y + height - size, x + width, y + height, image_width - size, image_height - size, image_width, image_height, null);
    }


}
