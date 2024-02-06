import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JPanel login;
    private JTextField user;
    private JTextField contra;
    private JButton ingresarButton;

    private String username = "Frevill";
    private String pass = "contra";

    public login(){
        super("logeo");
        setContentPane(login);


        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (user.getText().isEmpty() || contra.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, "llene los campos vacios");
                    }
                    else if (username.equals(user.getText()) && pass.equals(contra.getText())){
                        JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
                        Opciones obj1 = new Opciones();
                        obj1.abrir();
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas, intente de nuevo");
                    }

                }
                catch (Exception exception){
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
        });
    }
}
