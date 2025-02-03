package week4.membership3;

import java.util.HashMap;

public class MemberShipMangementMap {

    private HashMap<Integer, Member> members = new HashMap<>();

    public void addMemberShip(int id, String name, GRADE grade){
        if(members.containsKey(id)){
            System.out.println("이미 있는 아이디 "+id+"의 값이 변경됩니다.");
            Member member = members.get(id);
            member.setName(name);
            member.setGrade(grade);
        }
        else{
            Member member = new Member(id, name, grade);
            members.put(id, member);
        }
    }
    public void showAllMember() {
        System.out.println("==============================");
        for(Member member : members.values()) {
            System.out.println(member);
        }
        System.out.println("==============================");
    }

    public boolean removeMember(int id){
        if(members.containsKey(id)){
            members.remove(id);
            return true;
        }
        System.out.println(id+"에 해당하는 멤버가 없습니다.");
        return false;
    }
}
