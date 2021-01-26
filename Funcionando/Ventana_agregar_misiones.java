import java.awt.LayoutManager;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Ventana_agregar_misiones extends JFrame implements ItemListener,ActionListener{
    private JButton boton1,boton2,boton3;
    private JTextField descripcion;
    private JComboBox combo1,combo2;
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4;
    private String nombreMision;
    private String descripcionMision;
    private String diaMision;
    private int prioridad;
    private JTextField misionDefinida;
    private GestorVentanas gestorVentanas;
    private GestorArchivos gestorArchivos;
    private JScrollPane scroll;

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
        //Scroll
        this.scroll= new JScrollPane(misionDefinida);
        this.scroll.setBounds(150,160,200,30);
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
            this.gestorArchivos.crearArchivo("Mision"+this.diaMision);
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
            }else{ 
                JOptionPane.showConfirmDialog(null,"Misión creada con exito","Éxito!!", JOptionPane.DEFAULT_OPTION);
                this.descripcionMision= this.descripcion.getText();

                this.gestorArchivos.crearArchivo("Mision"+this.diaMision, crearTextoMision());
                this.misionDefinida.setText("");
                this.descripcion.setText("");
                this.nombreMision="";

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
        }
    }

    public String crearTextoMision(){
        ;
        String texto = this.gestorArchivos.contarLineas("Mision"+this.diaMision)+"| "+setearPrioridad(this.prioridad) +" Nombre: "+this.nombreMision+ " Descripción: "+this.descripcionMision;

        return texto;
    }

    public String setearPrioridad(int prioridad){
        Random random= new Random();
        int azar;
        String frase="";

        if(prioridad==1){

            String prioridad1[]={"OJO, MUY IMPORTANTE!","POR QUÉ NO HAS COMENZADO???!!!","PONTE A TRABAJAR!!","SI NO ES AHORA, CUÁNDO?!?!","TIENES MIEDO!!??","POR QUÉ AUN ME PUEDES LEER!!?!","PONTE LAS PILAS!!!"};
            azar=random.nextInt(prioridad1.length);
            frase=prioridad1[azar];
        }
        if(prioridad==2){
            String prioridad2[]={"Vamos, comienza!","Dale, tú puedes!","Esto no se resolvera solo.","El esfuerzo lo valdrá.","Trabaja duro!","Fracasar no es una opción.","El tiempo corre.","Empieza de una vez.","Despierta!","No te duermas."};
            azar=random.nextInt(prioridad2.length);
            frase=prioridad2[azar];
        }
        if(prioridad==3){
            String prioridad3[]={"Podrías hacerlo hoy?","Ve a tu ritmo.","Tomalo con calma.","Yo sé quieres.","Deberias intentarlo.","No has pensado en comenzar?","Sigo aqui..."};
            azar=random.nextInt(prioridad3.length);
            frase=prioridad3[azar]; 
        }
        return frase;
    }

}
