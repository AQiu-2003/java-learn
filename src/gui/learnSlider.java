package gui;

import gui.components.MyFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * JSlider是一个滑动条，可以用来选择一个范围值。
 */
public class learnSlider {
    public static class SliderDemo implements ChangeListener {
        MyFrame frame = new MyFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        // 创建一个水平滑动条, 最小值0, 最大值100, 初始值50

        SliderDemo() {
            slider.setPreferredSize(new Dimension(300, 300));

            slider.setPaintTicks(true); // 显示小刻度
            slider.setMinorTickSpacing(10); // 设置小刻度间隔
            slider.setPaintTrack(true); // 显示大刻度
            slider.setMajorTickSpacing(20); // 设置大刻度间隔
            slider.setPaintLabels(true); // 显示大刻度标签

            slider.setFont(new Font("Helvetica", Font.BOLD, 15));
            slider.setOrientation(JSlider.VERTICAL); // 重新设置滑动条方向（注意宽度大小）
            slider.setInverted(true); // 反转滑动条，最大值在上，最小值在下

            slider.addChangeListener(this);

            label.setText("当前值: " + slider.getValue());

            panel.add(slider);
            panel.add(label);
            frame.add(panel);
            frame.setVisible(true);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            // 当滑动条的值发生改变时，会触发该事件
            label.setText("当前值: " + slider.getValue());
        }
    }

    public static void main(String[] args) {
        new SliderDemo();
    }
}
