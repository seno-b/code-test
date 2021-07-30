package testdome.java;

/**
 *
 *Q. Binary search tree (BST) is a binary tree where the value of each node is larger or equal to the values in all the nodes in that node's left subtree and is smaller than the values in all the nodes in that node's right subtree.
 *
 * Write a function that, efficiently with respect to time used, checks if a given binary search tree contains a given value.
 *
 * For example, for the following tree:
 *
 * n1 (Value: 1, Left: null, Right: null)
 * n2 (Value: 2, Left: n1, Right: n3)
 * n3 (Value: 3, Left: null, Right: null)
 * Call to contains(n2, 3) should return true since a tree with root at n2 contains number 3.
 *
 *
 * 이진 검색 트리 (BST)는 각 노드의 값이 해당 노드의 왼쪽 하위 트리에있는 모든 노드의 값보다 크거나 같은 이진 트리이며 해당 노드의 오른쪽 하위 트리에있는 모든 노드의 값보다 작습니다.
 *
 * 사용 된 시간과 관련하여 주어진 이진 검색 트리에 주어진 값이 포함되어 있는지 확인하는 함수를 작성하십시오.
 *
 * 예를 들어 다음 트리의 경우 :
 *                             (2)
 *                          (1)   (3)
 *
 * n1 (값 : 1, 왼쪽 : null, 오른쪽 : null)
 * n2 (값 : 2, 왼쪽 : n1, 오른쪽 : n3)
 * n3 (값 : 3, 왼쪽 : null, 오른쪽 : null)
 * n2에 루트가있는 트리는 숫자 3을 포함하므로 contains (n2, 3)에 대한 호출은 true를 리턴해야합니다.
 * return : contains (n2,3)
 *
 */

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public static boolean contains(Node root, int value) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        if ( root == null) {
            return false;
        }

        if ( root.value == value ) {
            return true;
        } else if ( root.value < value ){
            return contains(root.right, value);
        } else {
            return contains(root.left, value);
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}