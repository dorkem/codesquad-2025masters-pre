package week2.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = School.getSubject();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("메뉴를 선택하세요:");
            System.out.println("1. 학생 성적 조회");
            System.out.println("2. 성적 입력");
            System.out.println("3. 성적 수정");
            System.out.println("4. 학생 추가");
            System.out.println("5. 저장");
            System.out.println("6. 종료");
            System.out.print("입력: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 6) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("조회할 학생의 이름을 입력하세요");
                    school.printAllStudent();
                    String inputName1 = sc.nextLine();
                    school.printStudent(inputName1);
                    break;

                case 2:
                    System.out.println("누구의 성적을 입력할까요?");
                    school.printAllStudent();
                    String inputName2 = sc.nextLine();
                    System.out.println("과목 이름을 입력하세요.");
                    String inputSubject = sc.nextLine();
                    System.out.println("성적을 입력하세요.");
                    int checkScore = sc.nextInt();
                    sc.nextLine();
                    school.addScore(inputName2, inputSubject, checkScore);
                    break;

                case 3:
                    System.out.println("수정할 학생의 이름을 입력하세요");
                    school.printAllStudent();
                    String inputName3 = sc.nextLine();
                    System.out.println("과목 이름을 입력하세요.");
                    String setSubject = sc.nextLine();
                    System.out.println("성적을 입력하세요.");
                    int setScore = sc.nextInt();
                    sc.nextLine();
                    school.setScore(inputName3, setSubject, setScore);
                    break;

                case 4:
                    System.out.print("추가할 학생의 이름: ");
                    String studentName = sc.nextLine();
                    System.out.print("추가할 학생의 전공: ");
                    String studentMajor = sc.nextLine();
                    school.addStudent(studentName, studentMajor);
                    System.out.println("학생이 성공적으로 추가되었습니다.");
                    break;

                case 5:
                    System.out.println("학생 정보를 파일에 저장합니다...");
                    school.saveFile();
                    System.out.println("저장 완료: INPUT.TXT");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
        sc.close();
    }
}
