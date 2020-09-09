import javax.swing.*;

public class Main {

    private Server server;
    private ClientForm clientForm;

    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        server = new Server();
        clientForm= new ClientForm();

    }
}
