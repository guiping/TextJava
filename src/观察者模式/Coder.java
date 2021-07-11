package 观察者模式;

class Coder implements Observer {
    private String name;
    public Coder(String name){
        this.name = name;
    }
    @Override
    public void notify(String message) {
        System.out.println("hi " +name +" 您订阅的juejin主题更新啦，更新内容 " + message);
    }
}
