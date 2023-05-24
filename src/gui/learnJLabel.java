package gui;

import gui.components.myFrame;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 * JLabel是一个显示文本、图像或者同时显示二者的组件
 */
public class learnJLabel {
    public static void main(String[] args) {
        JLabel label = new JLabel();

        //设置标签文字
        label.setText("This is a JLabel~");
        //JLabel label = new JLabel("也可以这样");

        //设置标签图标（缩放）
        ImageIcon image = new ImageIcon("src/gui/iOS_Club_LOGO.png");
        image.setImage(image.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        label.setIcon(image);

        //设置图标文字对齐方式
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        //设置标签在整个容器中的位置
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        //设置图标与文字之间的间距
        label.setIconTextGap(10);

        //设置文字颜色、大小、字体
        label.setForeground(new Color(0x00FF00));
        label.setFont(new java.awt.Font("My Boli", Font.BOLD, 20));
        label.setBackground(Color.black);   //设置背景颜色（不起作用）
        label.setOpaque(true);              //设置背景不透明（使背景颜色起作用）

        //设置边框
        Border border = BorderFactory.createLineBorder(Color.PINK, 3);
        label.setBorder(border);

        //设置bounds，即标签的位置和大小
        label.setBounds(100, 100, 500, 500);    //如果删除了默认布局，则必须要设置bounds

        //继承了JFrame类
        myFrame frame = new myFrame();
        //将默认布局删除（默认布局为BorderLayout，若设为null则必须要为label设置bounds（否则不显示））
        frame.setLayout(null);
        //将label添加到frame中
        frame.add(label);
        //可设置窗口大小自适应
//        frame.pack();
        frame.setVisible(true);
    }
}
