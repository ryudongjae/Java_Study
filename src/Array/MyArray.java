package Array;

import java.util.ArrayList;

public class MyArray {

    int[] intArr;    //int array
    int count;      //개수

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray()
    {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }
}
