package data_structure.stack;

interface StackArray{
    boolean empty();
    boolean full();
    void push(char data);
    char pop();
    char peek();
    void clear();
}

public class ArrayStack implements StackArray {


    private int top;
    private int stackSize;
    private char stackArr[];

    //스택을 생성하는 생성자
    public ArrayStack(int stackSize) {
        top = -1;  //스택 포인터 초기화
        this.stackSize = stackSize; //스택 사이즈 설정
        stackArr = new char[this.stackSize]; //스택 배열 생성
    }

    @Override
    public boolean empty() {
        //스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌경우 false
        return (top == -1);
    }

    @Override
    public boolean full() {
        // 스택 포인터가 스택의 마지막 인덱스와 동일한 경우 true 아닌 경우 false를 return
        return (top == this.stackSize - 1);
    }

    @Override
    public void push(char data) {
        if (full()) {
            System.out.println("Stack is full!!");
        } else {
            stackArr[++top] = data;    // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
            System.out.println("Insert data : " + data);
        }
    }

    @Override
    public char pop() {
        if (empty()){
            System.out.println("stack is empty");
            return 0;
        }else{
            System.out.println("deleted data : " + stackArr[top]);
            return stackArr[top--];
        }
    }

    @Override
    public char peek() {
        if (empty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Peek data : " + stackArr[top]);
            return stackArr[top];
        }
        return 0;
    }

    @Override
    public void clear() {
        if (empty()){
            System.out.println("Stack is Empty!");
        }else{
            top = -1; //스택 초인터 초기화
            stackArr =  new char[this.stackSize];  //새로운 스택 배열 생성
            System.out.println("Stack is clear");
        }
    }
    public void printStack(){
        if (empty()){
            System.out.println("stack is empty");
        }else{
            System.out.print("Stack elements : ");

            for(int i =0; i<= top; i++){
                System.out.print(stackArr[i] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int stackSize = 5;
        ArrayStack arrStack = new ArrayStack(stackSize);

        arrStack.push('1');
        arrStack.printStack();

        arrStack.push('2');
        arrStack.printStack();

        arrStack.push('3');
        arrStack.printStack();

        arrStack.push('4');
        arrStack.printStack();

        arrStack.push('5');
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();
    }
}
