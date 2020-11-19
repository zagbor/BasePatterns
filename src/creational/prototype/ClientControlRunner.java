package creational.prototype;

public class ClientControlRunner {

    public static void main(String[] args) {
        Client client = new Client(1, "SuperProject", 28);
        System.out.println(client);


        ClientFactory factory = new ClientFactory(client);
        Client masterReplicate = factory.replicateClient();
        System.out.println(masterReplicate);

    }
}