package gui;

import javax.swing.*;

/**
 * JOptionPane是一个弹出对话框的类，可以用来显示消息、接收用户输入、选择一项或多项等。
 */
public class learnJOptionPane {
    public static void main(String[] args) {
        //参数：父组件、消息、标题、消息类型
        JOptionPane.showMessageDialog(
                null,
                "Appear when just show message",
                "Plain Message",
                JOptionPane.PLAIN_MESSAGE
                //消息类型：ERROR_MESSAGE、INFORMATION_MESSAGE、WARNING_MESSAGE、QUESTION_MESSAGE、PLAIN_MESSAGE
        );
        JOptionPane.showMessageDialog(null, "Wops! Something wrong!", "Error Message", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Appear when show information!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "FBI Warning!", "Warning Message", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Do you want to continue?", "Question Message", JOptionPane.QUESTION_MESSAGE);

        //具有更多选项的对话框
        int answer = JOptionPane.showConfirmDialog(
                null,
                "Do you want to continue???",
                "Confirm Dialog",
                JOptionPane.YES_NO_CANCEL_OPTION
                //返回值：YES_OPTION(0)、NO_OPTION(1)、CANCEL_OPTION(2)、CLOSED_OPTION(-1)
        );
        System.out.println(answer);

        //具有输入框的对话框
        String name = JOptionPane.showInputDialog(
                null,
                "Please input your name:",
                "Input Dialog",
                JOptionPane.PLAIN_MESSAGE
        );
//        JOptionPane.showInputDialog("也可以这样");
        System.out.println("Hello, " + name + "!");

        //具有自定义选项的对话框
        String[] options = {"A", "B", "C", "D"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Please choose one:",
                "Option Dialog",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
//                new String[] {"这样", "也", "可以"},
                options[0]  //默认选项（用单个数字0也行）
        );
        System.out.println(choice);
    }
}
