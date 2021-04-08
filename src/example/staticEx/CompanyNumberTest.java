package example.staticEx;

public class CompanyNumberTest {
    public static void main(String[] args) {
        CompanyNumber person1 = new CompanyNumber();
        person1.setCompanyName("Lee");

        System.out.println(person1.serialNum);

        CompanyNumber person2 = new CompanyNumber();
        person2.setCompanyName("Kim");
        person2.serialNum++;

        System.out.println(person2.getCompanyName() +"님의 사원 번호는 "+person2.getCompanyId());
        System.out.println(person1.getCompanyName() +"님의 사원 번호는 "+person1.getCompanyId());
    }
}
