package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class openANewWindow {
    public static void main(String[] args) {
        new LaunchPage();
    }

    public static class LaunchPage implements ActionListener {
        JFrame frame = new JFrame("Launch Page");
        JButton button = new JButton("Launch");

        LaunchPage() {
            button.setBounds(100, 160, 200, 40);
            button.setFocusable(false);
            button.addActionListener(this);

            frame.add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 420);
            frame.setLayout(null);
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
//                frame.dispose();    //关闭当前窗口
                new NewWindow();
            }
        }

        public static class NewWindow {
            JFrame frame = new JFrame("New Window");
            JLabel label = new JLabel("Hello");

            NewWindow() {
                label.setBounds(0, 0, 100, 50);
                label.setFont(new Font(null, Font.PLAIN, 25));
                frame.add(label);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420, 420);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        }
    }
}