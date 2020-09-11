import Datenstrukturen.List;

public class Controller {

    private ServerView serverView;
    private ClientForm clientForm;



    private TestClient testClient;
    private Menu menu;
    public final static int SERVER_PORT=51231;

    public Controller(){
        menu= new Menu(this);
    }

    public void showTheServer(){
        if(serverView ==null){
            serverView =new ServerView();
        }else if(!serverView.getFrame().isVisible()){
            serverView.getFrame().setVisible(true);
        }

    }

    public void showClient(){
        if(clientForm ==null){
            clientForm =new ClientForm();
        }else if(!clientForm.getFrame().isVisible()){
            clientForm.getFrame().setVisible(true);
        }
    }

}