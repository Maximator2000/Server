import Datenstrukturen.List;
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
        System.out.println("Der Server hat einen neuen Client" );
        server.getTextArea1().setText(server.getTextArea1().getText()
                + "\nDu hast einen neuen Client mit der IP-Addresse: "
                + pClientIP+"\n und dem Port :"+pClientPort);
    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        server.getTextArea1().setText(server.getTextArea1().getText()
                +"\n Nachricht von "+pClientIP+" und "+pClientPort
                + "\n"+pMessage);
        System.out.println("Server hat eine Nachricht erhalten");
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {

    }

    public void sende(String message ){
        send(clientAdress,clientPort,message);
    }
}
