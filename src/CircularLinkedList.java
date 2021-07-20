import java.util.*;

public class CircularLinkedList
{
    private Node last;
    private int length;

    private class Node
    {
        private Node next;
        private int data;


        public Node(int data)
        {
            this.data=data;
        }
    }
    public CircularLinkedList()
    {
        this.last=null;
        this.length=0;
    }

    public void display()
    {
        if(last==null)
        {
            return;
        }
        Node first =last.next;
        while(first != last)
        {
            System.out.print(first.data+" ");
            first=first.next;
        }
        System.out.print(first.data);
    }

    public void createcircularLinkedList()
    {
        Node first = new Node(1);
        Node second = new Node(23);
        Node third = new Node(22);
        Node fourth = new Node(69);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;

        last=fourth;
    }

    public void insetFirst(int data)
    {
        Node temp = new Node(data);
        if(last == null)
        {
            last=temp;
        }
        else {
            temp.next = last.next;
        }
            last.next=temp;
            length++;
        }

        public void insertLast(int data)
        {
            Node temp = new Node(data);
            if(last == null)
            {
                last=temp;
                last.next=last;
            }
            else
            {
                temp.next=last.next;
                last.next=temp;
                last=temp;
            }
            length++;
        }


    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createcircularLinkedList();
        cll.insetFirst(9);
        cll.insertLast(31);
        cll.insertLast(91);
        cll.display();
    }


}
