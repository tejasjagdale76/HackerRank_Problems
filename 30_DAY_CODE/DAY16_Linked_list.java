import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class DAY16_Linked_list {

    public static  Node insert(Node head,int data) {
        //Complete this method
       Node newNode = new Node(data);

    // If the list is empty
    if (head == null) {
        return newNode;
    }

    // Traverse to the last node
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    // Insert at the end
    temp.next = newNode;

    return head;
}
    

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}