package RMIHello;

import jdk.jshell.execution.RemoteExecutionControl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {
    public String echo(String input) throws RemoteException;

}
