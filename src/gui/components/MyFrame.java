package gui.components;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("AQiu's Frame");
        this.setSize(500, 500);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);    //（必须在添加完所有元素后再设为可见？）
    }
}
