// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    
    Node(int a){
        data = a;
        next=null;
    }
    
    
    public void getData(){
        System.out.println(data);
    }
    
    public void getNext(){
        System.out.println(next);
        
    }
}
class Main {
    public static void main(String[] args) {
        Node a = new Node(40);
        Node b = new Node(60);
        a.getData();
        a.getNext();
       System.out.println(a);
       b.getData();
       b.getNext();
       System.out.println(b);
    }
}
