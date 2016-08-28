package org.sakuraph.tetris;

import org.sakuraph.tetris.controller.DispatcherController;
import org.sakuraph.tetris.controller.GraphicController;
import org.sakuraph.tetris.dto.GraphicDataTransferObject;
import org.sakuraph.tetris.handler.GraphicHandler;
import org.sakuraph.tetris.ui.GraphicPanel;
import org.sakuraph.tetris.ui.Container;

/**
 * @author sakuraph@sina.cn
 */
public class Initializer {
    public static void main(String[] args) {
        //初始化数据传输对象
        GraphicDataTransferObject gdto = new GraphicDataTransferObject();
        //初始化图层容器
        GraphicPanel graphicPanel = new GraphicPanel(gdto);
        //初始化图形处理器
        GraphicHandler handler = new GraphicHandler(gdto);
        //初始化图形控制器
        GraphicController gc = new GraphicController(graphicPanel, handler);
        //分发控制器
        DispatcherController dc = new DispatcherController(gc);
        //设置控制器
        graphicPanel.addKeyListener(dc);
        //初始化主窗体
        new Container(graphicPanel);
    }
}
