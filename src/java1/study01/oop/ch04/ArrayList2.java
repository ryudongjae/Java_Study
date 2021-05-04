package java1.study01.oop.ch04;

import java.util.ArrayList;

public class ArrayList2 {

       public static void main(String[] args) {
              ArrayList<Array2> library = new ArrayList<>();

              library.add(new Array2("1","Kim"));
              library.add(new Array2("2","Lee"));
              library.add(new Array2("3","You"));
              library.add(new Array2("4","Park"));
              library.add(new Array2("5","Ryu"));
              library.remove(library.get(4));

              for(int i = 0; i < library.size(); i++){
                     library.get(i).showInfo();

              }

              System.out.println(library.isEmpty());
              System.out.println(library.size());

       }
}
