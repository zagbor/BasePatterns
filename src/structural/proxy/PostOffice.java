package structural.proxy;

public class PostOffice {
    public static void main(String[] args) {
        ProxyMessage proxyMessage = new ProxyMessage("Люблю пить из ладошек.");
        proxyMessage.send();
    }

}
