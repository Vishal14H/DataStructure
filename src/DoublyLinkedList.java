import java.util.*;

public class DoublyLinkedList
{
    private Node head;
    private Node tail;
    private int length;

    private class Node
    {
       private int data;
       private Node next;
       private Node previous;


    public Node(int data)
    {
        this.data=data;

    }
    }

    public DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

     //   System.out.println("Null");
    }

    public void reverseDisplay()
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.data + " " );
            temp = temp.previous;
        }
    }

    public void insertFirst(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous=newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public Node deleteFirst()
    {
        if(isEmpty()){ throw new NoSuchElementException();}
        Node temp = head;
        if(head == tail)
        {
            tail = null;
        }
        else
        {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node deleteLast()
    {
        if(isEmpty()){ throw new NoSuchElementException();}
        Node temp = tail;
        if(head==temp)
        {
            head = null;
        }
        else
        {
            tail.previous.next = null;
        }

        tail=tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(23);
        dll.insertFirst(34);
        dll.insertLast(45);
        dll.insertFirst(91);
        dll.insertLast(69);
        dll.insertLast(56);
        dll.insertLast(90);
      //  dll.reverseDisplay();
      //  System.out.println();
        dll.deleteFirst();
        dll.deleteLast();
        dll.deleteLast();
        dll.display();

    }

}