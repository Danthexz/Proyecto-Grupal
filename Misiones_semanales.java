import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Misiones_semanales extends JFrame implements ItemListener,ActionListener {

        private JComboBox combo1;
        private JButton boton1,boton2,boton3;
        private JLabel etiqueta1,etiqueta2;

    public Misiones_semanales() {
        setLayout(null);
        this.etiqueta1 = new JLabel("Seleccionar Día:");
        this.etiqueta1.setBounds(10, 10, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Lista de Misiones:");
        this.etiqueta2.setBounds(10, 100, 200, 30);
        this.add(this.etiqueta2);
        combo1 = new JComboBox();
        combo1.setBounds(120,10,80,30);
        add(combo1);
        combo1.addItem("Lunes");
        combo1.addItem("Martes");
        combo1.addItem("Miercoles");
        combo1.addItem("Viernes");
        combo1.addItem("Sabado");
        combo1.addItem("Domingo");
        combo1.addItemListener(this);
        this.boton1 = new JButton("Nueva Misión");
        this.boton1.setBounds(10, 50, 150, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Atras");
        this.boton2.setBounds(230, 10, 100, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        this.boton3 = new JButton("Eliminar todas");
        this.boton3.setBounds(200, 50, 150, 30);
        this.add(this.boton3);
        this.boton3.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1) {
            String seleccion = combo1.getSelectedItem().toString();
        }
        

    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            //hacer esto
        }
        if (e.getSource() == this.boton2) {
            //hacer esto
        }
    }

    public static void main(String[] args) {
        Misiones_semanales launcher = new Misiones_semanales();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo(null);
        launcher.setResizable(false);
    }
}
