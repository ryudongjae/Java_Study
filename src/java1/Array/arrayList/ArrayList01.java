package java1.Array.arrayList;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<book> library = new ArrayList<>();

        library.add(new book("1","00"));
        library.add(new book("2","01"));
        library.add(new book("3","02"));
        library.add(new book("4","03"));

        for(int i =0; i<library.size(); i++){
            library.get(i).showInfo();

        }
        System.out.println(library.size());
    }
}
