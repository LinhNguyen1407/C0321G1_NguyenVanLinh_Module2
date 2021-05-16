package bai9_list.exercise.LinkedList;

public class MyLinkedList <E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }
    public void add(int index, E data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public Object get (int index) {
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove (int index) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Error index :" + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    public int size () {
        return numNodes;
    }

    public boolean remove (E data) {
        if (head.data.equals(data)) {
            remove (0);
            return true;
        } else {
            Node temp = head;
            int index = 1;
            while (temp.next != null) {
                temp = temp.next;
                if (temp.data.equals(data)) {
                    remove(index);
                    return true;
                }
                index++;
            }
            return false;
        }
    }
}
