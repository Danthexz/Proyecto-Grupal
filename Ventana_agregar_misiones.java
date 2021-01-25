import java.awt.LayoutManager;
import javax.swing.*;
import java.awt.event.*;

public class Ventana_agregar_misiones extends JFrame implements ItemListener,ActionListener{
    private JButton boton1,boton2,boton3;
    private JTextField descripcion;
    private JComboBox combo1,combo2;
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4;
    private String nombreMision;
    private String descripcionMision;
    private String diaMision;
    private int prioridad;
    private JTextArea misionDefinida;
    private GestorVentanas gestorVentanas;
    private GestorArchivos gestorArchivos;
    private JScrollPane scroll;

    public Ventana_agregar_misiones() {
        //layout
        this.setLayout((LayoutManager)null);
        //JtextArea
        this.misionDefinida = new JTextArea("");
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
        //nombre
        //nombre = new JTextField();
        //nombre.setBounds(150,120,200,30);
        //add(nombre);
        //descripcion
        descripcion=new JTextField();
        descripcion.setBounds (10,250,340,30);
        add(descripcion);
        //scroll
        combo1 = new JComboBox();
        combo1.setBounds(150,45,80,30);
        add(combo1);
        combo1.addItem("");
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
        combo2.addItemListener(this);

        //etiquetas
        this.etiqueta1 = new JLabel("Seleccionar Día:");
        this.etiqueta1.setBounds(10, 45, 200, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Nombre de la Misión:");
        this.etiqueta2.setBounds(10, 120, 200, 30);
        this.add(this.etiqueta2);
        this.etiqueta3 = new JLabel("Descripción:");
        this.etiqueta3.setBounds(10, 210, 200, 30);
        this.add(this.etiqueta3);
        this.etiqueta4 = new JLabel("Seleccionar Prioridad:");
        this.etiqueta4.setBounds(10, 85, 200, 30);
        this.add(this.etiqueta4);
        //Scroll
        this.scroll= new JScrollPane(misionDefinida);
        this.scroll.setBounds(150,170,200,40);
        this.scroll.setFont(new java.awt.Font("Tahoma", 0,14));
        this.add(scroll);
        this.nombreMision="";
        this.diaMision="";
        this.prioridad=1;
        this.gestorArchivos = new GestorArchivos();
        this.gestorVentanas = new GestorVentanas();

    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == this.combo1) {
            this.diaMision = this.combo1.getSelectedItem().toString();
            gestorArchivos.crearArchivo("Mision"+this.diaMision);
        }
        if (e.getSource() == this.combo2) {
            String seleccion = this.combo2.getSelectedItem().toString();
            this.prioridad=Integer.parseInt(seleccion);
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.boton1) {

            if(this.nombreMision==null||this.diaMision==""||this.nombreMision==""){
                JOptionPane.showConfirmDialog(null,"Verifique sus datos","ERROR", JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
            }else{ JOptionPane.showConfirmDialog(null,"Misión creada con exito","Éxito!!", JOptionPane.DEFAULT_OPTION);
                this.descripcionMision= this.descripcion.getText();

                this.gestorArchivos.crearArchivo("Mision"+this.diaMision, crearTextoMision());
                this.misionDefinida.setText("");
                this.descripcion.setText("");
            }
        }

        if (e.getSource() == this.boton2) {

            this.gestorVentanas.ejecutarVentanaMisionesSemanales();
            this.setVisible(false);

        }
        if (e.getSource() == this.boton3) {


            String x = JOptionPane.showInputDialog(null, "Ingrese el nombre de la Mision");

            this.misionDefinida.setText(x);
            this.nombreMision=x;
            //System.out.println(nombreMision);

        }
    }
    
    public String crearTextoMision(){
        String texto = this.gestorArchivos.contarLineas("Mision"+this.diaMision)+"-"+this.nombreMision+": "+this.descripcionMision;

        return texto;
    }


}
