package java1.study01;

public class For03 {
    public static void main(String[] args) {
        int[] score ={90,88,33,20,99};
        for (int i= 0; i<score.length; i++ ){
            if (score[i] < 60){
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }

    }
}
