import netz.Client;
import netz.Server;

public class ServerProgramCode extends Server {

    private String clientAdress;
    private int clientPort;

    private ServerView server;

    public ServerProgramCode(int pPort, ServerView serverView) {
        super(pPort);
        this.server = serverView;
    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {
        this.clientAdress=pClientIP;
        this.clientPort=pClientPort;
        System.out.println("Der Server hat einen neuen Client");
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        System.out.println(server);
        server.getTextArea1().setText(pMessage);
        System.out.println("Server hat ein Nachricht erhalten");
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {

    }
}
