import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Agregar_metas extends JFrame implements ActionListener{
    private JButton boton1,boton2;
    private JLabel etiqueta1,etiqueta2;
    private JTextField nombre;
    private JTextArea descripcion;


    public Agregar_metas() {
        this.setLayout((LayoutManager)null);
        //botones
        this.boton1 = new JButton("Agregar Meta");
        this.boton1.setBounds(10, 10, 200, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Atras");
        this.boton2.setBounds(230, 10, 100, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        //etiquetas
        this.etiqueta1 = new JLabel("Nombre de la Meta:");
        this.etiqueta1.setBounds(10, 45, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Descripción:");
        this.etiqueta2.setBounds(10, 85, 200, 30);
        this.add(this.etiqueta2);
        //nombre
        nombre = new JTextField();
        nombre.setBounds(150,45,200,30);
        add(nombre);
        //descripcion
        descripcion=new JTextArea();
        descripcion.setBounds (10,110,340,100);
        add(descripcion);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            System.exit(0);
        }
        if (e.getSource() == this.boton2) {
            System.exit(0);
        }


    }

    public static void main(String[] args) {
        Agregar_metas launcher = new Agregar_metas();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo((Component)null);
        launcher.setResizable(false);
    }
}
