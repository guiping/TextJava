package 观察者模式;

public class Test {
    public static void main(String[] args) {
        JuejinSubject juejinSubject = new JuejinSubject(); //掘金被观察者对象

        //程序员观察者
        Coder coderA = new Coder("程序员A");
        Coder coderB = new Coder("程序员B");
        Coder coderC = new Coder("程序员C");
        Coder coderD = new Coder("程序员D");

        //注册观察
        juejinSubject.registerObserver(coderA);
        juejinSubject.registerObserver(coderB);
        juejinSubject.registerObserver(coderC);
        juejinSubject.registerObserver(coderD);

        //通知观察者
        juejinSubject.notifyObserver("丁大忽悠发布新文章啦，快来查看吧>_>");
    }
}
