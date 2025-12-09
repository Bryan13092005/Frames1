import javax.swing.*;

public class MENU {
    private JRadioButton calc;
    private JRadioButton enc;
    private JRadioButton pref;
    private JRadioButton exit;
    private JButton ACEPTARButton;
    private JPanel Panel;

    public MENU(){
        ACEPTARButton.addActionListener(e -> {
            if (calc.isSelected()){
                Acciones.Calculadora();
            }
            if (enc.isSelected()){
                Acciones.Encuesta();
            }
            if (pref.isSelected()){
                Acciones.Preferencias();
            }
            if (exit.isSelected()) {
                System.exit(0);
            }
        });
    }

    public JPanel getPanelMain(){
        return Panel;
    }
}
