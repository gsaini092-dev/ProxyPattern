package proxypattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{

    private Internet internet = new RealInternet();
    private static List<String> blockedSites = null;

    static {
        blockedSites = new ArrayList<>();
        blockedSites.add("abc.com");
        blockedSites.add("google.com");
    }


    @Override
    public void connectTo(String server) {
        if(blockedSites.contains(server)) {
            throw new RuntimeException("Access Denied.");
        }
        internet.connectTo(server);
    }
}
