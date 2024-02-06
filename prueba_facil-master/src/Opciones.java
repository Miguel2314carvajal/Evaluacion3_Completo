import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opciones extends JFrame{
    private JPanel Opciones;
    private JButton verSaldoButton;
    private JButton retiroButton;
    private JButton depositoButton;
    private JButton salirButton;

    public Opciones(){
        super("opciones");
        setContentPane(Opciones);


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Gracias por usar nuestro sistema");
                dispose();
            }
        });
        verSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo obj3 = new Saldo();
                obj3.Salto();
                dispose();
            }
        });
        retiroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registro obj3 = new Registro();
                obj3.Rest();
                dispose();
            }
        });
        depositoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Deposito obj3 = new Deposito();
                obj3.Depo();
                dispose();
            }
        });
    }

    public void abrir(){
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
