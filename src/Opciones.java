import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opciones extends JFrame{
    private JPanel Opciones;
    private JRadioButton saldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depositoRadioButton;
    private JRadioButton salirRadioButton;
    private JButton verSaldoButton;
    private JButton retiroButton;
    private JButton depositoButton;
    private JButton salirButton;

    public Opciones(){
        super("opciones");
        setContentPane(Opciones);

        saldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo obj3 = new Saldo();
                obj3.Salto();
                dispose();
            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro obj3 = new Registro();
                obj3.Rest();
                dispose();
            }
        });
        depositoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito obj3 = new Deposito();
                obj3.Depo();
                dispose();
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                dispose();
            }
        });
    }

    public void abrir(){
        setUndecorated(true);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(204,255,204));
    }
}
