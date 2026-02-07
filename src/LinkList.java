public class LinkList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node NewNode = new Node(data);
        if(head == null){
            head = tail = NewNode;
            return;
        }
        NewNode.next = head;

        head = NewNode;
        size++;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.next=null;
        tail=newNode;
        size++;
    }

    public void printLL(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
        System.out.println("null");

    }
    public void add(int idx, int data){
        Node newNode = new Node(data);
        if(idx==0){
            addFirst(data);
            return;
        }
        Node ptr = head;
        int i=0;
        while(i<idx){
            ptr=ptr.next;
            i++;
        }
        newNode.next = ptr.next;
        ptr.next=newNode;
        size++;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();
        ll.add(2,5);
        ll.printLL();
        System.out.println(ll.size);



    }
}
