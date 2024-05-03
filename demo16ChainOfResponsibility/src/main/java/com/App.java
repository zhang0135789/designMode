package com;


import com.approve.Approve;
import com.approve.impl.Director;
import com.approve.impl.Manager;
import com.approve.impl.TeamLeader;

/**
 * Hello world!
 * 原理：内嵌next对象，如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者。例如：请假审批
 */
// 客户端代码
public class App {
    public static void main( String[] args ) {
        // 请假审批：团队领导审批不了；管理者审批，管理者审批不了；领导审批。
        Approve teamLeader = new TeamLeader();
        Approve manager = new Manager();
        Approve director = new Director();

        teamLeader.setNext(manager);
        manager.setNext(director);

        teamLeader.approve(1);
        teamLeader.approve(3);
        teamLeader.approve(6);
        teamLeader.approve(8);
    }
}
