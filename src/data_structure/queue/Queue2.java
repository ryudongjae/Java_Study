package data_structure.queue;

interface QueueInterface{
    boolean empty();//큐가 비어있는지 확인
    boolean full(); // 큐가 가득 차있는지 확인
    void enqueue(char data); //큐의 가장 마지막에 데이터를 삽입합니다.
    char dequeue();//큐의 첫번째 위치에 있는 데이터를 반환하고 큐에서 삭제
    char peek(); //가장 첫번째 있는 데이터를 추출
    void clear(); //큐에 저장된 데이터 모두 삭제 (초기화)

}

public class Queue2 implements QueueInterface {
    private int front;
    private int rear;
    private int queueSize;
    private char queueArr[];

    public  Queue2(int queueSize){
        front = -1; // front 포인터 초기화
        rear = -1; //rear 포인터 초기화
        this.queueSize = queueSize; //큐 사이즈 설정
        queueArr = new char[this.queueSize]; // 큐 배열 생성
    }

    @Override
    public boolean empty() {
        if (front == rear){
            front = -1;
            rear = -1;
        }

        return (front == rear); // front,rear 포인터가 같은 경우 데이터가 없는 상태이므로 true 아닌경우 false 를 return 한다.
    }

    @Override
    public boolean full() {
        return (rear == this.queueSize -1); //rear 포인터가 큐의 마지막 인덱스랑 동일할 경우 가득찬것이므로 true 아니면 false
    }

    @Override
    public void enqueue(char data) {
      if (full()){
          System.out.println("stack is full");
      }else{
          queueArr[++rear] = data; // 다음 rear 포인터가 가리키는 위치에 데이터 추가
          System.out.println("insert data : " + data);
      }
    }

    @Override
    public char dequeue() {
        if (empty()){
            System.out.println("stack is empty");
            return 0;
        }else{
            System.out.println("dequeue data : "+ queueArr[front +1]); //삭제할 데이터 반환
            // front 포인터는 삭제할 위치에 있는 상태이므로 다음과 같이 (front + 1) % size 로 설정.
            // front + 1 로 설정하면 front 포인터가 마지막 요소에 위치했을 경우,
            // ArrayOutOfBoundException이 발생하기 때문에 (front + 1) % size 로 설정해줌.
            // ex) 큐의 size가 5일 때 (index 범위는 0 ~ 4)
            // index of front 3: (3 + 1) % 5 = 4
            // index of front 4: (4 + 1) % 5 = 0
            front = (front + 1)% this.queueSize;

            return queueArr[front];
        }
    }

    @Override
    public char peek() {
        if (empty()){
            System.out.println("Peekin fail ! Queue is empty");
            return 0 ;
        }else{
            // front 포인터는 삭제한 위치에 있으므로 +1을 해줘서 첫번째 요소를 추출하도록 지정.
            System.out.println("Peeked data : " + queueArr[front +1]);
            return queueArr[front +1];
        }
    }

    @Override
    public void clear() {
        if (empty()){
            System.out.println("queue is empty");
        }else{
            front = -1; //front 포인터 초기화
            rear = -1; // rear 포인터 초기화
            queueArr = new char[this.queueSize];  //새로운 큐 배열 생성
            System.out.println("queue is clear!");
        }
    }

    public void printQueue(){
        if (empty()){
                System.out.println("queue is empty!");
        }else{
                System.out.print("queue element : ");
                // front 포인터는 -1 또는 삭제된 요소의 위치에 있기 때문에,
                // +1 위치를 시작점으로 지정.
                for (int i = front +1; i< rear; i++){
                    System.out.print(queueArr[i] + " ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        int queueSize =  6;
        Queue2 queue2 = new Queue2(queueSize);

        queue2.enqueue('A');
        queue2.printQueue();

        queue2.enqueue('B');
        queue2.printQueue();

        queue2.enqueue('C');
        queue2.printQueue();

        queue2.enqueue('D');
        queue2.printQueue();

        queue2.enqueue('E');
        queue2.printQueue();

        queue2.enqueue('F');
        queue2.printQueue();

        queue2.dequeue();
        queue2.printQueue();


        queue2.dequeue();
        queue2.printQueue();


        queue2.dequeue();
        queue2.printQueue();


        queue2.dequeue();
        queue2.printQueue();


        queue2.dequeue();
        queue2.printQueue();


        queue2.dequeue();
        queue2.printQueue();





    }
}
