package java1.study01.oop.ch04.EX2;

public class Date {
    private int year;
    private int month;
    private int day;

    private boolean isVaild ;

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12 ){
            isVaild = false;
        }else{
            isVaild = true;
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(month < 13){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (day < 32){
                        this.day = day;
                    }else{
                        System.out.println("month가 잘못 입력");
                        isVaild = false;
                    }
                break;
                case 4: case 6: case 9: case 11:
                    if (day < 31){
                        this.day = day;
                    }else{
                        System.out.println("month가 잘못 입력");
                        isVaild =false;
                    }
                    break;
                case 2:
                    if (day < 29){
                        this.day = day;
                    }else{
                        System.out.println("month가 잘못 입력");
                        isVaild =false;
                    }
                    break;
            }
        }

    }

    public void dateInfo() {
        if (isVaild) {
            System.out.println(year + " 년 " + month + " 월 " + day + " 일 ");
        }else{
            System.out.println("유효하지 않은 날짜 입니다. ");
        }
    }

    public static void main(String[] args) {

        Date dd = new Date();
        dd.setYear(2010);
        dd.setMonth(2);
        dd.setDay(27);

        dd.dateInfo();

    }
}
