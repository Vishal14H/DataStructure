import java.util.*;

public class SinglyLinkedList {

    // creating a head of type Node
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // calling display function
    void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // to find out the length of the linked list
    public int length()
    {
        if(head == null){return 0;}
        int count =0;
        Node current = head;
        while(current != null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    // inserting node at first position
    void insertFirst(int data)
    {
        Node new_data = new Node(data);
        Node temp = head;
        head = new_data;
        head.next = temp;
    }

    // inserting Node at given position
    void insertAtPosition(int position, int data){
    Node new_data = new Node(data);
       if(position == 1)
    {
        new_data.next = head;
        head = new_data;
    }
    else{
        Node previous = head;
        int count =0;
        while(count < position-1){
            previous=previous.next;
            count++;
        }
        Node current = previous.next;
        previous.next = new_data;
        new_data.next = current;
    }
    }

    // inserting at the last position
        void addLast(int data)
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

        // deleting the first node
        Node deleteFirst()
        {
            if(head == null){return null ;}
            Node temp = head;
            head=head.next;
            temp.next=null;
            return temp;

        }

        // deleting the last node
        Node deleteLast()
        {
            if(head == null || head.next == null){return head;}
            Node temp = head;
            Node previous = null;
            while(temp.next != null)
            {
                previous = temp;
                temp=temp.next;
            }
            previous.next = temp.next;
            return previous.next;
        }



        // deleting by specific value or key
        Node deleteNode(int position)
        {
            int size = length(); // for finding the length of the linked list
            if(position > size || position < 1)  // checking weather the position is valid or not means it must not be greater than size of linked and must not be less than 1
            {
                System.out.println("Invalid position");
                return head;
            }

            if(position == 1)
            {
                Node temp = head;
                head=head.next;
                temp.next= null;
                return temp;
            }
            else
            {
                Node previous = head;
                int count =1;
                while(count < position-1)
                {
                    previous=previous.next;
                    count++;
                }
                Node current = previous.next;
                previous.next = current.next;
                current.next = null;
                return current;
            }
        }

        public boolean searchKey(int key)
        {
            Node temp = head;
            while(temp != null)
            {
                if(temp.data == key){
                    System.out.println("Key "+ key + " found");
                    return true; //data found
                }
                temp = temp.next;
            }
            System.out.println("Key not found");
            return false; // data not found
        }

        // to find the element at nth node
    public void nthIndex(int index)
    {

            int count = 0;
            Node temp = head;
            while (temp != null) {
                if (count == index) {

                    System.out.println("Nth index item is: "+ temp.data );
                }
                count++;
                temp = temp.next;
            }

            assert (false);
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
       sll.addLast(23);
        sll.addLast(13);
        sll.addLast(63);
        sll.addLast(43);
        sll.addLast(46);
        sll.addLast(83);
        sll.addLast(25);
        sll.addLast(99);
        sll.addLast(12);
        sll.addLast(78);
        sll.addLast(11);
        sll.addLast(81);
        sll.insertFirst(22);
        sll.insertFirst(55);
        sll.insertAtPosition(2,67);
        sll.insertAtPosition(3,34);
        sll.deleteFirst();
        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteLast();
        sll.deleteNode(1);
        sll.deleteNode(2);
        sll.deleteNode(3);
        sll.nthIndex(5);
        sll.display();
    }
    }
