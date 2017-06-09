package RMI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Enumeration;

public class Client {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();

        Enumeration<NameClassPair> e = context.list("rmi://localhost:1099");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement().getName());

        }

        IMath iMath = (IMath) context.lookup("rmi://localhost:1099/imath");
        int result = iMath.sumMath(4, 88);
        System.out.println(result);

    }
}
