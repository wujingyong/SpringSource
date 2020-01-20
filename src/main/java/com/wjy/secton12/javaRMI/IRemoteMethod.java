package com.wjy.secton12.javaRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteMethod extends Remote {
    int add(int i, int j) throws RemoteException;
}
