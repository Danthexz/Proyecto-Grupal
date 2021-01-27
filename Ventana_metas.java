import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.LayoutManager;

public class Ventana_metas extends JFrame implements ActionListener{
    private JButton boton1,boton2, boton3,boton4;
    private JLabel etiqueta1,etiqueta2,etiqueta3;
    private JScrollPane scroll;
    private JTextArea listaMetas;
    private GestorArchivos gestorArchivos;
    private GestorVentanas gestorVentanas;
    private JTextField numeroEliminar;
    private int num;

    public Ventana_metas() {
        setLayout(null);
        //botones
        this.boton1 = new JButton("Nueva Meta");
        this.boton1.setBounds(10, 10, 200, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Atras");
        this.boton2.setBounds(230, 10, 100, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        this.boton3 = new JButton("Eliminar");
        this.boton3.setBounds(270, 73, 100, 20);
        this.add(this.boton3);
        this.boton3.addActionListener(this);
        this.boton4 = new JButton("Completar");
        this.boton4.setBounds(270, 53, 100, 20);
        this.add(this.boton4);
        this.boton4.addActionListener(this);
        //etiquetas.
        this.etiqueta1 = new JLabel("Si desea completar/eliminar una");
        this.etiqueta1.setBounds(75, 45, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Metas: ");
        this.etiqueta2.setBounds(10, 45, 250, 30);
        this.add(this.etiqueta2);
        this.etiqueta3 = new JLabel("Meta ingrese su numero:");
        this.etiqueta3.setBounds(75, 65, 200, 30);
        this.add(this.etiqueta3);
        //texto
        this.listaMetas = new JTextArea("");
        this.listaMetas.setEditable(false);
        //scroll
        this.scroll= new JScrollPane(listaMetas);
        this.scroll.setBounds(10,100,365,400);
        this.scroll.setFont(new java.awt.Font("Tahoma", 0,14));
        this.add(scroll);
        //textField
        numeroEliminar=new JTextField();
        numeroEliminar.setBounds (224, 73, 34, 20);
        add(numeroEliminar);
        //
        this.gestorArchivos=new GestorArchivos();
        this.listaMetas=gestorArchivos.escribirTexto("Metas",this.listaMetas);
        this.gestorVentanas=new GestorVentanas();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            gestorVentanas.ejecutarVentanaAgregarMetas();
            this.setVisible(false);
        }
        if (e.getSource() == this.boton2) {
            gestorVentanas.ejecutarVentanaMenu();
            this.setVisible(false);
        }
      /* public boolean validacionSoloNumeros(String cadena){

            try{
                this.num=Integer.parseInt(cadena);
                return true;

            }
            catch (Exception e)
            {
                return false;
            }*/

    }

}