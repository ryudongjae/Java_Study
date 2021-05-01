package java1.study02;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        switch (score){
            case 1 :
                System.out.println("1등급");
                break;

            case 2 :
                System.out.println("2등급");
                break;
            case 3 :
                System.out.println("3등급");
                break;
            case 4 :
                System.out.println("4등급");
                break;

            case 5 :
                System.out.println("5등급");
                break;
            case 6 :
                System.out.println("6등급");
                break;
            default:
                System.out.println("열심히 하자 ");
                break;
        }

    }
}
