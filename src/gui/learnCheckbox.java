package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Checkbox是一个复选框，可以选择多个选项
 */
public class learnCheckbox {
    public static void main(String[] args) {
        JCheckBox checkBox = new JCheckBox("Check");
        checkBox.setSelected(true);
        checkBox.setEnabled(true);
        checkBox.setFocusable(false);
        checkBox.setText("Check");

        // 设置复选框的外观
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setForeground(Color.GREEN);
        checkBox.setBackground(Color.BLACK);
//        checkBox1.setIcon(new ImageIcon("设置未选中时的图标"));
//        checkBox1.setSelectedIcon(new ImageIcon("设置选中时的图标"));

        //添加一个提交按钮
        JButton button = new JButton("Submit");
        button.setPreferredSize(new Dimension(100, 40));
        button.addActionListener(e -> {
            if (checkBox.isSelected()) {
                System.out.println("Check");
            } else {
                System.out.println("Not Check");
            }
        });

        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(button);
        frame.setVisible(true);
    }
}
