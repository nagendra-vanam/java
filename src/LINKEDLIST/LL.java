package LINKEDLIST;



public class LL {
  Node head;

    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
     public void insertatfirst(String data)
     {
         Node newnode=new Node(data);
         if(head==null)
         {
             head=newnode;
         }
         else{
             newnode.next=head;
             head=newnode;
         }

     }
    public void insertatLast(String data)
    {
        Node newnode=new Node(data);
        Node Current=head;
        if(head==null)
        {
            head=newnode;
        }
        else{
        while(Current.next!=null)
        {
            Current=Current.next;
        }
        Current.next=newnode;
        }

    }
     public void Print()
     {
         Node Current=head;
         while(Current!=null)
         {
             System.out.print(Current.data+"-->");
             Current=Current.next;
         }
     }
     public void deletefirst()
    {
     head=head.next;
    }
    public void deletelast()
    {
        Node Current=head;
        Node prev=null;
        while(Current.next!=null)
        {
          prev=Current;
            Current=Current.next;
        }
        prev.next=null;
    }
    public void reversell()
    {
        Node currentnode=head.next;
        Node previousnode=head;
        while(currentnode!=null)
        {
            Node newnode=currentnode.next;
            previousnode=currentnode;
            currentnode=newnode;
        }
        head.next=null;

    }

    public static void main(String[] args) {
        LL list=new LL();
       list.insertatfirst("a");
        list.insertatfirst("f");
        list.insertatLast("hello");
//        list.deletefirst();

        list.reversell();
       list.Print();

    }


}
