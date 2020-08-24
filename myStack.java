package mystack;

class myLinkedList<E>{
    E data; 
    myLinkedList next;    
}

public class MyStack {
        
    static class stack<E>{
    
        myLinkedList<E> head = null;

    
    void push(E data){
        myLinkedList<E> mll = new myLinkedList();
        mll.data = data;
        if(head == null){
           head = mll;
           mll.next=null;
           head.next = null;
        }else{
            mll.next = head;
            head = mll;
        }
    }

    E pop() {
        E data=head.data; 
        myLinkedList<E> temp = head;
        head = head.next;
        return data;
    }    
    
    E peek(){
        return head.data;
    }    
    
    void print(){
        myLinkedList<E> temp = head;
        
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
    
    
    public static void main(String[] args) {
         
        stack<Integer> s = new stack();
        
        for(int i = 1 ; i<=100 ; i++){
            s.push(i);
        }
        
        s.print();

    }
}
