package 观察者模式;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//抽象一个主题
public abstract class SubJect {
    //注册订阅
    void registerObserver(Observer observer) { }
    //解注册订阅
    void unRegisterObserver(Observer observer){}
     //通知订阅者
    void notifyObserver(String message){}
}
