import java.awt.LayoutManager;
import java.awt.event.*;
import javax.swing.*;

public class Ventana_metas_completadas extends JFrame implements ActionListener{
    private JLabel etiqueta1;
    private JButton boton1;
    GestorVentanas gestorVentanas;

    public Ventana_metas_completadas(){
        setLayout(null);
        this.etiqueta1 = new JLabel("Metas Completadas");
        this.etiqueta1.setBounds(80, 10, 500, 30);
        this.add(this.etiqueta1);
        this.boton1 = new JButton("Atras");
        this.boton1.setBounds(230, 10, 100, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            gestorVentanas = new GestorVentanas();
            gestorVentanas.ejecutarVentanaMenu();
            this.setVisible(false);
        }

    }

    
    
  
}
