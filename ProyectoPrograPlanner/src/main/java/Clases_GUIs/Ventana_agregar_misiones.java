package Clases_GUIs;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

import Clases_Dominio.Misiones;
import Manejo_Archivos.GestorVentanas;
import Manejo_Archivos.GestorArchivos;

public class Ventana_agregar_misiones extends JFrame implements ItemListener,ActionListener{
    private JButton boton1,boton2,boton3;
    private JTextField descripcion;
    private JComboBox combo1,combo2;
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5,etiqueta6,etiqueta7;
    private JTextField misionDefinida;
    private GestorVentanas gestorVentanas;
    private GestorArchivos gestorArchivos;
    private JScrollPane scroll;
    private Misiones misiones;

    public Ventana_agregar_misiones() {
        //layout
        this.setLayout((LayoutManager)null);
        //JtextArea
        this.misionDefinida = new JTextField("");
        this.misionDefinida.setEditable(false);
        //botones
        this.boton1 = new JButton("Agregar Misión");
        this.boton1.setBounds(10, 10, 200, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Atrás");
        this.boton2.setBounds(230, 10, 100, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        this.boton3 = new JButton("Ingresar nombre de la Misión");
        this.boton3.setBounds(150,120,200,30);
        this.add(this.boton3);
        this.boton3.addActionListener(this);
        //descripcion
        this.descripcion=new JTextField();
        this.descripcion.setBounds (10,240,340,30);
        this.add(descripcion);
        //scroll
        this.combo1 = new JComboBox();
        this.combo1.setBounds(150,45,80,30);
        add(this.combo1);
        this.combo1.addItem("");
        this.combo1.addItem("Lunes");
        this.combo1.addItem("Martes");
        this.combo1.addItem("Miercoles");
        this.combo1.addItem("Jueves");
        this.combo1.addItem("Viernes");
        this.combo1.addItem("Sabado");
        this.combo1.addItem("Domingo");
        this.combo1.addItemListener(this);
        this.combo2 = new JComboBox();
        this.combo2.setBounds(150,85,80,30);
        add(this.combo2);

        this.combo2.addItem("1");
        this.combo2.addItem("2");
        this.combo2.addItem("3");
        this.combo2.addItemListener(this);


        //etiquetas
        this.etiqueta1 = new JLabel("Seleccionar Día:");
        this.etiqueta1.setBounds(10, 45, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Nombre de la Misión:");
        this.etiqueta2.setBounds(10, 120, 200, 30);
        this.add(this.etiqueta2);
        this.etiqueta3 = new JLabel("Descripción:");
        this.etiqueta3.setBounds(10, 200, 200, 30);
        this.add(this.etiqueta3);
        this.etiqueta4 = new JLabel("Seleccionar Prioridad:");
        this.etiqueta4.setBounds(10, 85, 200, 30);
        this.add(this.etiqueta4);
        this.etiqueta5 = new JLabel("Prioridad 1: Más alta");
        this.etiqueta5.setBounds(240, 45, 200, 30);
        this.etiqueta5.setForeground(Color.RED);
        this.add(this.etiqueta5);
        this.etiqueta6 = new JLabel("Prioridad 2: Media");
        this.etiqueta6.setBounds(240, 65, 200, 30);
        this.etiqueta6.setForeground(Color.ORANGE);
        this.add(this.etiqueta6);
        this.etiqueta7 = new JLabel("Prioridad 3: Más baja");
        this.etiqueta7.setBounds(240, 85, 200, 30);
        this.etiqueta7.setForeground(Color.GREEN);
        this.add(this.etiqueta7);

        //Scroll
        this.scroll= new JScrollPane(misionDefinida);
        this.scroll.setBounds(150,160,200,30);
        this.scroll.setFont(new java.awt.Font("Tahoma", 0,14));
        this.add(scroll);
        //clases
        this.misiones = new Misiones();
        this.gestorArchivos = new GestorArchivos();
        this.gestorVentanas = new GestorVentanas();
    }

    public void itemStateChanged(ItemEvent e) {
        //diaMision String
        if (e.getSource() == this.combo1) {
            this.misiones.setDia(this.combo1.getSelectedItem().toString()) ;
            this.gestorArchivos.crearArchivo("Mision"+this.misiones.getDia());
        }
        if (e.getSource() == this.combo2) {
            String seleccion = this.combo2.getSelectedItem().toString();
            this.misiones.setPrioridad(Integer.parseInt(seleccion));
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.boton1) {

            if(this.misiones.getNombre()==null||this.misiones.getDia()==""||this.misiones.getNombre()==""){
                JOptionPane.showConfirmDialog(null,"Verifique sus datos","ERROR", JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{ 
                JOptionPane.showConfirmDialog(null,"Misión creada con exito","Éxito!!", JOptionPane.DEFAULT_OPTION);
                this.misiones.setDescripcion(this.descripcion.getText()) ;
                this.gestorArchivos.crearArchivo("Mision"+this.misiones.getDia(), misiones.crearTextoMision() );
                this.misionDefinida.setText("");
                this.descripcion.setText("");
                this.misiones.setNombre("");

            }
        }

        if (e.getSource() == this.boton2) {

            this.gestorVentanas.ejecutarVentanaMisionesSemanales();
            this.setVisible(false);

        }
        if (e.getSource() == this.boton3) {
            String x = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Mision");
            this.misionDefinida.setText(x);
            this.misiones.setNombre(x);
        }
    }




}
