package com.wjy.section3;

public abstract class GetBeanTest {
    public abstract User getBean();

    public void showMe() {
        getBean().showMe();
    }
}
