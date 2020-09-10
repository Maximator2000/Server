import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    Controller controller;
    JFrame frame;
    private JTextField willkommenTextField;
    private JPanel panel;
    private JLabel label;
    private JButton goToServerButton;
    private JButton goToClientButton;

    public Menu(Controller controller){
        this.controller=controller;
        frame=new JFrame();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(650,600);
        frame.setLocation(800,250);
        goToServerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.showTheServer();
            }
        });
        goToClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.showClient();
            }
        });
    }
}
