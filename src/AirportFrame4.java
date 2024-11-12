import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirportFrame4 {
    private JPanel AeroPubl;
    private JPanel Base4;
    private JLabel Text3;
    private JButton volverButton;
    private JButton AllNippon;
    private JButton EA;
    private JButton Etihad;
    private JButton KoreanAir;
    private JLabel TipoAero;

    public AirportFrame4() {
    volverButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(Base4);
            AirportFrame3 terceraVentana = new AirportFrame3();
            JFrame frame = new JFrame("Aeropuertos GC");
            frame.setContentPane(terceraVentana.getBase());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setSize(720, 720);
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
            currentFrame.dispose();
        }
    });
}

    public JPanel getBase() {
        return Base4;
    }
}


