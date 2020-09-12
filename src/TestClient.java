import netz.Client;

public class TestClient extends Client {

    private String name;

    private ClientForm clientForm;
    private String IP;
    private int port;

    public TestClient(String pServerIP, int pServerPort, ClientForm clientForm) {
        super(pServerIP, pServerPort);
        this.clientForm=clientForm;
        IP=pServerIP;
        port=pServerPort;
    }

    @Override
    public void processMessage(String pMessage) {
        clientForm.getTextArea1().setText(clientForm.getTextArea1().getText()
                +"\nNachricht an "+name+" : "
                +"\n"+pMessage);
        System.out.println("Client hat Nachricht erhalten" );
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIP() {
        return IP;
    }

    public int getPort() {
        return port;
    }
}
