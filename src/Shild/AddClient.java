package Shild;

import java.rmi.Naming;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://127.0.0.1/AddServer";
            AddServerIntf addServerIntf = (AddServerIntf) Naming.lookup(addServerURL);
            double d1 = 8.0;
            double d2 = 135.1;
            System.out.println("Summa = " + addServerIntf.add(d1, d2));
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
