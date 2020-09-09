import javax.swing.*;

public class Server {
    private JTextField portTextField;
    private JPasswordField passwordField1;
    private JButton startButton;
    private JButton closeButton;
    private JScrollBar scrollBar1;
    private JTextArea textArea1;

    public Server(){
        portTextField = new JTextField();
        passwordField1= new JPasswordField();
        startButton   = new JButton();
        closeButton   = new JButton();
        scrollBar1    = new JScrollBar();
        textArea1     = new JTextArea();

    }
}
