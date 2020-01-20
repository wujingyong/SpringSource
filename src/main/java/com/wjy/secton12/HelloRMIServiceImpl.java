package com.wjy.secton12;

public class HelloRMIServiceImpl implements HelloRMIService {
    @Override
    public int getAdd(int a, int b) {
        return a + b;
    }
}
