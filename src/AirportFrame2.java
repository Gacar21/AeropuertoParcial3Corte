import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirportFrame2 {
    private JPanel Base2;
    private JLabel Text2;
    private JLabel TipoAero;
    private JButton Publico;
    private JButton Privado;
    private JButton volverButton;
    private JPanel TiposAeroi;

    public AirportFrame2() {



        Publico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame tercerFrame = new JFrame("Aeropuerto Público");
                AirportFrame3 terceraVentana = new AirportFrame3();
                tercerFrame.setContentPane(terceraVentana.getBase());
                tercerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                tercerFrame.pack();
                tercerFrame.setSize(720, 720);
                tercerFrame.setLocationRelativeTo(null);
                tercerFrame.setResizable(false);
                tercerFrame.setVisible(true);


                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(Base2);
                if(currentFrame != null) {
                    currentFrame.dispose();
                }
            }
        });

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(Base2);
                AirportFrame airportFrame = new AirportFrame();
                JFrame frame = new JFrame("Aeropuertos GC");
                airportFrame.setFrame(frame);
                frame.setContentPane(airportFrame.getBase());
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
        return Base2;
    }
}