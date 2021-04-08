package example.staticEx;

public class CompanyNumber {

    public static int getSerialNum() {
        return serialNum;
    }

    private static int serialNum =1000;

    private int CompanyId;
    private String CompanyName;
    private String department;

    public CompanyNumber(){
        serialNum++;
        CompanyId = serialNum;

    }

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int companyId) {
        CompanyId = companyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
