package java1.study01.oop.ch04;

public class ArrrayChar {
    public static void main(String[] args) {
        char [] alpahbets = new char[26];
        char ch = 'a';

        for (int i = 0; i<alpahbets.length; i++){
            alpahbets[i] = ch++;
        }

        for(int i = 0; i<alpahbets.length; i++){
            System.out.println(alpahbets[i] +","+(int)alpahbets[i]);
        }
    }
}
