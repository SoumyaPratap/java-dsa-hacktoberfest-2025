/**
 * Binary Tree - Insert and Inorder traversal (simple demo)
 * Time Complexity (insert/traverse): O(n)
 * Space Complexity: O(n) (recursion/queue)
 * Author: SoumyaPratap
 */
package Trees;

import java.util.*;

public class BinaryTree {
    static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; left = right = null; }
    }

    public static Node insertLevelOrder(Integer[] arr) {
        if (arr.length == 0) return null;
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < arr.length) {
            Node cur = q.poll();
            if (arr[i] != null) {
                cur.left = new Node(arr[i]);
                q.add(cur.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                cur.right = new Node(arr[i]);
                q.add(cur.right);
            }
            i++;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, null, 7};
        Node root = insertLevelOrder(arr);
        System.out.print("Inorder traversal: ");
        inorder(root); // prints inorder
        System.out.println();
    }
}
