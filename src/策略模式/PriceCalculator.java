package 策略模式;

public class PriceCalculator {
    private static final int BUS = 1; //公交车类型
    private static final int SUBWAY = 2;//地铁类型

    //公交车价格计算
    private static int busPrice(int km) {
        int extraTotal = km - 10;  //超过10公里总距离
        int extraFactor = extraTotal / 5;  //超过的距离是5公里的倍数
        int fraction = extraTotal % 5; //超过的公里对5公里取余数
        int price = 1 + extraFactor * 1;//价格计算

        return (fraction > 0) ? ++price : price;
    }

    //地铁价格计算
    public static int subwayPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        } else {
            return 7;
        }

    }

    public static int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (km == SUBWAY) {
            return subwayPrice(km);
        }
        return 0;
    }

    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        System.out.println("坐19公里的公交车票价格为：" + priceCalculator.busPrice(19));
        System.out.println("坐19公里的地铁票价格为：" + priceCalculator.subwayPrice(19));
    }
}


