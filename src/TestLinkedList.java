/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kayla
 */
public class TestLinkedList {
    
    public static void main(String[] args)
    {
        DoublyLinkedList x = new DoublyLinkedList();
        DoubleNode a = new DoubleNode("a");
        DoubleNode b = new DoubleNode("b");
        DoubleNode c = new DoubleNode("c");
        DoubleNode d = new DoubleNode("d");
        x.setFirst(a);
        x.setLast(d);
        a.next = b;
        b.previous = a;
        b.next = c;
        c.previous = b;
        c.next = d;
        d.previous = c;
        
        System.out.print("initial: ");
        x.printLinkedList();
        x.insertBegining(new DoubleNode("k"));
        System.out.print("insertBegining 'k': ");
        x.printLinkedList();
        x.insertEnd(new DoubleNode("e"));
        System.out.print("insertEnd 'e': ");
        x.printLinkedList();
        x.removeBegining();
        System.out.print("removeBegining 'k': ");
        x.printLinkedList();
        x.removeEnd();
        System.out.print("removeEnd 'e': ");
        x.printLinkedList();
        x.insertBeforeNode(new DoubleNode("m"), c);
        System.out.print("insertBeforeNode'm' before 'c': ");
        x.printLinkedList();
        x.insertAfterNode(new DoubleNode("g"), a);
        System.out.print("insertAfterNode 'g' after 'a': ");
        x.printLinkedList();
        x.removeNode(b);
        System.out.print("removeNode 'b': ");
        x.printLinkedList();
        x.moveFront(c);
        System.out.print("moveFront 'c': ");
        x.printLinkedList();
        x.moveEnd(a);
        System.out.print("moveEnd 'a': ");
        x.printLinkedList();
    }  
}

/* OUTPUT

run:
initial: a b c d 
insertBegining 'k': k a b c d 
insertEnd 'e': k a b c d e 
removeBegining 'k': a b c d e 
removeEnd 'e': a b c d 
insertBeforeNode'm' before 'c': a b m c d 
insertAfterNode 'g' after 'a': a g b m c d 
removeNode 'b': a g m c d 
moveFront 'c': c a g m d 
moveEnd 'a': c g m d a 
BUILD SUCCESSFUL (total time: 0 seconds)


*/