package 策略模式;

public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {  //北京公交车 10公里之内1元，超过10公里之后每增加1元可以乘坐5公里
        int extraTotal = km - 10;  //超过10公里总距离
        int extraFactor = extraTotal / 5;  //超过的距离是5公里的倍数
        int fraction = extraTotal % 5; //超过的公里对5公里取余数
        int price = 1 + extraFactor * 1;//价格计算

        return (fraction > 0) ? ++price : price;
    }
}
