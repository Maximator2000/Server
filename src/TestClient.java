import netz.Client;

public class TestClient extends Client {

    public TestClient(String pServerIP, int pServerPort) {
        super(pServerIP, pServerPort);
    }

    @Override
    public void processMessage(String pMessage) {

    }

}
