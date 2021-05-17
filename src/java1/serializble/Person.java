package java1.serializble;

import java.io.*;

public class Person implements Serializable {
    String name;
    String job;  //transient은 직렬화를 하지 않는 멤버 변수에 사용된다.

    public Person(){

    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public static void main(String[] args) throws ClassNotFoundException{
        Person p1 = new Person("KIM","CEO");
        Person p2 = new Person("LEE","CTO");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(p1);
            oos.writeObject(p2);

        }catch (IOException e){
            e.printStackTrace();
        }


        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person per1 = (Person)ois.readObject();
            Person per2 = (Person)ois.readObject();

            System.out.println(per1);
            System.out.println(per2);


        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
