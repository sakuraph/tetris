package org.sakuraph.tetris.ui;

import org.sakuraph.tetris.bean.ContainerProperty;
import org.sakuraph.tetris.util.PropertyLoader;

import javax.swing.*;
import java.awt.*;

/**
 * @author sakuraph@sina.cn
 */
public class Container extends JFrame {
    private static final String TITLE = PropertyLoader.getContainerProperty().getTitle();
    private static final int WIDTH = PropertyLoader.getContainerProperty().getWidth();
    private static final int HEIGHT = PropertyLoader.getContainerProperty().getHeight();
    private static final int WINDOWTOP = PropertyLoader.getContainerProperty().getWindowTop();

    public Container(GraphicPanel panel) {
        //设置标题
        this.setTitle(TITLE);
        //设置点击退出关闭游戏
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置主容器窗口大小
        this.setSize(WIDTH, HEIGHT);
        //设置不允许用户改变窗口大小
        this.setResizable(false);
        ///设置主容器居中
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screen.width - this.getWidth() >> 1;
        int y = (screen.height - this.getHeight() >> 1) - WINDOWTOP;
        this.setLocation(x, y);
        //设置图层
        this.setContentPane(panel);
        //所有配置完毕才设置可见 避免显示不正常
        this.setVisible(true);
    }
}
