/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class DoublyLinkedList{
    
    private DoubleNode first;
    private DoubleNode last;
    
    public void setFirst(DoubleNode i)
    {
        first = i;
    }
    
    public void setLast(DoubleNode i)
    {
        last = i;
    }
    public void insertBegining(DoubleNode i)
    {
        DoubleNode oldfirst = first;
        first = i;
        oldfirst.previous = first;
        first.next = oldfirst;
        first.previous = null;
    }
    
    public void insertEnd(DoubleNode i)
    {
        DoubleNode oldlast = last;
        last = i;
        oldlast.next = last;
        last.previous = oldlast;
        last.next = null;
    }
    
    public void removeBegining()
    {
        first = first.next;
        first.previous = null;
    }
    
    public void removeEnd()
    {
        last = last.previous;
        last.next = null;
                
    }
    
    public void insertBeforeNode(DoubleNode i, DoubleNode node)
    {
        (node.previous).next = i;
        i.previous = node.previous;
        i.next = node;
        node.previous = i;
    }
    
    public void insertAfterNode(DoubleNode i, DoubleNode node)
    {
        (node.next).previous = i;
        i.previous = node;
        i.next = node.next;
        node.next = i;
    }
    
    public void removeNode(DoubleNode i)
    {
        if(i.next == null)
        {
            removeEnd();
        }
        else if(i.previous == null)
        {
            removeBegining();
        }
        else 
        {
        (i.previous).next = i.next;
        (i.next).previous = i.previous;
        }
    }
    
    public void moveFront(DoubleNode i)
    {
        removeNode(i);
        insertBegining(i);
        
    }
    
    public void moveEnd(DoubleNode i)
    {
        removeNode(i);
        insertEnd(i);
        
    }
    
    public void printLinkedList()
    {
        for(DoubleNode x = first; x != null; x = x.next)
        {
            System.out.print(x.s + " ");
        }
        
        System.out.println();
    }

    
    
    
}
