package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class learnButton {
    //Jbutton是一个按钮，可以添加到JFrame上
    public static void main(String[] args) {
        MyButtonFrame frame = new MyButtonFrame();
        frame.MyFrame();
    }

    public static class MyButtonFrame extends JFrame implements ActionListener {
        //需要将JButton作为类的成员变量，否则无法在actionPerformed中使用
        JButton button;
        JLabel label;

        void MyFrame() {
            button = new JButton("点我啊");
            button.setBounds(50, 50, 250, 100);

            //添加监听器，监听器是一个接口，需要实现actionPerformed方法
            button.addActionListener(this);
            //也可以使用lambda表达式
            button.addActionListener((e -> System.out.println("你点了我1")));
            //或者使用匿名内部类
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("你点了我3");
                }
            });

            //设置按钮的图标
            ImageIcon icon = new ImageIcon("src/gui/iOS_Club_LOGO.png");
            icon.setImage(icon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
            button.setIcon(icon);
            button.setVerticalTextPosition(JButton.BOTTOM);
            button.setHorizontalTextPosition(JButton.CENTER);

            //设置按钮的字体、颜色、大小
            button.setFont(new Font("Helvetica", Font.BOLD, 20));
            button.setIconTextGap(10);
            button.setForeground(Color.pink);
//            button.setBorder(BorderFactory.createEtchedBorder());

            //可以设置按钮的状态（是否可用、是否可获得焦点）
            button.setEnabled(true);
            button.setFocusable(true);

            //在点击按钮后显示的标签（需要先设置为不可见）
            label = new JLabel("这是一个标签，会在点击按钮后显示");
            label.setBounds(50, 150, 250, 100);
            label.setVisible(false);

            //对JFrame进行设置
            add(button);
            add(label);
            setLayout(null);
            setSize(300, 300);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                System.out.println("你点了我2");
                //设置按钮不可用，标签可见
                button.setEnabled(false);
                label.setVisible(true);
            }
        }
    }
}
