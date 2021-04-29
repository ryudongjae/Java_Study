package data_structure.tree;

class Node{
    int data; //노드 값
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree02 {
    Node root = null;

    //새로운 노드 삽입
    public void insert(int element) {
        //root가 빈 경우 , 즉 아무 노드도 없는 경우
        if (root == null) {
            root = new Node(element);
        } else {
            Node head = root;
            Node currentNode;

            while (true) {
                currentNode = head;

                //현재의 root 보다 작은경우 ,왼쪽으로 탐색을 한다.
                if (head.data > element) {
                    head = head.left;

                    //왼쪽 자식 노드가 비어있는 경우, 해당 위치에 추가할 노드를 삽입한다.

                    if (head == null) {
                        currentNode.left = new Node(element);
                        break;
                    }
                } else {
                    //현재 root보다 큰 경우, 오른쪽으로 탐색을 한다.
                    head = head.right;

                    //오른쪽 자식 노드가 비어있는 경우, 해당 위치에 추가할 노드를 삽입한다.
                    if (head == null) {
                        currentNode.right = new Node(element);
                        break;
                    }
                }
            }
        }
    }

    public boolean removeNode(int element) {
        Node remove = root;
        Node parentRemove = null;

        while (remove.data != element) {
            parentRemove = remove;

            //삭제할 값이 현재 노드보다 작으면 왼쪽을 탐색한다.
            if (remove.data > element) {
                remove = remove.left;
            } else {
                remove = remove.right;
            }

            //값 대소를 비교하여 탐색했을 때,leaf node 인 경우 삭제를 위한 탐색한다.

            if (remove == null)
                return false;

        }
        //자식 노드가 모두 없을때
        if (remove.left == null && remove.right == null) {
            //삭제 대상이 트리의 루트일 때
            if (remove == root) {
                root = null;
            } else if (remove == parentRemove.right) {
                parentRemove.right = null;
            } else {
                parentRemove.left = null;
            }
        }
        //오른쪽 자식 노드만 존재하는 경우
        else if (remove.left == null) {
            if (remove == root) {
                root = remove.right;
            } else if (remove == parentRemove.right) {
                //삭제 대상의 오른쪽 자식 노드를 삭제 대상 위치에 둔다.
                parentRemove.right = remove.right;
            } else {
                parentRemove.left = remove.left;
            }
        } else if (remove.right == null) {
            if (remove == root) {
                root = remove.left;
            } else if (remove == parentRemove.right) {
                parentRemove.right = remove.left;
            } else {
                //삭제 대상의 왼쪽 자식을 삭제 대상 위치에 둔다.
                parentRemove.left = remove.left;
            }
        }
        /**
         * 두 개의 자식 노드가 존재하는 경우
         * 삭제할 노드의 왼쪽 서브 트리에 있는 가장 큰 값 노드를 올리거나
         * 오른쪽 서브 트리에 있는 가장 작은 값 노드를 올리면 된다.
         * 구현 코드는 2번째 방법을 사용한다.
         */
        else {
            Node parentReplace = remove;  // 삭제 대상 노드의 자식 노드 중에서 대체될 노드(replaceNode)를 찾는다.

            Node replaceNode = parentReplace.right;  //삭제 대상의 오른쪽 서브 트리 탐색 지정

            while (replaceNode.left != null) {
                //가장 작은 값을 찾기 위해 왼쪽 자식 노드로 탐색한다.
                parentReplace = replaceNode;
                replaceNode = replaceNode.left;
            }

            if (replaceNode != remove.right) {
                //가장 작은 값을 선택하기 때문에 대체 노드의 왼쪽 자식은 빈 노드가 된다.

                parentReplace.left = replaceNode.right;

                //대체할 노드의 오른쪽 자식 노드를 삭제할 노드의 오른쪽으로 지정한다.
                replaceNode.right = remove.right;
            }
            /* 삭제할 노드가 루트 노드인 경우 대체할 노드로 바꾼다. */
            if (remove == root) {
                root = replaceNode;
            } else if (remove == parentRemove.right) {
                parentRemove.right = replaceNode;
            } else {
                parentRemove.left = replaceNode;
            }

            /* 삭제 대상 노드의 왼쪽 자식을 잇는다. */
            replaceNode.left = remove.left;
        }

        return true;
    }

    public void inorderTree(Node root, int depth) {
        if (root != null) {
            inorderTree(root.left, depth + 1);
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.data);
            inorderTree(root.right, depth + 1);
        }
    }

    /**
     * 후위 순회
     */
    public void postorderTree(Node root, int depth) {
        if (root != null) {
            postorderTree(root.left, depth + 1);
            postorderTree(root.right, depth + 1);
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.data);
        }
    }

    /**
     * 전위 순회
     */
    public void preorderTree(Node root, int depth) {
        if (root != null) {
            for (int i = 0; i < depth; i++) {
                System.out.print("ㄴ");
            }
            System.out.println(root.data);
            preorderTree(root.left, depth + 1);
            preorderTree(root.right, depth + 1);
        }
    }
}
   class BinarySearchTreeTest{
       public static void main(String[] args) {
           BinarySearchTree02 tree = new BinarySearchTree02();
           tree.insert(5);
           tree.insert(8);
           tree.insert(7);
           tree.insert(10);
           tree.insert(9);
           tree.insert(11);

           if (tree.removeNode(10)) {
               System.out.println("노드 삭제");
           }

           // tree.inorderTree(tree.rootNode, 0);
           // tree.postorderTree(tree.rootNode, 0);
           tree.preorderTree(tree.root, 0);
       }
   }


