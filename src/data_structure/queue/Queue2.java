package data_structure.queue;
/**
 *      #enqueue
        큐의 가장 마지막에 데이터를 삽입합니다.

        #dequeue
        큐의 첫 번째 위치에 있는 데이터를 반환하고 큐에서 삭제합니다.

        #isEmpty
        큐가 empty 상태인지 확인합니다.

        #clear
        큐에 저장된 모든 데이터를 삭제하고 큐를 초기화합니다.

        #peek
        큐의 첫 번째 위치에 있는 데이터를 추출합니다.
        dequeue 메서드와는 달리 큐에서 데이터를 삭제하지 않습니다.
*/

interface Data{
    boolean isEmpty();
    boolean isFull();
    void enqueue(char e);
    char dequeue();
    char peek();
    void clear();

}
public class Queue2 implements Data {

    private int front;
    private int rear;
    private int queueSize;
    private char queueArr[];

    //큐를 생성하는 생성자
    public Queue2(int queueSize){
        front = -1; //front 포인터 초기화
        rear = -1;  //rear 포인터 초기화
        this.queueSize = queueSize;  //queue 사이즈 설정
        queueArr = new char[this.queueSize];  //큐 배열 생성
    }
    @Override
    public boolean isEmpty() {  //큐가 비어있는지 확인
        if(front == rear){
            // front,rear 포인터가 같은 경우 데이터가 없는 상태이므로 포인터를 모두 -1로 초기화
            front = -1;
            rear = -1;
        }
        //front,rear 포인터가 같은 경우 데이터가 없으므로 true 반환 ,아닌경우 false 반환
        return (front == rear);
    }

    @Override
    public boolean isFull() {  //큐가 가득찬 상태인지 확인
        return (rear == this.queueSize -1);
    }

    @Override
    public void enqueue(char e) {

    }

    @Override
    public char dequeue() {
        return 0;
    }

    @Override
    public char peek() {
        return 0;
    }

    @Override
    public void clear() {

    }
}
