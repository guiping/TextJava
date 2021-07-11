package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class JuejinSubject extends SubJect {
    private List<Observer> observerList = new ArrayList<>();  //订阅者容器，Observer

    @Override
    public void registerObserver(Observer observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);  // 添加订阅关系
        }
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);  //移除订阅关系
        }
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer :
                observerList) {
            observer.notify(message);  //通知
        }
    }
}
