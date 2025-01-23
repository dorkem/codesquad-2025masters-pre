package week3.Problem1.member;

public class DiamondMember extends Member {
    double saleRate;
    int agentId;

    public DiamondMember(String name, int usedMoney, int parkedHour, int agentId) {
        super(name, usedMoney, parkedHour);
        bonusRate = 0.1;
        parkingFee = 0;
        saleRate = 0.1;
        this.agentId = agentId;
    }

    public int calPrice(int price) {
        rewardPoints = (int) (price * bonusRate);
        return price - (int) (price * saleRate);
    }
}
