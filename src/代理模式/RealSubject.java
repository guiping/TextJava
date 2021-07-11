package 代理模式;

import 观察者模式.SubJect;

/***
 * 实现抽象主题的真实主题类
 * 该类是被委托类或被代理类，该类定义了代理所标识的真实对象，由其执行具体的业务逻辑方法，
 * 而客户类则通过代理类间接的调用真实主题类中定义的方法
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("Real subject visit");
    }
}
