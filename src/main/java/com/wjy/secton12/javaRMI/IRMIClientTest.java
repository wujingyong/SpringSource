package com.wjy.secton12.javaRMI;

import lombok.SneakyThrows;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class IRMIClientTest {
    @SneakyThrows
    public static void main(String[] args) {
        Registry registry = LocateRegistry.getRegistry("localhost");
        IRemoteMethod method = (IRemoteMethod) registry.lookup("method");
        int add = method.add(1, 5);
        System.out.println(add);
    }
}
