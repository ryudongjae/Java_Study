package java1.interfaceEx.interfaceEx1.EX2;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> booklist;

    public Shelf(){
        booklist = new ArrayList<String>();

    }
    public ArrayList<String> getBooklist(){
        return booklist;
    }

    public int getCount(){
        return booklist.size();

    }
}
