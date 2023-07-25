package org.linkedlist;

public class Main {
    public static void main(String[] args) {
        //Create Nodes
        Node a = new Node(20);
        Node b = new Node(384);
        Node c = new Node(1);
        Node d = new Node(-88);
        Node e = new Node(2148);

        LinkedList ll = new LinkedList(a);
        ll.insert(b);
        ll.insertAfter(b,c);
        ll.insertAfter(c,e);
        System.out.println(ll);

        ll.traverse(ll);
    }
}