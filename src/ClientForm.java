import javax.swing.*;
import java.awt.*;

public class ClientForm {
    private JPanel panel;
    private JTextField clientTextField;
    private JTextField nameField;
    private JTextField remotalIPField2;
    private JTextField portTextField;
    private JTextField textField1;
    private JTextField textField5;
    private JButton connectButton;
    private JTextField textField2;
    private JButton sendButton;
    private JTextField receivedTextField;
    private JButton closeButton;
    private JTextArea textArea1;
    private JScrollBar scrollBar1;
    private JTextField textField3;
    private JScrollPane scrollPane;
    private JFrame frame;

    public ClientForm(){
        frame= new JFrame();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setLocation(650,100);




    }



}
