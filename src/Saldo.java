import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel Saldo;
    private JButton menuButton;
    private JLabel Valor;
    private static Double saldo = 200.00;

    public Saldo(){
        super("saldo");
        setContentPane(Saldo);

        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Opciones obj2 = new Opciones();
                obj2.abrir();
                dispose();
            }
        });

    }

    public void Salto(){
        setUndecorated(true);
        setSize(400,400);
        setVisible(true);
        getContentPane().setBackground(new Color(204,255,204));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        Valor.setText("Su saldo es: " + String.valueOf(saldo) + "$");
    }
    public static void deposito (Double dep) {
        saldo += dep;
    }

    public static void retiro (Double ret) {
        if (ret < saldo) {
            JOptionPane.showMessageDialog(null, "Transaccion realizada correctamente");
            saldo -= ret;
        }
        else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        }
    }

}
