package 策略模式;
//定义一个计算价格的抽象策略接口
public interface CalculateStrategy {
    /**
     * 按照距离计算价格
     * @param km 公里
     * @return 返回价格
     */
    int calculatePrice(int km);
}
