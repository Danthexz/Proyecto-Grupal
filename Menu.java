import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener  {
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    public Menu() {
        this.setLayout((LayoutManager)null);
        this.etiqueta1 = new JLabel("Calendario Organizador");
        this.etiqueta1.setBounds(130, 20, 500, 30);
        this.add(this.etiqueta1);
        this.etiqueta2 = new JLabel("Version 1.0");
        this.etiqueta2.setBounds(300, 450, 100, 30);
        this.add(this.etiqueta2);
        this.etiqueta3 = new JLabel("Planner");
        this.etiqueta3.setBounds(170, 40, 500, 30);
        this.add(this.etiqueta3);
        this.boton1 = new JButton("Salir");
        this.boton1.setBounds(260, 400, 100, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
        this.boton2 = new JButton("Misiones Semanales");
        this.boton2.setBounds(100, 100, 200, 30);
        this.add(this.boton2);
        this.boton2.addActionListener(this);
        this.boton3 = new JButton("Metas");
        this.boton3.setBounds(150, 150, 100, 30);
        this.add(this.boton3);
        this.boton2.addActionListener(this);
        this.boton4 = new JButton("Logros");
        this.boton4.setBounds(150, 200, 100, 30);
        this.add(this.boton4);
    }


    public void actionPerformed(ActionEvent e) {
        Agregar_metas agregarMetas = new Agregar_metas();
        Misiones_semanales misionesSemanales = new Misiones_semanales();
        Metas_completadas metasCompletadas = new Metas_completadas();

        if (e.getSource() == this.boton1) {
            System.exit(0);
        }else if (e.getSource() == this.boton2) {

            misionesSemanales.setBounds(0, 0, 400, 550);
            misionesSemanales.setVisible(true);
            misionesSemanales.setLocationRelativeTo(null);
            misionesSemanales.setResizable(false);
            this.setVisible(false);

        }else if (e.getSource() == this.boton3) {

            agregarMetas.setBounds(0, 0, 400, 550);
            agregarMetas.setVisible(true);
            agregarMetas.setLocationRelativeTo(null);
            agregarMetas.setResizable(false);
            this.setVisible(false);

        }else if (e.getSource() == this.boton4) {

            metasCompletadas.setBounds(0, 0, 400, 550);
            metasCompletadas.setVisible(true);
            metasCompletadas.setLocationRelativeTo((Component)null);
            metasCompletadas.setResizable(false);
            this.setVisible(false);
        }

    }



    public static void main(String[] args) {
        Menu launcher = new Menu();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo((Component)null);
        launcher.setResizable(false);
    }
}
