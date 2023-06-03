package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Progress Bar是一个进度条，用于表示任务的完成进度，或者其它需要显示进度的情况。
 */
public class learnProgressBar {
    static JProgressBar bar = new JProgressBar(0, 0, 100);
    public static class ProgressBarDemo {
        MyFrame frame = new MyFrame();

        ProgressBarDemo() {
            //在macOS上，进度条的高度是固定的，无法通过setPreferredSize()方法改变
            bar.setBounds(50, 50, 300, 50);

            bar.setMinimum(0); // 设置最小值
            bar.setMaximum(100); // 设置最大值
            bar.setValue(0); // 设置当前值
            bar.setStringPainted(true); // 显示当前值

            bar.setFont(new Font("Helvetica", Font.BOLD, 20));
            bar.setForeground(Color.red); // 设置进度条前景色（macOS上无效）
            bar.setBackground(Color.lightGray); // 设置进度条背景色（macOS上无效）

            frame.setLayout(null);
            frame.add(bar);
            frame.setVisible(true);

            fill();
        }

        public void fill() {
            // 填充进度条
            int i = 0;
            while (i <= 100) {
                bar.setValue(i);
                try {
                    // 通过线程休眠来模拟填充进度
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i += 10;
            }
            // 填充完成后，显示String
            bar.setString("Done!");
        }
    }


    public static void main(String[] args) {
        new ProgressBarDemo();
    }
}
