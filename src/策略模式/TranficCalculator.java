package 策略模式;
//操作策略的上下文环境
public class TranficCalculator {

    public static void main(String[] args) {
        TranficCalculator tranficCalculator = new TranficCalculator();
        tranficCalculator.setCalculateStrategy(new BusStrategy());
        System.out.println("公交车19公里的价格：" + tranficCalculator.calculatePrice(19));
        tranficCalculator.setCalculateStrategy(new TaxiStrategy());
        System.out.println("Taxi19公里的价格：" + tranficCalculator.calculatePrice(19));
    }
    private CalculateStrategy calculateStrategy;

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }

    public int calculatePrice(int km) {
        return calculateStrategy.calculatePrice(km);
    }
}
