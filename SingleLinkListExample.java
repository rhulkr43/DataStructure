/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author rhulkr43
 */
public class SingleLinkListExample {
    class Node
    {
        int data;
        Node next;
        
       
        public Node(int data)
        {
            this.data = data;    
            this.next = null;  
        }
       
        
    }
     public Node head=null;
    public Node tail=null;
    
    
    public void addNode(int data)
    {
        Node newdata=new Node(data);
        if(head ==null)
        {
           head = newdata;    
            tail = newdata;    
        }else
        {
            tail.next=newdata;
            tail=newdata;
        }
        
    }
    public void countNode()
    {
        int count=0;
        Node current=head;
        while(current !=null)
        {
            count++;
            current=current.next;
        }
        System.out.println("Total Node is :"+count);
    }
    public void display()
    {
        Node current=head;
        if(head == null)
        {
            System.out.print("Empty Node");
        }
        else
        {
            while(current !=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
            
        }
        System.out.println();
    }
    
    public void reverse(Node current)
    {
        if(head==null)
        {
            System.out.print("List Empty");
            
        }else
        {
            if(current.next==null)
            {
                System.out.print(current.data+" ");
                return ;
            }
            reverse(current.next);
            System.out.print(current.data+" ");
        }
    }
    
    public static void main(String[] arg)
    {
        SingleLinkListExample ob=new SingleLinkListExample();
       ob.addNode(1);
       ob.addNode(5);
       ob.addNode(3);
       ob.addNode(9);
       System.out.println("Node Display");
        ob.display();
        ob.countNode();
        System.out.println("Reverse Order");
        ob.reverse(ob.head);
    }
   
}
