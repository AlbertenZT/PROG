
package Ventanas;

import java.awt.event.*;
import javax.swing.*;

public class IMC extends JFrame implements ActionListener{
    
    private JButton boton;
    private JLabel texto1;
    private JLabel texto2;
    private JTextField campoTextoAltura;
    private JTextField campoTextoPeso;
    
    
    public IMC(){
        super();
        config();
        iniciar();
    }
    
    public void config(){
        this.setTitle("Tituleishon pa la ventaneishon");
        this.setSize(310, 210);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public void iniciar(){
            
        //creamos los componentes
        boton = new JButton();
        campoTextoAltura = new JTextField();
        campoTextoPeso = new JTextField();
        texto1 = new JLabel();
        texto2 = new JLabel();
        
        //Darles valor
        texto1.setText("Peso KG");
        texto1.setBounds(50,50,100,50);
        campoTextoPeso.setBounds(150, 50, 100, 25);
        
        texto2.setText("altura M");
        texto2.setBounds(50, 70, 100, 50);
        campoTextoAltura.setBounds(150, 70, 100, 25);
        
        boton.setText("Soy un boton reshulon");
        boton.setBounds(50, 100, 200, 30);
        boton.addActionListener(this);
        //añadimos
        this.add(texto1);
        this.add(texto2);
        this.add(campoTextoAltura);
        this.add(campoTextoPeso);
        this.add(boton);
        
    }
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        String peso = campoTextoPeso.getText();
        String altura = campoTextoAltura.getText();
        int peso2 = Integer.parseInt(peso);
        double altura2 = Double.parseDouble(altura);
        JOptionPane.showMessageDialog(this,"Tu IMC es: "+(peso2/(altura2*altura2)));
    }
    
    
    public static void main(String[] args){
        IMC nuevo = new IMC();
        nuevo.setVisible(true);
    }
    
}
