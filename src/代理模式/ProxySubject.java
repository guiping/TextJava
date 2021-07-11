package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/***
 * 代理类
 * 此类为委托类或代理类，该类持有一个真实主题类的引用，在其所实现的接口方法中调用主题类
 * 中相应的接口方法，以此起到代理的作用
 */
public class ProxySubject extends Subject{
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        realSubject.visit(); // 代理类通过真实主题对象的引用调用其方法
    }


}
