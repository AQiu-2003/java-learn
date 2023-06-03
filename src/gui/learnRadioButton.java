package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * RadioButton是一个单选框，可以选择多个选项中的一个
 */
public class learnRadioButton {
    public static void main(String[] args) {
        MyRadioButton radioButton1 = new MyRadioButton("Radio1");
        MyRadioButton radioButton2 = new MyRadioButton("Radio2");
        MyRadioButton radioButton3 = new MyRadioButton("Radio3");

        //将单选框放入一个组中，这样就可以保证只有一个单选框被选中
        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        //添加事件
        radioButton1.addActionListener(e -> System.out.println("You chose Radio1"));
        radioButton2.addActionListener(e -> System.out.println("You chose Radio2"));
        radioButton3.addActionListener(e -> System.out.println("You chose Radio3"));
        //或者是一个类实现ActionListener接口
        //然后在actionPerformed方法中判断e.getSource()是哪个单选框，然后执行相应的操作

        //添加提交按钮
        JButton button = new JButton("Submit");
        button.setPreferredSize(new Dimension(100, 40));
        button.addActionListener(e -> {
            //通过ButtonGroup判断哪个单选框被选中
            if (group.getSelection() == radioButton1.getModel()) {
                System.out.println("You chose Radio1");
            } else if (group.getSelection() == radioButton2.getModel()) {
                System.out.println("You chose Radio2");
            } else if (group.getSelection() == radioButton3.getModel()) {
                System.out.println("You chose Radio3");
            }
        });

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(button);
        frame.setVisible(true);
    }

    public static class MyRadioButton extends JRadioButton {
        MyRadioButton(String text) {
            super(text);

            // 设置单选框的外观
            this.setFont(new Font("Consolas", Font.PLAIN, 35));
            this.setForeground(Color.GREEN);
            this.setBackground(Color.BLACK);
//            this.setIcon(new ImageIcon("设置未选中时的图标"));
//            this.setSelectedIcon(new ImageIcon("设置选中时的图标"));
            //如果没有选中时的图标，会显示setIcon设置的图标
        }
    }
}
