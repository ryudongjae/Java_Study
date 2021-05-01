package java1.study02;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int num;

        for (num = 1;/*초기화식*//*조건식*/ ; num++/*증감식 */){
            sum += num;  //sum = sum+ num
        if(sum >= 100)  //sum이 100 을 넘어가면 break
            break;

        }
        System.out.println(sum);
        System.out.println(num);
    }
}
