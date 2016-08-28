package org.sakuraph.tetris.view;

import javax.swing.*;
import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class Container extends JFrame {
    public Container() {
        //设置标题
        this.setTitle("Tetris");
        //设置点击退出关闭游戏
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置主容器窗口大小
        this.setSize(1200, 700);
        //设置不允许用户改变窗口大小
        this.setResizable(false);
        ///设置主容器居中
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - this.getWidth()) / 2;
        int y = (screen.height - this.getHeight()) / 2 - 32;
        this.setLocation(x, y);
    }
}
