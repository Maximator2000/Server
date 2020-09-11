import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClientForm {

    TestClient tClient;

    private JPanel panel;
    private JTextField clientTextField;
    private JTextField nameField1;
    private JTextField remotalIPField2;
    private JTextField portTextField;
    private JTextField nameField;
    private JTextField portField;
    private JButton connectButton;
    private JTextField nachrichtFeld;
    private JButton sendButton;
    private JTextField receivedTextField;
    private JButton closeButton;
    private JTextArea textArea1;
    private JScrollBar scrollBar1;
    private JTextField ipField;
    private JTextField textField1;
    private JScrollPane scrollPane;
    private JFrame frame;

    public ClientForm(){
        //tClient=new TestClient("127.0.0.1",51231);

        frame= new JFrame();
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setLocation(650,100);
        frame.setDefaultCloseOperation(1);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


        connectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tClient=new TestClient("127.0.0.1", Controller.SERVER_PORT);
                System.out.println("Eine Verbindung zum Server wurde von "+ nameField.getText()+" hergestellt");
            }
        });
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tClient!=null){
                    tClient.send(nachrichtFeld.getText());
                    System.out.println("Ein Nachricht an den Server wurde von "+ nameField.getText()+" gesendet");

                }
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
