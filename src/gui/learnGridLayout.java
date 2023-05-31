package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * 布局管理器是用来管理容器中的组件的位置和大小的
 * <p>
 * BorderLayout（边界布局管理器）将容器分为东、南、西、北、中五个区域，所有额外的组件都放在中间区域
 * <p>
 * FlowLayout（流式布局管理器）将容器分为从左到右的多个区域，当组件填满当前行时，会自动换行
 * <p>
 * <strong>GridLayout（网格布局管理器）将容器分为多行多列的网格，所有组件都放在网格中</strong>
 * <p>
 * CardLayout（卡片布局管理器）将容器分为多个卡片，每次只显示一个卡片，可以通过调用next方法来显示下一个卡片
 * <p>
 * 它们都是容器的默认布局管理器，可以通过setLayout方法来设置容器的布局管理器
 */
public class learnGridLayout {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();

        //创建一个网格布局管理器，指定组件的行数、列数、水平间距、垂直间距
        //默认为1行，n列，0水平间距，0垂直间距
        //如果组件的个数超过了行数乘以列数，会自动增加列数以容纳所有组件
        frame.setLayout(new GridLayout(3,3, 20, 20));

        frame.add(new Button("button1"));
        frame.add(new Button("button2"));
        frame.add(new Button("button3"));
        frame.add(new Button("button4"));
        frame.add(new Button("button5"));
        frame.add(new Button("button6"));
        frame.add(new Button("button7"));
        frame.add(new Button("button8"));
        frame.add(new Button("button9"));
        frame.add(new Button("button10"));

        frame.setVisible(true);
    }
}
