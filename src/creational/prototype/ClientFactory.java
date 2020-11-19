package creational.prototype;


public class ClientFactory {
   Client client;

    public ClientFactory (Client client){
        this.client = client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    Client replicateClient(){
        return (Client) client.replicate();
    }
}
