package me.lei.chain;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        Handler deptHandler = new DeptManager();
        Handler pmHandler = new ProjectManager();

        pmHandler.setSuccessor(deptHandler);

        String ret = pmHandler.handle(new FeeRequest("小明", BigDecimal.valueOf(300)));
        System.out.println(ret);

        ret = pmHandler.handle(new FeeRequest("小红", BigDecimal.valueOf(600)));
        System.out.println(ret);
    }
}
