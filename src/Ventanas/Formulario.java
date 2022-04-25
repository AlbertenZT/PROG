
package Ventanas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener{
    JLabel nombre;
    JTextField Tnombre;
    JLabel mail;
    JTextField Tmail;
    JLabel Contra1;
    JTextField Tcontra1;
    JLabel Contra2;
    JTextField Tcontra2;
    JButton leer;
    JButton escribir;
    
    
    
    //creamos la ventana
    public Formulario(){
        super();
        config();
        iniciar();
    }
    
    public void config(){
        this.setTitle("Formulario");
        this.setBackground(Color.blue);
        this.setResizable(true);
        this.setSize(310, 210);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public void iniciar(){
        //creamos los atributos
        nombre = new JLabel();
        Contra1 = new JLabel();
        Contra2 = new JLabel();
        mail = new JLabel();
        Tmail = new JTextField();
        Tnombre = new JTextField();
        Tcontra1 = new JTextField();
        Tcontra2 = new JTextField();
        leer = new JButton();
        escribir = new JButton();
        
        //iniciamos
        
        nombre.setBounds(50,50,100,50);
        nombre.setText("Nombre: ");
        Tnombre.setBounds(110,65,70,20);
        
        mail.setBounds(50, 70, 100, 50);
        mail.setText("E-mail: ");
        Tmail.setBounds(100,85,70,20);
        
        Contra1.setBounds(50, 90, 100, 50);
        Contra1.setText("Contraseña: ");
        Tcontra1.setBounds(150,105,70,20);
        
        Contra2.setBounds(50, 110, 200, 50);
        Contra2.setText("Repitala Contraseña: ");
        Tcontra2.setBounds(210,125,70,20);
        
        leer.setBounds(50, 20, 70, 20);
        leer.setText("Leer");
        escribir.setText("escribir");
        escribir.setBounds(150, 20, 100, 20);
        leer.addActionListener(this);
        escribir.addActionListener(this);
        //añadir
        add(mail);
        add(nombre);
        add(Contra1);
        add(Contra2);
        add(Tnombre);
        add(Tmail);
        add(Tcontra1);
        add(Tcontra2);
        add(leer);
        add(escribir);
        
        
        
        
        
    }
    public static void main(String[] args){
        Formulario f = new Formulario();
        File fichero = new File("texto.txt");
        f.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pulsado = (JButton)e.getSource();
        
        
        String nombre = this.Tnombre.getText();
        String mail = this.Tmail.getText();
        String C1 = this.Tcontra1.getText();
        String C2 = this.Tcontra2.getText();
        BufferedReader br=null;
        BufferedWriter bw=null;
        
        if(pulsado == leer){
            try {
                br = new BufferedReader(new FileReader("texto.txt"));
                String linea;
                
                while((linea = br.readLine()) != null){
                    
                    String[] campos = linea.split("\\;");
                    
                    Tnombre.setText(campos[0]);
                    Tmail.setText(campos[1]);
                    Tcontra1.setText(campos[2]);
                    Tcontra2.setText(campos[3]);
                }
                
                
                
                
                
                
                
            } catch (FileNotFoundException ex) {
                System.err.println("error al leer");
            } catch (IOException ex) {
                Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(pulsado == escribir){
            try {
                bw = new BufferedWriter(new FileWriter("texto.txt"));
                if(C1.equals(C2)){
                    bw.write(nombre+";"+mail+";"+C1+";"+C2+";");
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Contraseñas no coinciden");
                }
                
                
                
                
                
                
                
                
                
                
            } catch (IOException ex) {
                System.err.println("Error al cargar");
            }
        }
        
        
        
        
        
        
    }





    
}
