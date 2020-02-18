package RMIHello;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
       HelloService serv1 = (HelloService) Naming.lookup("rmi://localhost:5099/hello");
        System.out.println("--- " + serv1.echo("hey server"));
    }
}
