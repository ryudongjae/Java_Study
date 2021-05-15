package java1.Exception.password;

//exception 커스텀
public class PasswordException extends IllegalArgumentException{
    public PasswordException(String message){
        super(message);
    }
}
