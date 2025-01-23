package week3.Problem1.member;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> member = new ArrayList<>();
        member.add(new Member("James",10000,2));
        member.add(new Member("Tomas",30000,2));
        member.add(new PlatinumMember("Edward",10000,2));
        member.add(new PlatinumMember("Percy",30000,2));
        member.add(new DiamondMember("Elizabet",30000,2,1111));

        for (Member members : member) {
            members.printCustomer();
        }
    }
}
