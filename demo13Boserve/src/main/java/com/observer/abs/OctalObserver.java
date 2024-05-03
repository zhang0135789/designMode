package com.observer.abs;


import com.Subject;
import com.observer.Observer;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:25
 */
// 八进制 观察类
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
