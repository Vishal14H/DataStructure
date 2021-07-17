import java.util.*;

public class SinglyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void insertFirst(int data){

    }

        void add(int data)
        {
            Node new_data = new Node(data);

            if(head == null){
                head = new_data;
                return;
            }
            Node temp = head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next = new_data;
        }
        void display(){
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(23);
        sll.add(13);
        sll.add(63);
        sll.add(43);
        sll.display();
    }
    }
