package data_structure.linkedList;

public class MyListNode  {
    private String data;
    public MyListNode next;

    public MyListNode() {
        data = null;
        next = null;
    }

    public MyListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public MyListNode(String data, MyListNode link) {
        this.data = data;
        this.next = link;
    }

    public String getData() {
        return data;
    }
}
class MyLinkedList {
    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count =0;
    }

    public MyListNode addElement(String data){

        MyListNode newNode;

        //맨 처음에 element추가 할때
        if (head == null){
            newNode = new MyListNode(data);
            head = newNode;

        }else{
            //맨 뒤에 추가
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = newNode;

        }
        count++;
        return newNode;
    }
    //삽입
    public MyListNode insertElement(int position,String data){
        int i;
        MyListNode tempNode = head;
        MyListNode newNode = new MyListNode(data);

        if (position >= count ||position < 0){
            System.out.println("추가 할 위치 오류입니다. 현재 리스트의 개수는 "+count+ "개 입니다.");
        }
        if (position == 0) { //맨앞에 들어가는 경우
            newNode.next = head;
            head = newNode;
        }else{
            MyListNode preNode = null;
            for (i =0; i<position; i++){
                preNode = tempNode; //
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next; //새로들어갈 노드가 preNode가 가리키던 다음 노드를 가리키면 된다.
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    //remove
    public MyListNode remove(int position){
        int i;
        MyListNode tempNode = head;

        if(position>= count){
            System.out.println("remove position error"+count+"->현재 리스트 개 ");
            return null;
        }
        if (position == 0) {
            head = tempNode.next; // head가 삭제 되기 때문에 head는 다음노드로 바뀐다.
        }else{
            MyListNode preNode = null;
            for (i = 0; i<position; i++){
                preNode = tempNode;
                tempNode= tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        System.out.println(position+"번째 항목이 삭제 되었습니다.");
        return tempNode;
    }

    public String getElement(int position){
        int i;
        MyListNode  tempNode = head;

        if (position >= count){
            System.out.println("search Error."+count+"= 현제 리스트 개수 ");
            return new String("ERROR");
        }
        if (position == 0){
            return head.getData();
        }
        for (i = 0; i<position; i++){
            tempNode= tempNode.next;
        }
        return  tempNode.getData();
    }
    public MyListNode getNode(int position){
        int i;
        MyListNode tempNode = head;
        if (position >= count){
            System.out.println("검색 위치 오류 (현재 리스트 개수는 :"+count+")");
            return null;
        }
        if (position == 0){
            return head;
        }
        for (i=0; i<position; i++){
            tempNode = tempNode.next;
        }
        return tempNode;

    }
    public void removeAll(){
        head = null;
        count = 0;
    }

    public int getSize(){
        return count;
    }

    public void printAll(){
        if (count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }
        MyListNode temp =head;
        while (temp !=null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();
        list.insertElement(1,"G");
        list.printAll();
        list.remove(2);
        list.printAll();
        list.removeAll();
        list.printAll();
    }
}

