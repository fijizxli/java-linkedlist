package org.linkedlist;

public class LinkedList {
    private Node head = null;

    public LinkedList(){};
    public LinkedList(Node n) {
        setHead(n);
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insert(Node n){
        Node temp = head;
        head = n;
        head.setNext(temp);
    };

    public void insertAfter(Node x, Node n){
        n.setNext(x.getNext());
        x.setNext(n);
    }

    public void remove(){
        if (head != null)
            head = head.getNext();
    }

    public void traverse(LinkedList ll){
        Node x = ll.head;
        while (x != null){
            System.out.println(x.getValue());
            x = x.getNext();
        }
    }

    public void removeAfter(Node x){
        x.setNext(x.getNext().getNext());
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
