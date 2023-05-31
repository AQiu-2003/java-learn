package gui;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
 * JFrame是用于创建和管理图形用户界面中的顶级窗口
 */
public class learnJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        //设置窗口标题
        frame.setTitle("AQiu's Frame");
//      JFrame frame = new Frame("也可以这样写");

        //调整窗口大小、位置
        frame.setSize(400, 300);
        frame.setLocation(200, 200);

        //设置窗口大小不可变
        frame.setResizable(false);

        //设置窗口置顶
        frame.setAlwaysOnTop(true);

        //设置窗口图标
        ImageIcon icon = new ImageIcon("src/gui/iOS_Club_LOGO.png");
        frame.setIconImage(icon.getImage());

        //设置窗口背景颜色
        frame.getContentPane().setBackground(Color.pink);

        //将窗口设置为可见
        frame.setVisible(true);

        //设置关闭窗口时的操作
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
