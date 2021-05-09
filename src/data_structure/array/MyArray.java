package data_structure.array;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -99999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];

    }
    public MyArray(int size){
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[ARRAY_SIZE];
    }
    public void addElement(int num){
        if (count >=  ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }else {
            intArr[count++] = num;
        }
    }

    public void insertElement(int position, int num){
        int i = 0;
        if (position <0 || position > count){
            System.out.println("position error");
        }else if (count >= ARRAY_SIZE){
            System.out.println("full");
        }
        for (i = count -1; i>=position; i++){
            intArr[i+1] =intArr[i];
        }

        intArr[position] =num;
        count++;
    }

    public int deleteElement(int position  ){
        int er = ERROR_NUM;
        if (isEmpty()){
            System.out.println("no Element");
        }else if (position < 0 ||position >= count){
            System.out.println("index Error");
            return er;
        }
        er = intArr[position];
        for (int i = position; i< count-1; i++){
            intArr[i] = intArr[i+1];
        }
        count--;
        return er;

    }

    public int getSize(){
        return count;
    }

    public boolean isEmpty(){
        if(count == 0){
            return true;
        }else {
            return false;
        }
    }

    public int getElement(int position){
        if (position < 0 || position > count-1){
            System.out.println("검색 위치 오류. 현재 리스트 개수는"+ count +"개 입니다. ");
            return intArr[position];
        }
        return intArr[position];
    }

    public void printAll(){
        if (count ==0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }else {
            for(int i = 0; i<count; i++){
                System.out.println(intArr[i]);
            }
        }

    }

    public void removeAll(){
        for(int i = 0; i<count; i++){
            intArr[i] = 0;
        }
        count =0;
    }

}
