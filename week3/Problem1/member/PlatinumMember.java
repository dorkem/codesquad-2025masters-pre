package week3.Problem1.member;

public class PlatinumMember extends Member {
    double saleRate;

    public PlatinumMember(String name, int spend, int stayTime) {
        super(name, spend, stayTime);
        bonusRate = 0.05;
        parkingFee = 1000;
        saleRate = 0.05;
    }

    @Override
    public int calPrice(int price) {
        rewardPoints = (int) (price * bonusRate);
        return price - (int) (price * saleRate);
    }
}
