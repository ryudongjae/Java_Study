package data_structure.stack;

interface Stack01{
    boolean isEmpty();
    boolean isFull();
    void push(char data);
    char pop();
    char peek();
    void clear();
}
public class MyStack01 implements Stack01 {
    private int top;
    private int stackSize;
    private char stackArr[];

    public MyStack01(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == this.stackSize-1);
    }

    @Override
    public void push(char data) {
        if (isFull()){
            System.out.println("stack is full");
        }else{
            stackArr[++top] = data;
            System.out.println("Inserted data : " + data);
        }
    }

    @Override
    public char pop() {
        if (isEmpty()){
            System.out.println("stack is Empty");
            return 0;
        }else{
            System.out.println("deleted data : "+ stackArr[top]);
            return stackArr[top--];
        }

    }

    @Override
    public char peek() {
        if (isEmpty()){
            System.out.println("stack is Empty");
            return 0;
        }else{
            System.out.println("Peek data: " +  stackArr[top]);
            return stackArr[top];
        }

    }

    @Override
    public void clear() {
        if (isEmpty()){
            System.out.println("stack is Empty");
        }else{
            top = -1;
            stackArr = new char[this.stackSize];
            System.out.println("stack is clear");
        }

    }

    public void stackPrint(){
        if (isEmpty()){
            System.out.println("stack is empty");
        }else{
            for (int i = 0; i<stackSize; i++){
                System.out.println(stackArr[i]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int stackSize = 5;
        MyStack arrStack = new MyStack(stackSize);

        arrStack.push('A');
        arrStack.printStack();

        arrStack.push('B');
        arrStack.printStack();

        arrStack.push('C');
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();

        arrStack.pop();
        arrStack.printStack();

        arrStack.peek();
        arrStack.printStack();

        arrStack.clear();
        arrStack.printStack();
    }
}


