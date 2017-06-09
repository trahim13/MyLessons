package RMI;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws NamingException, RemoteException, AlreadyBoundException, MalformedURLException {
        Context context = new InitialContext();
        context.rebind("rmi://localhost:1099/imath", new IMathInt());

//        Naming.bind("imath", new IMathInt());

    }
}

interface IMath extends Remote{
     int sumMath(int a, int b) throws RemoteException;
}

class IMathInt extends UnicastRemoteObject implements IMath {
    protected IMathInt() throws RemoteException {
    }

    @Override
    public int sumMath(int a, int b) {
        return a + b;
    }
}
