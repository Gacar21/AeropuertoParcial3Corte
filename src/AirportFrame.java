import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AirportFrame {
    private JPanel Base;
    private JButton Continuar;
    private JButton Salir;
    private JTextField TextNombre;
    private JTextField TextPasaport;
    private JTextField TextNaci;
    private JFrame frame;
    private JPanel JpanelB;

    public AirportFrame() {
        Continuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(TextNombre.getText().isEmpty() || TextPasaport.getText().isEmpty() || TextNaci.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(Base, "Por favor, complete todos los campos");
                    return;
                }

                JFrame segundoFrame = new JFrame("Aeropuertos Gc");
                AirportFrame2 segundaVentana = new AirportFrame2();
                segundoFrame.setContentPane(segundaVentana.getBase());
                segundoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                segundoFrame.pack();
                segundoFrame.setSize(1080, 720);
                segundoFrame.setLocationRelativeTo(null);
                segundoFrame.setResizable(false);
                segundoFrame.setVisible(true);

                if(frame != null) {
                    frame.dispose();
                }
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getBase() {
        return Base;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                JFrame frame = new JFrame("Aeropuertos GC");
                AirportFrame airportFrame = new AirportFrame();
                airportFrame.setFrame(frame);
                frame.setContentPane(airportFrame.getBase());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.pack();
                frame.setSize(720, 720);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
            }
        });
    }
}