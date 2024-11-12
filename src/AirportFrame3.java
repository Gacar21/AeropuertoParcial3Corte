import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirportFrame3 {
    private JPanel Base2;
    private JLabel Text3;
    private JLabel TipoAero;
    private JButton Suite;
    private JButton Jfk;
    private JButton Jetex;
    private JButton Lebour;
    private JButton volverButton;
    private JPanel AeroPubl;
    private JPanel Base3;



    public AirportFrame3() {

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(Base3);
                AirportFrame2 segundaVentana = new AirportFrame2();
                JFrame frame = new JFrame("Aeropuertos GC");
                frame.setContentPane(segundaVentana.getBase());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(720, 720);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                currentFrame.dispose();
            }
        });
        Suite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame cuartoFrame = new JFrame("Aeropuerto Público");
                AirportFrame4 cuartaVentana = new AirportFrame4();
                cuartoFrame.setContentPane(cuartaVentana.getBase());
                cuartoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                cuartoFrame.pack();
                cuartoFrame.setSize(720, 720);
                cuartoFrame.setLocationRelativeTo(null);
                cuartoFrame.setResizable(false);
                cuartoFrame.setVisible(true);


                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(Base3);
                if (currentFrame != null) {
                    currentFrame.dispose();
                }
            }
        });
    }

    public JPanel getBase() {
        return Base3;
    }
}