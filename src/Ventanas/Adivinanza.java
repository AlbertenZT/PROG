/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.event.*;
import javax.swing.*;

public class Adivinanza extends JFrame implements ActionListener{

    int num=(int)((Math.random()*100)+1);
    JLabel texto;
    int intento=0;
    JTextField caja;
    JButton boton;
    JLabel intentos;
    public Adivinanza(){
        super();
        config();
        iniciar();
    }
    
    public void config(){
        this.setTitle("Adivina adivinanza ("+num+")");
        this.setResizable(true);
        this.setSize(310,210);;
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciar(){
        //creamos
        boton = new JButton();
        texto = new JLabel();
        caja = new JTextField();
        intentos = new JLabel();
        
        //iniciamos
        texto.setBounds(50,50,100,50);
        texto.setText("Adivina el numero(1/100)");
        
        intentos.setBounds(50,20,100,50);
        intentos.setText("Intentos"+intento);
        
        caja.setBounds(150, 50, 100, 25);
        
        
        boton.setBounds(50, 100, 200, 30);
        boton.setText("ADIVINAR!");
        boton.addActionListener(this);
        //añadimos
        this.add(caja);
        this.add(boton);
        this.add(texto);
        this.add(intentos);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
            String text = caja.getText();
            int texto2 = Integer.parseInt(text);
            
            
            
            if(texto2==num){
                JOptionPane.showMessageDialog(this,"LO CONSEGUISTE!!! ENHORABUENA");
                
            }
            if(texto2>num){
                JOptionPane.showMessageDialog(this,"Te pasaste de grande!!! mas abajo crack");
                
            }
            if(texto2<num){
                JOptionPane.showMessageDialog(this,"Te pasaste de pequeño!!! mas alto crack");
            }
           intento++;
           intentos.setText("Intentos"+intento);
           
        
        
        
    }
    public static void main(String[] args){
        Adivinanza a = new Adivinanza();
        a.setVisible(true);
    }
    
}
