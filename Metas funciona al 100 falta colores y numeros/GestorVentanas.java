
public class GestorVentanas
{
    public GestorVentanas(){
    }

    public  void ejecutarVentanaMenu(){
        Ventana_menu launcher = new Ventana_menu();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo(null);
        launcher.setResizable(false);
    }

    public  void ejecutarVentanaMetasCompletadas(){
        Ventana_metas_completadas metasCompletadas = new Ventana_metas_completadas();
        metasCompletadas.setBounds(0, 0, 400, 550);
        metasCompletadas.setVisible(true);
        metasCompletadas.setLocationRelativeTo(null);
        metasCompletadas.setResizable(false);
    }

    public  void ejecutarVentanaMetas(){
        Ventana_metas metas = new Ventana_metas();
        metas.setBounds(0, 0, 400, 550);
        metas.setVisible(true);
        metas.setLocationRelativeTo(null);
        metas.setResizable(false);     
    }

    public  void ejecutarVentanaMisionesSemanales(){
        Ventana_misiones_semanales misionesSemanales = new Ventana_misiones_semanales();
        misionesSemanales.setBounds(0, 0, 400, 550);
        misionesSemanales.setVisible(true);
        misionesSemanales.setResizable(false);
        misionesSemanales.setLocationRelativeTo(null);
    }

    public  void ejecutarVentanaAgregarMetas(){
        Ventana_agregar_metas agregarMetas = new Ventana_agregar_metas();
        agregarMetas.setBounds(0, 0, 400, 550);
        agregarMetas.setVisible(true);
        agregarMetas.setLocationRelativeTo(null);
        agregarMetas.setResizable(false);
    }

    public  void ejecutarVentanaAgregarMisiones(){
        Ventana_agregar_misiones launcher = new Ventana_agregar_misiones();
        launcher.setBounds(0, 0, 400, 550);
        launcher.setVisible(true);
        launcher.setLocationRelativeTo(null);
        launcher.setResizable(false);

    }
}
