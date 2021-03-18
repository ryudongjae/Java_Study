package objectoriented;

public class Object {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Object cat = new Object();
        cat.setName("고양이");

        Object dog = new Object();
        dog.setName("강아지");



        System.out.println(cat.name);
        System.out.println(dog.name);
    }




}
