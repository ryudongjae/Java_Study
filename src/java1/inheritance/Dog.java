package java1.inheritance;

 //animal 하위클래스

public class Dog extends Animal{
    public void sleep(){
        System.out.println(this.name +"  zzzz");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("puppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
