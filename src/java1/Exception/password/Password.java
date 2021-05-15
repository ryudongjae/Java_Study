package java1.Exception.password;

public class Password {
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) throws PasswordException{
        if (password == null){
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        }else if(password.length()<5){
            throw new PasswordException("비밀번호는 5글자 이상이어야 합니다.");
        }else if (password.matches("[a-zA-Z]+")){
            throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
        }
        this.password = password;
    }


}
class PasswordTest{
    public static void main(String[] args) {
        Password test = new Password();

        String password = null;
        try{
            test.setPassword(password);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "abc";
        try{
            test.setPassword(password);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "abcde";
        try{
            test.setPassword(password);
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }

        password = "aBcde#";
        try{
            test.setPassword(password);
            System.out.println("오류없음");
        }catch (PasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
