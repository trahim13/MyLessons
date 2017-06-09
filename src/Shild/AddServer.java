package Shild;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class AddServer {
    public static void main(String[] args) {

        try {
            AddServerImpl addServerImpl = new AddServerImpl();

            Naming.rebind("AddServer", addServerImpl);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
