package 代理模式;

/***
 * 抽象主题类
 * 该类主要的职责是声明真实主题与代理的共同接口方法，该类既可以是一个抽象类，也可以是一个接口
 */
public abstract class Subject {
    //一个普通的业务方法
    public abstract void visit();
}
