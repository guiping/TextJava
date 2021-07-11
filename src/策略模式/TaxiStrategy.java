package 策略模式;
//TAXI 计算策略类
public class TaxiStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return km * 2;
    }
}
