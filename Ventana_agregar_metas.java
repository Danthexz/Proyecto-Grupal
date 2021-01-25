import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;

public class Ventana_agregar_metas extends JFrame implements ActionListener
{
    private JButton boton1,boton2,boton3;
    private JLabel etiqueta1,etiqueta2;
    private JTextField nombre;
    private JTextArea descripcion;
    private GestorVentanas gestorVentanas;
    private String nombreMeta;
    private String descripcionMeta;
    private GestorArchivos gestorArchivos;

    public Ventana_agregar_metas() {
        //layout
        this.setLayout((LayoutManager)null);
        //botones
        this.boton1 = new JButton("Agregar Meta");
        this.boton1.setBounds(10, 10, 200, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Atrás");
        this.boton2.setBounds(230, 10, 100, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        this.boton3 = new JButton("Ingresar nombre de la Meta");
        this.boton3.setBounds(150,120,200,30);
        this.add(this.boton3);
        //etiquetas
        this.etiqueta1 = new JLabel("Nombre de la Meta:");
        this.etiqueta1.setBounds(10, 45, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Descripción:");
        this.etiqueta2.setBounds(10, 70, 200, 30);
        this.add(this.etiqueta2);
        //nombre
        nombre = new JTextField();
        nombre.setBounds(150,45,200,30);
        add(nombre);
        //descripcion
        descripcion=new JTextArea();
        descripcion.setBounds (10,100,340,100);
        add(descripcion);
        this.nombreMeta="";
        this.gestorArchivos=new GestorArchivos();
        this.gestorVentanas = new GestorVentanas();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            if(this.nombreMeta==null||this.nombreMeta==""){
                JOptionPane.showConfirmDialog(null,"Verifique sus datos","ERROR", JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{ JOptionPane.showConfirmDialog(null,"Meta creada con exito","Éxito!!", JOptionPane.DEFAULT_OPTION);
                this.descripcionMeta= this.descripcion.getText();
                this.gestorArchivos.crearArchivo("Meta", descripcionMeta);
                this.nombre.setText("");
                this.descripcion.setText("");
            }
        }
        if (e.getSource() == this.boton2) {
            gestorVentanas.ejecutarVentanaMetas();
            this.setVisible(false);
        }

    }

}
