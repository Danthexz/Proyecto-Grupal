package Clases_GUIs;
import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;
import Manejo_Archivos.GestorVentanas;

public class Ventana_menu extends JFrame implements ActionListener  {
    private JLabel etiqueta1,etiqueta2,etiqueta3;
    private JButton boton1,boton2,boton3,boton4;
    private GestorVentanas gestorVentanas;


    public Ventana_menu() {
        this.setLayout((LayoutManager)null);
        //etiquetas
        this.etiqueta1 = new JLabel("Calendario Organizador");
        this.etiqueta1.setBounds(130, 20, 500, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Version 1.0");
        this.etiqueta2.setBounds(300, 450, 100, 30);
        this.add(this.etiqueta2);
        this.etiqueta3 = new JLabel("Planner");
        this.etiqueta3.setBounds(170, 40, 500, 30);
        this.add(this.etiqueta3);
        //botones
        this.boton1 = new JButton("Salir");
        this.boton1.setBounds(260, 400, 100, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Misiones Semanales");
        this.boton2.setBounds(100, 100, 200, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        this.boton3 = new JButton("Metas propuestas");
        this.boton3.setBounds(100, 150, 200, 30);
        this.add(this.boton3);
        this.boton3.addActionListener(this);
        this.boton4 = new JButton("Logros");
        this.boton4.setBounds(150, 200, 100, 30);
        this.add(this.boton4);
        this.boton4.addActionListener(this);

        this.gestorVentanas=new GestorVentanas();
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.boton1) {
            System.exit(0);
        }

        if (e.getSource()==this.boton2) {
            gestorVentanas.ejecutarVentanaMisionesSemanales();
            this.setVisible(false);

        }
        if (e.getSource()==this.boton3) {
            gestorVentanas.ejecutarVentanaMetas();
            this.setVisible(false);

        }

        if (e.getSource() == this.boton4) {
            gestorVentanas.ejecutarVentanaMetasCompletadas();
            this.setVisible(false);

        }

    }
}

