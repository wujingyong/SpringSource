package com.wjy.secton12.javaRMI;

import lombok.NoArgsConstructor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IRemoteMethodImpl extends UnicastRemoteObject implements IRemoteMethod {
    public IRemoteMethodImpl() throws RemoteException {
    }

    @Override
    public int add(int i, int j) {
        return i + j;
    }
}
