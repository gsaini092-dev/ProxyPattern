package proxypattern;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
