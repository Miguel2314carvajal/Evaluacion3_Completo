import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame{
    private JPanel Saldo;
    private JButton menuButton;

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
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }



}
