package com.wjy.secton12.javaRMI;

import lombok.SneakyThrows;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class IRMIServiceTest {
    @SneakyThrows
    public static void main(String[] args) {
        IRemoteMethod iRemoteMethod = new IRemoteMethodImpl();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("method", iRemoteMethod);
        System.out.println("ready ... ");
    }
}
