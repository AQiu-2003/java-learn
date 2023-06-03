package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Textfield是一个单行文本输入框，可以用来输入单行文本，比如用户名、密码等。
 */
public class learnTextfield {
    public static class MyField extends JFrame implements ActionListener {
        //可以设定文本框的初始文本
        JTextField textField = new JTextField("Hello");
        JButton button = new JButton("Submit");

        MyField() {
            textField.setText("也可以在这里设置文本");

            // 设置文本框的宽高
            textField.setPreferredSize(new Dimension(200, 40));
            // setPreferredSize和setSize的区别是，前者是设置组件的首选大小，后者是设置组件的大小

            button.setPreferredSize(new Dimension(100, 40));
            button.addActionListener(this);

            // 设置文本框的外观
            textField.setFont(new Font("Consolas", Font.PLAIN, 35));
            textField.setForeground(Color.GREEN);   // 设置文本的颜色
            textField.setBackground(Color.BLACK);   // 设置文本框的背景颜色
            textField.setCaretColor(Color.WHITE);   // 设置光标的颜色

            MyFrame frame = new MyFrame();
            frame.setLayout(new FlowLayout());
            frame.add(textField);
            frame.add(button);
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                // getText()方法可以获取文本框中的文本
                System.out.println(textField.getText());
                // 将文本框中的文本设置为不可编辑
                button.setEnabled(false);
                textField.setEditable(false);
            }
        }
    }

    public static void main(String[] args) {
        new MyField();
    }
}
