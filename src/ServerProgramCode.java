import netz.Server;

public class ServerProgramCode extends Server {
    private String clientAdress;
    private ServerForm server;
    public ServerProgramCode(int pPort, ServerForm serverForm) {

        super(pPort);
        this.server = serverForm;


    }

    @Override
    public void processNewConnection(String pClientIP, int pClientPort) {


    }

    @Override
    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
        server.getTextArea1().setText(pMessage);
    }

    @Override
    public void processClosingConnection(String pClientIP, int pClientPort) {

    }
}
