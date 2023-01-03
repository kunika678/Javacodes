package javaapplication12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter extends JFrame implements ActionListener {

    JButton submit,clear;
    JTextField amount1; 
    JComboBox currencys;
    String valFrom[]={"EURO","DOLLAR","YUAN","ROMANIA","POUND"};
    
    CurrencyConverter(){
        
        setTitle("Currency Converter");
        setLayout(null);
                                    
        JLabel text = new JLabel("Currency Converter");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,45);
        text.setForeground(Color.WHITE);
        add(text);
               
        JLabel text1 = new JLabel("Amount INR : ");
        text1.setFont(new Font("Osward",Font.BOLD,20));
        text1.setBounds(250,140,200,40);
        text1.setForeground(Color.WHITE);
        add(text1);
                  
        amount1 = new JTextField();
        amount1.setFont(new Font("Osward",Font.BOLD,18));
        amount1.setBounds(400,140,100,30);
        add(amount1);
        
        JLabel to = new JLabel("Convert To  : ");
        to.setFont(new Font("Osward",Font.BOLD,20));
        to.setBounds(250,180,200,40);
        to.setForeground(Color.WHITE);
        add(to);
        
        currencys = new JComboBox(valFrom);
        currencys.setBounds(400,180,100,30);
        currencys.addActionListener(this);
        add(currencys);
                
        clear = new JButton("CLEAR");
        clear.setBounds(280,230,90,30);
        clear.addActionListener(this);
        add(clear);
        
        submit= new JButton("SUBMIT");
        submit.setBounds(390,230,90,30);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.BLACK);
        //setResizable(false);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);          
    }
    
    public void actionPerformed(ActionEvent ae) {
        Double tot;
        Double amount = Double.valueOf(amount1.getText());
        
        if(ae.getSource() == clear)
        {
            amount1.setText("");
            
        }else if("EURO".equals(currencys.getSelectedItem().toString()))
        {									
            tot = amount*0.011;
            JOptionPane.showMessageDialog(null,amount+" INR ="+tot.toString()+" EURO ");
            
        }
        
        else if("DOLLAR".equals(currencys.getSelectedItem().toString()))
        {									
            tot = amount*0.012;
            JOptionPane.showMessageDialog(null,amount+" INR ="+tot.toString()+" DOLLAR ");
            
        }
        
        else if("YUAN".equals(currencys.getSelectedItem().toString()))
        {									
            tot = amount*0.083;
            JOptionPane.showMessageDialog(null,amount+" INR ="+tot.toString()+" YUAN ");
            
        }        

        else if("ROMANIA".equals(currencys.getSelectedItem().toString()))
        {									
            tot = amount*0.056;
            JOptionPane.showMessageDialog(null,amount+" INR ="+tot.toString()+" ROMANIA ");
            
        }
        
        else if("POUND".equals(currencys.getSelectedItem().toString()))
        {									
            tot = amount*0.010;
            JOptionPane.showMessageDialog(null,amount+" INR ="+tot.toString()+" POUNDS ");
            
        }
    }
    
    
    public static void main(String args[]) {
        new CurrencyConverter();
        
    }
}
