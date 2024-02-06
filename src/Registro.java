import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro extends JFrame {
    private JTextField textField1;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a7Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton enterButton;
    private JButton menuButton;
    private JPanel Retiro;
    private JButton deleteButton;
    private String cantidad = "";

    public Registro(){
        super("Retiro");
        setContentPane(Retiro);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Opciones obj2 = new Opciones();
                obj2.abrir();
                dispose();
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "1";
                textField1.setText(cantidad);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "2";
                textField1.setText(cantidad);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "3";
                textField1.setText(cantidad);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "4";
                textField1.setText(cantidad);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "5";
                textField1.setText(cantidad);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "6";
                textField1.setText(cantidad);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "7";
                textField1.setText(cantidad);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "8";
                textField1.setText(cantidad);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "9";
                textField1.setText(cantidad);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidad = cantidad + "0";
                textField1.setText(cantidad);
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor = Double.parseDouble(cantidad);
                Saldo.retiro(valor);
                textField1.setText("");
                cantidad = "";
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cantidad != null && !cantidad.isEmpty()) {
                    textField1.setText(cantidad.substring(0, cantidad.length() - 1));
                    cantidad = cantidad.substring(0, cantidad.length() - 1);
                } else {
                    textField1.setText("");
                }
            }
        });
    }

    public void Rest(){
        setUndecorated(true);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(new Color(204,255,204));
    }
}
