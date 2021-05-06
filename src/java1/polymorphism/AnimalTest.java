package java1.polymorphism;

import java.util.ArrayList;

//하나의 코드가 여러 자료형으로 구현되어 실행되는 것
//같은 코드에서 여러 다른 실행 결과가 나옴
//정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
//다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음
class Animal1{

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal1{

    public void move() {

        System.out.println("사람이 두발로 걷습니다.");
    }

    public void readBooks() {

        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger1 extends Animal1{

    public void move() {

        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting()
    {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}


class Eagle extends Animal1{
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
    }
}
//상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 각 클래스에 맞는 기능 구현

//여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음

public class AnimalTest {
    //instanceof =  원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환한다.

    public static void main(String[] args) {

        Animal1 hAnimal = new Human();
        Animal1 tAnimal = new Tiger1();
        Animal1 eAnimal = new Eagle();
//
//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal1> animalList = new ArrayList<Animal1>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal1 animal : animalList) {
            animal.move();
        }

        AnimalTest animalTest = new AnimalTest();
        animalTest.DownCastingTest(animalList);
    }

    public void moveAnimal(Animal1 animal) {
        animal.move();

    }
    public void DownCastingTest(ArrayList<Animal1> list){
            for (int i = 0; i< list.size(); i++){
                Animal1 animal = list.get(i);
                if ( animal instanceof Human){
                    Human human = (Human)animal;
                    human.readBooks();
                }else if (animal instanceof Tiger1){
                    Tiger1 tiger1 = (Tiger1) animal;
                    tiger1.hunting();
                }else if(animal instanceof Eagle){
                    Eagle eagle = (Eagle) animal;
                    eagle.flying();
                }
            }
    }
}

