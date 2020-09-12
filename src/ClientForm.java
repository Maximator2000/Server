import Datenstrukturen.List;
import netz.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClientForm {

    private List<TestClient> tClient;

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
    private JButton nextButton;
    private JScrollPane scrollPane;
    private JFrame frame;

    public ClientForm(){

        tClient=new List();
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
                if (!ipField.getText().isEmpty() && !portField.getText().isEmpty()) {
                    tClient.append(new TestClient(ipField.getText(), Integer.parseInt(portField.getText()), ClientForm.this));
                    tClient.toLast();
                    tClient.getContent().setName(nameField.getText());
                    System.out.println("Eine Verbindung zum Server wurde von " + nameField.getText() + " hergestellt");
                }
            }
        });
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tClient.isEmpty()){
                    tClient.getContent().send(nachrichtFeld.getText());
                    System.out.println("Ein Nachricht an den Server wurde von "+ nameField.getText()+" gesendet");

                }
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!tClient.isEmpty())
                    tClient.next();
                    if (!tClient.hasAccess()) {
                        tClient.toFirst();
                     }
                    nameField.setText(tClient.getContent().getName());
                 }
        });
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }
}
