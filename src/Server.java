import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Server extends  {
    private JTextField portTextField;
    private JPasswordField passwordField1;
    private JButton startButton;
    private JButton closeButton;
    private JScrollBar scrollBar1;
    private JTextArea textArea1;
    private JPanel jPanel;
    private JTextField serverTextField;
    private JFrame frame;
    private String port;

    public Server(){
        portTextField = new JTextField();
        passwordField1= new JPasswordField();
        startButton   = new JButton();
        closeButton   = new JButton();
        scrollBar1    = new JScrollBar();
        textArea1     = new JTextArea();

        frame = new JFrame();
        frame.setContentPane(jPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setLocation(100,100);
        frame.setResizable(false);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
}
