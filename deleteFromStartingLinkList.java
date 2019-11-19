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
public class deleteFromStartingLinkList {
    
    class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public Node head=null;
    public Node tail=null;
    
    public void addNode(int data)
    {
        Node newdata=new Node(data);
        if(head==null)
        {
           head=newdata;
           tail=newdata;
        }else
        {
            tail.next=newdata;
            tail=newdata;
        }
    }
    
    public void displayNode()
    {
        Node current=head;
        if(head==null)
        {
            System.out.print("List EMpty");
            return;
        }else
        {
            while(current !=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
        System.out.println();
    }
    public void deleteNode()
    {
        if(head ==null)
        {
            System.out.print("List Empty");
            return;
        }
        else
        {
            if(head !=tail)
            {
                head=head.next;
            }
            else
            {
                head=tail=null;
            }
        }
    }
    public static void main(String[] arg)
    {
        deleteFromStartingLinkList list=new deleteFromStartingLinkList();
        list.addNode(0);
        list.addNode(2);
        list.addNode(4);
        list.displayNode();
        while(list.head !=null)
        {
            list.deleteNode();
            System.out.println("Update After Delete From Statring Node");
            list.displayNode();
        }
    }
}
