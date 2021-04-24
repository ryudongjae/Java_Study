package data_structure.queue;

import java.util.NoSuchElementException;

interface Queueinterface<E>{
    /**
     * 큐의 가장 마지막에 요소를 추가합니다.
     *
     * @param e 큐에 추가할 요소
     * @return 큐에 요소가 정상적으로 추가되었을 경우 true를 반환
     */
    boolean offer(E e);

    /**
     * 큐의 첫 번째 요소를 삭제하고 삭제 된 요소를 반환합니다.
     *
     * @return 큐의 삭제 된 요소 반환
     */
    E poll();

    /**
     * 큐의 첫 번째 요소를 반환합니다.
     *
     * @return 큐의 첫 번째 요소 반환
     */
    E peek();
}
public class ArrayQueue<E> implements Queueinterface<E>{

    private static final int DEFAULT_CAPACITY = 64; //최소 용적 크기

    private Object[] array; //요소를 담을 배열
    private int size; //요소 개수

    private int front; //시작 인덱스를 가리키는 변수(빈 공간임을 유의)
    private int rear; //마지막 요소의 인덱스를 가리키는 변수

    //생성자1 (초기 용적 할당을 안할 경우)
    //ArrayQueue<Integer> q = new ArrayQueue<>();
    public ArrayQueue() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }
    // 생성자2 (초기 용적 할당을 할 경우)
    //ArrayQueue<Integer> q = new ArrayQueue<>(100);
    public ArrayQueue(int capacity) {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }
    private void resize(int newCapacity){
        int arrayCapacity = array.length; //현재 용적 크기

        Object[] newArray = new Object[newCapacity]; //용적을 변경한 배열

        /**
         * i = new array index
         * j = original array
         * index 요소 개수(size)만큼 새 배열에 값 복사
         */


        for(int i =1 ,j= front+1; i<=size; i++, j++ ){
            newArray[i] = array[j % arrayCapacity];
        }

        this.array = null;
        this.array = newArray; //새 배열을 기존 array 의 배열로 덮어씌움

        front = 0 ;
        rear = size;
    }

    @Override
    public boolean offer(E e) {
        //용적이 가득 찼을 경우
        if((rear+1)%array.length ==front){
            resize(array.length*2); //용적을 두배로 늘려준다.
        }
        rear = (rear + 1)%array.length;  // rear을 rear의 다음 위치로 갱신

        array[rear] = e;
        size++; //size 1 증가

         return true;
    }

    @Override
    public E poll() {
        if(size == 0){  //삭제 할 요소가 없을 경우 null을 반환
            return null;
        }
        front  = (front + 1)%array.length; //front를 한칸 옮긴다.

        @SuppressWarnings("unchecked")
        E e =(E) array[front]; //변환할 데이터 임시 저장

        array[front] = null; //해당 프론트의 데이터 삭제
        size--; //사이즈 감소
        // 용적이 최소 크기(64)보다 크고 요소 개수가 1/4 미만일 경우
        if(array.length > DEFAULT_CAPACITY && size < (array.length/4)){

            // 아무리 작아도 최소용적 미만으로 줄이지는 않도록 한다.
            resize(Math.max(DEFAULT_CAPACITY,array.length/2));
        }

        return e;


    }

    public E remove(){
        E e = poll();

        if(e == null){
            throw new NoSuchElementException();
        }
        return e;
    }

    @Override
    public E peek() {
        return null;
    }
}
