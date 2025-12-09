import javax.swing.*;

public class EJERCICIO2 {
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JRadioButton P1O1;
    private JRadioButton P1O2;
    private JRadioButton P1O3;
    private JRadioButton P2O1;
    private JRadioButton P2O2;
    private JRadioButton P2O3;
    private JRadioButton P3O1;
    private JRadioButton P3O2;
    private JRadioButton P3O3;
    private JPanel PanelMain;
    private JButton ENVIARRESPUESTASButton;
    private JLabel lblResultados;

    private String obtenerRespuesta(JRadioButton si,JRadioButton no, JRadioButton tv){
        if (si.isSelected()) return "SI";
        if (no.isSelected()) return "NO";
        if (tv.isSelected()) return "TAL VEZ";
        return "NO HAY SELECCION";
    }

    public EJERCICIO2(){
        ENVIARRESPUESTASButton.addActionListener(e -> {
            String rp1=obtenerRespuesta(P1O1,P1O2,P1O3);
            String rp2=obtenerRespuesta(P2O1,P2O2,P2O3);
            String rp3=obtenerRespuesta(P3O1,P3O2,P3O3);

            String resumen="Resutados encuesta\n" +
                    "Pregunta 1: "+rp1+"\n"+
                    "Pregunta 2: "+rp2+"\n"+
                    "Pregunta 3: "+rp3;

            // OPCIÓN 1: Mostrar en JOptionPane
            //JOptionPane.showMessageDialog(null, resumen);

            // OPCIÓN 2: Mostrar en un JLabel
            lblResultados.setText("<html>"+resumen.replace("\n","<br>")+"</html>");
        });
    }

    public JPanel getPanelMain(){
        return PanelMain;
    }
}
