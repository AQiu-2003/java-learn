package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * JLayeredPane是一个层次化的容器，可以将组件分层显示（swing）
 * <p>
 * 通过setLayer方法可以设置组件的层次，层次越大，组件越靠上 Z-Index
 * <p>
 * JLayeredPane的默认布局管理器为null，需要手动设置布局管理器
 */
public class learnJLayeredPane {
    public static void main(String[] args) {
        //创建一个层次化的容器
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.setLayout(null);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(java.awt.Color.red);
        label1.setBounds(50, 50, 200, 200);
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100, 100, 200, 200);
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.blue);
        label3.setBounds(150, 150, 200, 200);


        //添加设置组件的层次
        //由低到高：default -> palette -> modal -> popup -> drag
        //或者使用Integer（数字越大，层次越高）
        //如果二者混用，将以常量为准，数字将被忽略
        layeredPane.add(label1, Integer.valueOf(0));
        layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        MyFrame frame = new MyFrame();
        frame.setLayout(null);  //确保frame的布局管理器为null
        frame.add(layeredPane);
        frame.setVisible(true);
    }
}
