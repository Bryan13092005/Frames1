import javax.swing.*;

public class EJERCICIO3 {
    private JPanel Panel;
    private JCheckBox programacionCheckBox;
    private JCheckBox redesCheckBox;
    private JCheckBox seguridadCheckBox;
    private JCheckBox backendCheckBox;
    private JCheckBox fullStackCheckBox;
    private JCheckBox frontendCheckBox;
    private JButton resultadosButton;
    private JLabel resultados;

    public String resultado(){
        String mensaje="";
        if (programacionCheckBox.isSelected()){
            mensaje+= programacionCheckBox.getText()+"\n";
        }
        if (redesCheckBox.isSelected()){
            mensaje+= redesCheckBox.getText()+"\n";
        }
        if (seguridadCheckBox.isSelected()){
            mensaje+= seguridadCheckBox.getText()+"\n";
        }
        if (backendCheckBox.isSelected()){
            mensaje+= backendCheckBox.getText()+"\n";
        }
        if (frontendCheckBox.isSelected()){
            mensaje+= frontendCheckBox.getText()+"\n";
        }
        if (fullStackCheckBox.isSelected()){
            mensaje+= fullStackCheckBox.getText()+"\n";
        }

        if (mensaje.trim().isEmpty()){
            return "No hay ninguna preferencia";
        }else {
            return mensaje;
        }
    }

    public EJERCICIO3(){
        resultadosButton.addActionListener(e -> {
            resultados.setText("<html>"+resultado().replace("\n","<br>")+"</html>");
        });
    }

    public JPanel getPanel(){
        return Panel;
    }
}
