package calculator;

import javafx.event.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;

class Calculator implements ActionListener {
    JFrame jFrame;
    JTextField jTextField;
    JButton jButton_c,
            jButton_7,
            jButton_8,
            jButton_9,
            jButton_sum,
            jButton_4,
            jButton_5,
            jButton_6,
            jButton_sub,
            jButton_1,
            jButton_2,
            jButton_3,
            jButton_div,
            jButton_0,
            jButton_dec,
            jButton_equ,
            jButton_mul,
            bclr;

    static double a = 0, b = 0, result = 0;
    static int operator = 0;

    Calculator() {
        jFrame = new JFrame("Calculator");
        jFrame.setLocation(200, 500);
        jTextField = new JTextField();
        jTextField.setHorizontalAlignment(JTextField.RIGHT);
        jTextField.setEditable(false);
        jButton_c = new JButton("C");
        jButton_c.setFocusPainted(false);
        jButton_c.setForeground(Color.RED);
        jButton_7 = new JButton("7");
        jButton_7.setFocusPainted(false);
        jButton_8 = new JButton("8");
        jButton_8.setFocusPainted(false);
        jButton_9 = new JButton("9");
        jButton_9.setFocusPainted(false);
        jButton_sum = new JButton("+");
        jButton_sum.setFocusPainted(false);
        jButton_4 = new JButton("4");
        jButton_4.setFocusPainted(false);
        jButton_5 = new JButton("5");
        jButton_5.setFocusPainted(false);
        jButton_6 = new JButton("6");
        jButton_6.setFocusPainted(false);
        jButton_sub = new JButton("--");
        jButton_sub.setFocusPainted(false);
        jButton_1 = new JButton("1");
        jButton_1.setFocusPainted(false);
        jButton_2 = new JButton("2");
        jButton_2.setFocusPainted(false);
        jButton_3 = new JButton("3");
        jButton_3.setFocusPainted(false);
        jButton_div = new JButton("/");
        jButton_div.setFocusPainted(false);
        jButton_0 = new JButton("0");
        jButton_0.setFocusPainted(false);
        jButton_dec = new JButton(".");
        jButton_dec.setFocusPainted(false);
        jButton_equ = new JButton("=");
        jButton_equ.setFocusPainted(false);
        jButton_mul = new JButton("*");
        jButton_mul.setFocusPainted(false);

        jTextField.setBounds(15, 15, 255, 45);
        jButton_c.setBounds(285, 15, 75, 45);
        jButton_7.setBounds(15, 75, 75, 45);
        jButton_8.setBounds(105, 75, 75, 45);
        jButton_9.setBounds(195, 75, 75, 45);
        jButton_div.setBounds(285, 75, 75, 45);
        jButton_4.setBounds(15, 135, 75, 45);
        jButton_5.setBounds(105, 135, 75, 45);
        jButton_6.setBounds(195, 135, 75, 45);
        jButton_mul.setBounds(285, 135, 75, 45);
        jButton_1.setBounds(15, 195, 75, 45);
        jButton_2.setBounds(105, 195, 75, 45);
        jButton_3.setBounds(195, 195, 75, 45);
        jButton_sub.setBounds(285, 195, 75, 45);
        jButton_0.setBounds(15, 255, 75, 45);
        jButton_dec.setBounds(105, 255, 75, 45);
        jButton_equ.setBounds(195, 255, 75, 45);
        jButton_sum.setBounds(285, 255, 75, 45);

        jFrame.add(jTextField);
        jFrame.add(jButton_c);
        jFrame.add(jButton_7);
        jFrame.add(jButton_8);
        jFrame.add(jButton_9);
        jFrame.add(jButton_sum);
        jFrame.add(jButton_4);
        jFrame.add(jButton_5);
        jFrame.add(jButton_6);
        jFrame.add(jButton_sub);
        jFrame.add(jButton_1);
        jFrame.add(jButton_2);
        jFrame.add(jButton_3);
        jFrame.add(jButton_div);
        jFrame.add(jButton_0);
        jFrame.add(jButton_dec);
        jFrame.add(jButton_equ);
        jFrame.add(jButton_mul);

        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setSize(380, 340);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        jButton_c.addActionListener(this);
        jButton_7.addActionListener(this);
        jButton_8.addActionListener(this);
        jButton_9.addActionListener(this);
        jButton_sum.addActionListener(this);
        jButton_4.addActionListener(this);
        jButton_5.addActionListener(this);
        jButton_6.addActionListener(this);
        jButton_sub.addActionListener(this);
        jButton_1.addActionListener(this);
        jButton_2.addActionListener(this);
        jButton_3.addActionListener(this);
        jButton_div.addActionListener(this);
        jButton_0.addActionListener(this);
        jButton_dec.addActionListener(this);
        jButton_equ.addActionListener(this);
        jButton_mul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton_1)
            jTextField.setText(jTextField.getText().concat("1"));

        if (e.getSource() == jButton_2)
            jTextField.setText(jTextField.getText().concat("2"));

        if (e.getSource() == jButton_3)
            jTextField.setText(jTextField.getText().concat("3"));

        if (e.getSource() == jButton_4)
            jTextField.setText(jTextField.getText().concat("4"));

        if (e.getSource() == jButton_5)
            jTextField.setText(jTextField.getText().concat("5"));

        if (e.getSource() == jButton_6)
            jTextField.setText(jTextField.getText().concat("6"));

        if (e.getSource() == jButton_7)
            jTextField.setText(jTextField.getText().concat("7"));

        if (e.getSource() == jButton_8)
            jTextField.setText(jTextField.getText().concat("8"));

        if (e.getSource() == jButton_9)
            jTextField.setText(jTextField.getText().concat("9"));

        if (e.getSource() == jButton_0)
            jTextField.setText(jTextField.getText().concat("0"));

        if (e.getSource() == jButton_dec)
            jTextField.setText(jTextField.getText().concat("."));

        if (e.getSource() == jButton_div) {
            a = Double.parseDouble(jTextField.getText());
            operator = 1;
            jTextField.setText("");
        }

        if (e.getSource() == jButton_mul) {
            a = Double.parseDouble(jTextField.getText());
            operator = 2;
            jTextField.setText("");
        }

        if (e.getSource() == jButton_sub) {
            a = Double.parseDouble(jTextField.getText());
            operator = 3;
            jTextField.setText("");
        }

        if (e.getSource() == jButton_sum) {
            a = Double.parseDouble(jTextField.getText());
            operator = 4;
            jTextField.setText("");
        }

        if (e.getSource() == jButton_equ) {
            b = Double.parseDouble(jTextField.getText());

            boolean isError = false;
            switch (operator) {

                case 1:
                    if (b == 0)
                        isError = true;
                    else
                        result = a / b;
                    break;

                case 2:
                    result = a * b;
                    break;

                case 3:
                    result = a - b;
                    break;

                case 4:
                    result = a + b;
                    break;

                default:
                    result = 0;
            }
            if (isError) {
                jTextField.setText("Error");
                isError = false;
            } else {
                jTextField.setText("" + result);
            }
        }
        if (e.getSource() == jButton_c)
            jTextField.setText("");
    }

    public static void main(String[] args) {

        new Calculator();
    }
}
