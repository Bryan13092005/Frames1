import javax.swing.*;

public class PRACTICA1 {
    private JTextField valor1;
    private JTextField valor2;
    private JLabel resultado;
    private JButton RESTAButton;
    private JButton MULTIPLICACIÓNButton;
    private JButton DIVISIÓNButton;
    private JButton SUMAButton;
    private JPanel panelMain;

    private Operaciones ops = new Operaciones();

    public PRACTICA1(){
        SUMAButton.addActionListener(e -> {
            try {
                double a = Double.parseDouble(valor1.getText());
                double b = Double.parseDouble(valor2.getText());
                double respuesta = ops.suma(a, b);
                resultado.setText(String.valueOf(respuesta));
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,
                        "Por favor ingresa solo números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        RESTAButton.addActionListener(e -> {
            try{
                double a=Double.parseDouble(valor1.getText());
                double b=Double.parseDouble(valor2.getText());
                double respuesta=ops.resta(a,b);
                resultado.setText(String.valueOf(respuesta));
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,
                        "Por favor ingresa solo números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        MULTIPLICACIÓNButton.addActionListener(e -> {
            try{
            double a=Double.parseDouble(valor1.getText());
            double b=Double.parseDouble(valor2.getText());
            double respuesta=ops.multiplicacion(a,b);
            resultado.setText(String.valueOf(respuesta));
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,
                    "Por favor ingresa solo números.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        });
        DIVISIÓNButton.addActionListener(e -> {
            try {
                double a = Double.parseDouble(valor1.getText());
                double b = Double.parseDouble(valor2.getText());
                double respuesta = ops.division(a, b);
                resultado.setText(String.valueOf(respuesta));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Por favor ingresa solo números.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }catch (ArithmeticException ex){
                JOptionPane.showMessageDialog(null,
                        ex.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public JPanel getPanelMain() {
        return panelMain;
    }
}