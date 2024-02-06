import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new login();
                frame.setSize(400,400);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.getContentPane().setBackground(new Color(204,255,204));
            }
        });
    }
}

