package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * ComboBox是一个下拉框，可以选择其中的一个选项
 */
public class learnComboBox {
    static String[] data = {"A", "B", "C", "D", "E", "F", "G"};
    public static void main(String[] args) {
        //可以使用<>指定下拉框中的选项类型
        JComboBox<String> comboBox = new JComboBox<>();
        //传入一个数组
        comboBox.setModel(new DefaultComboBoxModel<>(data));
        //追加新的选项
        comboBox.addItem("H");
        comboBox.insertItemAt("I", 0);
        //设置默认选项
        comboBox.setSelectedItem("B");
        comboBox.setSelectedIndex(0);
        //删除选项
        comboBox.removeItem("A");
        comboBox.removeItemAt(0);
//        comboBox.removeAllItems();  //删除所有选项

        //添加事件
        comboBox.addActionListener(e -> {
            //获取选中的选项
            System.out.println(comboBox.getSelectedItem());
            //获取选中的选项的索引
            System.out.println(comboBox.getSelectedIndex());
            //获取选中的选项的文本
            System.out.println(comboBox.getSelectedItem().toString());
            //获取选项的数量
            System.out.println(comboBox.getItemCount());
        });

//        comboBox.setEditable(true);   //这条会影响到comboBox的外观（macOS）

        //如果要使用int类型的数组，需要使用Integer[]，而不是int[]
        //因为泛型只能使用类，而不能使用基本数据类型
        Integer[] data2 = {1, 2, 3, 4, 5, 6, 7};
        JComboBox comboBox2 = new JComboBox(data2); //可以不使用<>指定类型
        comboBox2.addActionListener(e -> {
            System.out.println(comboBox2.getSelectedItem());
        });
        //类似的，如果要使用double类型的数组，需要使用Double[]，而不是double[]
        //如果要使用char类型的数组，需要使用Character[]，而不是char[]
        //如果要使用boolean类型的数组，需要使用Boolean[]，而不是boolean[]
        //如果要使用float类型的数组，需要使用Float[]，而不是float[]


        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);
        frame.add(comboBox2);
        frame.setVisible(true);
    }
}
