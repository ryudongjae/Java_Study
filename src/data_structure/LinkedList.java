package data_structure;

import java.util.List;

//리스트를 구성하는 노드 클래스
class ListNode{
    private String data; //데이터 저장변수

    public ListNode link; //다른 노드를 참조할 링크 노드

    public ListNode() {
        this.data = null;
        this.link = null;
    }

    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }

    public ListNode(String data, ListNode link) {
        this.data = data;
        this.link = link;
    }
    public String getData(){
        return this.data;
    }
}

public class LinkedList {

    private ListNode head;  //ListNode 타입의 head 노드 인스턴스 변수

    //LinkedList 생성자
    private LinkedList(){
        head =null;  //head 노드 초기화
    }

    //Node삽입
    public void insertNode(ListNode preNode, String data){
        ListNode newNode = new ListNode(data); //새로운 노드 생성

        //preNode.link는 preNode의 다음 노드 이므로
        //newNode.link=preNode.link 는 새로운 노드의 link 가 preNode 의 다음노드를 참조 하도록 함.
        newNode.link = preNode.link;

        // preNode의 link가 새로운 노드를 참조하도록 함.
        // 최종적으로 'preNode -> newNode -> 기존 preNode의 다음 노드 '이렇게 구성됨.

        preNode.link = newNode;
    }
    public void insertNode(String data){
        ListNode newNode = new ListNode(data); //새로운 노드 생성
        if(head == null ) {
            //head노드가 null인 경우 새로운 노드를 참조 하도록함
            this.head = newNode;
        }else{
            //head노드가 null이 아닌 경우 temp 노드가 head를 참조
            // tempNode는 마지막 노드를 찾아서 참조하기 위해 사용.
            ListNode tempNode = head;

            // temp 노드의 link가 null이 아닐 때까지 다음 노드를 참조.
            // tempNode.link는 다음 노드를 참조하고 있으므로,
            // tempNode = tempNode.link는 tempNode에 다음 노드를 참조하도록 하는 것.
            // while문이 모두 실행되면 tempNode는 가장 마지막 노드를 참조하게 됨.
            while(tempNode.link != null ){
                tempNode = tempNode.link;   //다음 노드를 참조
            }

            tempNode.link = newNode;
        }
    }

    public void deletedNode(String data){
        //preNode는 head가  가리키는 노드를 할당
        ListNode preNode = head;

        //tempNode는 head가 가리키는 노드 다음 노드를 가리킨다.(preNode 다음 노드)
        ListNode tempNode = head.link;

        if (data.equals(preNode.getData())) {
            //head는 preNode 다음 노드를 참조 하도록함
            head = preNode.link;

            //
            preNode.link = null;
        }else{
            //tempNode가 null일때 까지 무한 탐색
            while(tempNode != null){
                // 주어진 데이터와 temp 노드의 데이터가 일치할 경우.
                if (data.equals(tempNode.getData())){
                    //tempNode가 마지막인 경우
                    if (tempNode.link == null){
                        preNode.link = null;
                    }else{
                        // tempNode가 마지막 노드가 아닌 경우
                        // preNode의 link는 tempNode의 다음 노드를 참조.
                        // tempNode의 link는 null을 할당하여 다음 노드로의 연결을 끊음.
                        preNode.link = tempNode.link;
                        tempNode.link = null;
                    }
                }
            }
        }

    }


}
