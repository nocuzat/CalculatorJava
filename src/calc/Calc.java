/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package calc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Thulani
 */
public class Calc {
    JFrame frame = new JFrame("calc");
    JPanel panelTop = new JPanel(new GridLayout(1,1));
    JPanel panel = new JPanel(new GridLayout(4,4));
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton btnClear = new JButton("CE");
    JButton btnAdd = new JButton("+");
    JButton btnMult = new JButton("*");
    JButton btnDiv = new JButton("/");
    JButton btnAns = new JButton("=");
    JButton btndot = new JButton(".");
    JTextField txtfn= new JTextField();
    
    public void ShowGui(){
        panelTop.add(txtfn);
        panel.add(btn9);
        btn9.addActionListener(new nine());
        panel.add(btn8);
        btn8.addActionListener(new eight());
        panel.add(btn7);
        btn7.addActionListener(new seven());
        panel.add(btnClear);
        btnClear.addActionListener(new clear());
        panel.add(btn6);
        btn6.addActionListener(new six());
        panel.add(btn5);
        btn5.addActionListener(new five());
        panel.add(btn4);
        btn4.addActionListener(new four());
        panel.add(btnAdd);
        btnAdd.addActionListener(new add());
        panel.add(btn3);
        btn3.addActionListener(new three());
        panel.add(btn2);
        btn2.addActionListener(new two());
        panel.add(btn1);
        btn1.addActionListener(new one());
        panel.add(btnMult);
        btnMult.addActionListener(new mult());
        panel.add(btn0);
        btn0.addActionListener(new zero());
        panel.add(btndot);
        btndot.addActionListener(new dot());
        panel.add(btnDiv);
        btn9.addActionListener(new div());
        panel.add(btnAns);
        btnAns.addActionListener(new ans());
        
        frame.getContentPane().add(panelTop,BorderLayout.NORTH);
        frame.getContentPane().add(panel,BorderLayout.SOUTH);
        frame.setLocation(300, 200);
        frame.setSize(450,450);
        frame.setVisible(true);
    }
    }
private class one implements ActionListener{
    public void ActionPerfomed(ActionEvent e){
        
    }
}
