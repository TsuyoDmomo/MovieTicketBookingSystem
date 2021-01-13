/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.Document;


/**
 *
 * @author dell
 */

public class LoginPanel extends JFrame  {
   
   JLabel label1,label2,label3;
   JButton button1,button2,button3,button4,button5;
   JCheckBox jcb1,jcb2;
   JTextField name,passWord;
   public LoginPanel(){
     super();
     setIconifiable(true);
     setClosable(true);
     final BorderLayout borderlayout=new BorderLayout();
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     borderlayout.setVgap(35);
     getContentPane().setLayout(borderlayout);
     setTitle("LoginPanel");
     Toolkit toolbox= Toolkit.getDefaultToolkit();
     Dimension screenSize=toolbox.getScreenSize();
     setSize(400,200);
     setLocation((screenSize.width-getWidth())/2,(screenSize.height-getHeight())/2);
     final JPanel mainPanel = new JPanel();
     mainPanel.setLayout(new BorderLayout());
     mainPanel.setBorder(new EmptyBorder(0,0,0,0));
     getContentPane().add(mainPanel);
     final JPanel CenterPanel=new JPanel();
     mainPanel.add(CenterPanel);
     final GridLayout gridlayout=new GridLayout(10,10);
     gridlayout.setHgap(5);
     gridlayout.setVgap(10);
     label1= new JLabel("login");
     label1.setHorizontalAlignment(SwingConstants.CENTER);
     label1.setPreferredSize(new Dimension(0,0));
     label1.setMinimumSize(new Dimension(0,0));
     CenterPanel.add(label1);
     label2=new JLabel("username");
     label2.setHorizontalAlignment(SwingConstants.NORTH_WEST);
     label2.setPreferredSize(new Dimension(0,0));
     label2.setMinimumSize(new Dimension(0,0));
     CenterPanel.add(label2);
     label3=new JLabel("password");
     label3.setHorizontalAlignment(SwingConstants.TRAILING);
     label3.setPreferredSize(new Dimension(0,0));
     label3.setMinimumSize(new Dimension(0,0));
     CenterPanel.add(label3);
     button1=new JButton("—");
     button2=new JButton("X");
     button3=new JButton("Forget Password");
     button3.addActionListener(new ResetPasswordAction());
     button4=new JButton("Login");
     button4.addActionListener(new PanelLoginAction());
     button5=new JButton("register an account");
     jcb1 = new JCheckBox("auto-login");
     jcb2= new JCheckBox("remember me");
     name= new JTextField(15);
     name.setPreferredSize(new Dimension(0,0));
     name.setMinimumSize(new Dimension(0,0));
     CenterPanel.add(name);
     passWord=new JTextField(20);
     passWord.setDocument(new Document(10));
     passWord.setEchoChar( '* ');
     passWord.addKeyListener(new KeyAdapter(){
         public void ketPressed(final KeyEvent e){
             if(e.getKeyCode()==10){
                 button4.doClick();
             }
         }
     });
     CenterPanel.add(passWord);
     
     init();
   }
  private void init(){
      
  }
  private class PanelLoginAction implements ActionListener {
    public void actionPerformed(final ActionEvent e){
        
    }
}
  private class ResetPasswordAction implements ActionListener{
      public void actionPerformed(final ActionEvent e){
          name.setText("");
          passWord.setText("");
      }
  }
   
   
}

class CloseActionListener implements ActionListener{
    public void actionPerformed(final ActionEvent e){
        doDefaultCloseAction();
    }
}