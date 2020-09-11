import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerView {
    private ServerProgramCode serverProgramCode;

    private JButton startButton;
    private JButton closeButton;
    private JScrollBar scrollBar1;
    private JTextArea textArea1;
    private JTextField portTextField;
    private JTextField serverTextField;
    private JPanel jPanel;
    private JFrame frame;

    public ServerView(){


    frame = new JFrame();
        System.out.println(textArea1);
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

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                serverProgramCode=new ServerProgramCode(Integer.parseInt(portTextField.getText()),ServerView.this);
                System.out.println("Ein Server stellt seine Dienste bereit");
            }
        });
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void erhalte(){

        serverProgramCode.processMessage("127.0.0.1",51231,"EHRE");

    }

    public JTextArea getTextArea1() {
        return textArea1;
    }
}