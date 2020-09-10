public class Controller {

    private Server server;
    private ClientForm client;
    private Menu menu;

    public Controller(){
        menu= new Menu(this);
    }

    public void showTheServer(){
        if(server==null){
            server=new Server();
        }else if(!server.getFrame().isVisible()){
            server.getFrame().setVisible(true);
        }

    }

    public void showClient(){
        if(client==null){
            client=new ClientForm();
        }else if(!client.getFrame().isVisible()){
            client.getFrame().setVisible(true);
        }
    }

}