package 代理模式;

import java.lang.reflect.Proxy;

/***
 * 具体客户类
 */
public class Client {
    public static void main(String[] args) {
        DynamicSubject dynamicSubject = new DynamicSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(dynamicSubject);
        //获取被代理类的ClassLoader
        ClassLoader loader = dynamicSubject.getClass().getClassLoader();
        Dynamic dynamic = (Dynamic) Proxy.newProxyInstance(loader,new Class[]{Dynamic.class},dynamicProxy);
        dynamic.visit();
    }

}
