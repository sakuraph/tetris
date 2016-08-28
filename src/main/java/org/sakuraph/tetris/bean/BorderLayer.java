package org.sakuraph.tetris.bean;

import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class BorderLayer extends Layer {

    public BorderLayer(int x, int y, int w, int h, String url) {
        super(x, y, w, h, url);
    }

    @Override
    protected void paint(Graphics g, Image image) {
        int image_width = image.getWidth(null);
        int image_height = image.getHeight(null);
        //左上
        g.drawImage(image, x, y, x + border, y + border, 0, 0, border, border, null);
        //中上
        g.drawImage(image, x + border, y, x + w - border, y + border, border, 0, image_width - border, border, null);
        //右上
        g.drawImage(image, x + w - border, y, x + w, y + border, image_width - border, 0, image_width, border, null);
        //左中
        g.drawImage(image, x, y + border, x + border, y + h - border, 0, border, border, image_height - border, null);
        //中
        g.drawImage(image, x + border, y + border, x + w - border, y + h - border, border, border, image_width - border, image_height - border, null);
        //右中
        g.drawImage(image, x + w - border, y + border, x + w, y + h - border, image_width - border, border, image_width, image_height - border, null);
        //左下
        g.drawImage(image, x, y + h - border, x + border, y + h, 0, image_height - border, border, image_height, null);
        //中下
        g.drawImage(image, x + border, y + h - border, x + w - border, y + h, border, image_height - border, image_width - border, image_height, null);
        //右下
        g.drawImage(image, x + w - border, y + h - border, x + w, y + h, image_width - border, image_height - border, image_width, image_height, null);
    }


}
