import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Metas_completadas extends JFrame implements ActionListener{
    private JLabel etiqueta1;
    private JButton boton1;

    public Metas_completadas(){
        this.setLayout((LayoutManager)null);
        this.etiqueta1 = new JLabel("Metas Completadas");
        this.etiqueta1.setBounds(80, 10, 500, 30);
        this.add(this.etiqueta1);
        this.boton1 = new JButton("Atras");
        this.boton1.setBounds(230, 10, 100, 30);
        this.add(this.boton1);
        this.boton1.addActionListener(this);

        JPanel panel = new JPanel();//crear panel
        panel.setBackground(Color.white);
        panel.setBounds(10, 50, 364, 600);
        this.getContentPane().add(panel); //agregar panel a la ventana
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton1) {
            //que hace
        }

    }

    public static void main(String[] args) {
        Metas_completadas launcher = new Metas_completadas();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo((Component)null);
        launcher.setResizable(false);
    }
}
