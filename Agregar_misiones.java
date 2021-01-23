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

public class Agregar_misiones extends JFrame implements ItemListener,ActionListener{
    private JButton boton1,boton2;
    private JTextField nombre;
    private JTextArea descripcion;
    private JComboBox combo1,combo2;
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4;

    public Agregar_misiones() {
        //layout
        this.setLayout((LayoutManager)null);
        //botones
        this.boton1 = new JButton("Agregar Misión");
        this.boton1.setBounds(10, 10, 200, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Atrás");
        this.boton2.setBounds(230, 10, 100, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        //nombre
        nombre = new JTextField();
        nombre.setBounds(150,120,200,30);
        add(nombre);
        //descripcion
        descripcion=new JTextArea();
        descripcion.setBounds (10,200,340,100);
        add(descripcion);
        //scroll
        combo1 = new JComboBox();
        combo1.setBounds(150,45,80,30);
        add(combo1);
        combo1.addItem("Lunes");
        combo1.addItem("Martes");
        combo1.addItem("Miercoles");
        combo1.addItem("Viernes");
        combo1.addItem("Sabado");
        combo1.addItem("Domingo");
        combo1.addItemListener(this);
        combo2 = new JComboBox();
        combo2.setBounds(150,85,80,30);
        add(combo2);
        combo2.addItem("1");
        combo2.addItem("2");
        combo2.addItem("3");
        combo2.addItem("4");
        combo2.addItem("5");
        combo2.addItemListener(this);
        
        //etiquetas
        this.etiqueta1 = new JLabel("Seleccionar Día:");
        this.etiqueta1.setBounds(10, 45, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Nombre de la Misión:");
        this.etiqueta2.setBounds(10, 120, 200, 30);
        this.add(this.etiqueta2);
        this.etiqueta3 = new JLabel("Descripción:");
        this.etiqueta3.setBounds(10, 160, 200, 30);
        this.add(this.etiqueta3);
        this.etiqueta4 = new JLabel("Seleccionar Prioridad:");
        this.etiqueta4.setBounds(10, 85, 200, 30);
        this.add(this.etiqueta4);
    
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            System.exit(0);
        }
        if (e.getSource() == this.boton2) {
            System.exit(0);
        }


    }
    
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1) {
            String seleccion = combo1.getSelectedItem().toString();
        }

    }

    public static void main(String[] args) {
        Agregar_misiones launcher = new Agregar_misiones();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo((Component)null);
        launcher.setResizable(false);
    }
}
