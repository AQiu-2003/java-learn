package gui;

import javax.swing.*;
import java.awt.*;

/**
 * 布局管理器是用来管理容器中的组件的位置和大小的
 * <p>
 * <strong>BorderLayout（边界布局管理器）将容器分为东、南、西、北、中五个区域，所有额外的组件都放在中间区域</strong>
 * <p>
 * FlowLayout（流式布局管理器）将容器分为从左到右的多个区域，当组件填满当前行时，会自动换行
 * <p>
 * GridLayout（网格布局管理器）将容器分为多行多列的网格，所有组件都放在网格中
 * <p>
 * CardLayout（卡片布局管理器）将容器分为多个卡片，每次只显示一个卡片，可以通过调用next方法来显示下一个卡片
 * <p>
 * 它们都是容器的默认布局管理器，可以通过setLayout方法来设置容器的布局管理器
 */
public class learnBorderLayout {

    public static void main(String[] args) {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);

        //设置panel的大小，否则默认为0
        //Dimension用来封装组件的宽和高（但宽和高可能会expand）
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //再尝试创建嵌套的JPanel-BorderLayout
        {
            JPanel panel6 = new JPanel();
            JPanel panel7 = new JPanel();
            JPanel panel8 = new JPanel();
            JPanel panel9 = new JPanel();
            JPanel panel10 = new JPanel();
            panel6.setBackground(Color.black);
            panel7.setBackground(Color.darkGray);
            panel8.setBackground(Color.gray);
            panel9.setBackground(Color.lightGray);
            panel10.setBackground(Color.white);
            panel6.setPreferredSize(new Dimension(50, 50));
            panel7.setPreferredSize(new Dimension(50, 50));
            panel8.setPreferredSize(new Dimension(50, 50));
            panel9.setPreferredSize(new Dimension(50, 50));
            panel10.setPreferredSize(new Dimension(50, 50));
            panel5.setLayout(new BorderLayout(5, 5));
            panel5.add(panel6, BorderLayout.NORTH);
            panel5.add(panel7, BorderLayout.WEST);
            panel5.add(panel8, BorderLayout.EAST);
            panel5.add(panel9, BorderLayout.SOUTH);
            panel5.add(panel10, BorderLayout.CENTER);
        }

        //初始化一个JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置frame的布局管理器，传参为水平垂直的间距
        frame.setLayout(new BorderLayout(10, 0));    //其实这句话可以不写，因为默认就是BorderLayout

        frame.add(panel1, BorderLayout.NORTH);  //上
        frame.add(panel2, BorderLayout.WEST);   //左
        frame.add(panel3, BorderLayout.EAST);   //右
        frame.add(panel4, BorderLayout.SOUTH);  //下
        frame.add(panel5, BorderLayout.CENTER); //中

        frame.setVisible(true);
    }
}
