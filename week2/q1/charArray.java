package week2.q1;

public class charArray {
    public static void main(String[] args) {
        char[] alphabet = new char[26];
        for(int i = 0; i<=25; i++) alphabet[i] = (char) (i + 65);
        for(int i=0;i<alphabet.length;i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}