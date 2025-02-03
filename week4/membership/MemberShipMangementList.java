package week4.membership;

import java.util.ArrayList;

public class MemberShipMangementList {
    private ArrayList<Member> member = new ArrayList<>();
    public void addMemberShip(int id, String name, GRADE grade){
        member.add(new Member(id, name, grade));
    }

    public void showAllMember(){
        System.out.println("==============================");
        for(Member member : member){
            System.out.println(member);
        }
        System.out.println("==============================");
    }

    public boolean removeMember(int id){
        for(Member members : member){
            if(members.getId() == id){
                member.remove(members);
                return true;
            }
        }
        System.out.println(id+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
