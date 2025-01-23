package week3.Problem1;

public class Member {
    protected String name;
    protected int spend;
    protected int stayTime;

    double bonusRate;
    int rewardPoints;
    int parkingFee;

    public Member(){
        initCustomer();
    }

    public Member(String name, int spend, int stayTime) {
        this.name = name;
        this.spend = spend;
        this.stayTime = stayTime;
        initCustomer();
    }

    private void initCustomer(){
        bonusRate = 0.01;
        parkingFee = 3000;
    }

    public int calPrice(int price){
        rewardPoints += (int) (price * bonusRate);
        return price;
    }

    public void printCustomer(){
        System.out.println(name+"님의 지불 금액은 "+ calPrice(spend) +" 원이고, 적립 포인트는 "+ rewardPoints+"점 입니다.");
        System.out.println("주차 요금은 "+ stayTime*parkingFee+"원 입니다.");
        System.out.println();
    }
}

