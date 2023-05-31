package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel可以添加其他Swing组件，以及其他JPanel来创建层次结构的布局
 */
public class learnJPanel {
    public static void main(String[] args) {
        JLabel label1 = new JLabel("🥰你好哇");
        JLabel label2 = new JLabel("🥰你好哇");
        JLabel label3 = new JLabel("🥰你好哇");
        label1.setBounds(50, 50, 100, 100);
        label2.setBounds(50, 50, 100, 100);
        label3.setBounds(50, 50, 100, 100);
        JLabel labelWithoutBounds1 = new JLabel("😢我可能显示不出来");
        JLabel labelWithoutBounds2 = new JLabel("😢我可能显示不出来");
        JLabel labelWithoutBounds3 = new JLabel("😢我可能显示不出来");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(java.awt.Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(new BorderLayout());
        redPanel.add(label1);
        redPanel.add(labelWithoutBounds1);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(java.awt.Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);
        bluePanel.add(label2);
        bluePanel.add(labelWithoutBounds2);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(java.awt.Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        //默认布局为FlowLayout
        greenPanel.add(label3);
        greenPanel.add(labelWithoutBounds3);

        MyFrame frame = new MyFrame();
        frame.setSize(750, 750);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        JLabel label = new JLabel("😈我是frame里的label");   //发现文字会被截断
        label.setBounds(480, 480, 100, 100);  //不删除默认布局的话，这里的bounds会被忽略
        frame.add(label);
        frame.setVisible(true);
    }
}
