package gui;

import gui.components.MyFrame;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * MenuBar是一个菜单栏，用于在窗口顶部显示菜单
 */
public class learnMenuBar {
    public static void main(String[] args) {
        JMenuBar menuBar = new JMenuBar();

        // 创建顶层菜单
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");
        JMenu menuHelp = new JMenu("Help");
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);
        menuBar.add(menuHelp);

        // 创建子菜单
        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit (x)");
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.addSeparator(); // 添加分割线
        menuFile.add(itemExit);

        //可以设置图标
        // itemNew.setIcon(new ImageIcon("src/gui/img/new.png"));

        //添加菜单项的监听器
        itemExit.addActionListener(e -> System.exit(0));

        // 设置快捷键
        menuFile.setMnemonic(KeyEvent.VK_F); // 设置顶层菜单快捷键（Alt + F）
        itemExit.setMnemonic(KeyEvent.VK_E); // 设置子菜单快捷键
        itemExit.setMnemonic('x');  //这样也可以设置快捷键（但是会覆盖原来的快捷键）

        MyFrame frame = new MyFrame();
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
