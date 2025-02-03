package week4.membership2;

import java.util.HashSet;

public class MemberShipMangementSet {
    private HashSet<Member> members = new HashSet<>();

    public void addMemberShip(int id, String name, GRADE grade){
        Member member = new Member(id, name, grade);
        if (!members.add(member)) {
            System.out.println("이미 있는 아이디 " + member.getId() + "는 추가할 수 없습니다.");
        }
    }

    public void showAllMember() {
        System.out.println("==============================");
        for(Member member : members){
            System.out.println(member);
        }
        System.out.println("==============================");
    }

    public boolean removeMember(int id){
        for(Member member : members){
            if(member.getId() == id){
                members.remove(member);
                return true;
            }
        }
        System.out.println(id+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
