package example.example2;

public class Taxi {
    public String taxiCompany;
    public int money;

    public Taxi(String taxiCompany) {
        this.taxiCompany = taxiCompany;
    }

    public void take(int money){
        this.money += money;
    }
    public void showTinfo(){
        System.out.println(taxiCompany +"회사의 수입은 " +money+"입니다.");
    }
}
