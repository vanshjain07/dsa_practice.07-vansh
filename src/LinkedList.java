public class LinkedList {
    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        if(head==null){
            Node newNode = new Node(data);
            size++;
            head = tail = newNode;
        }else{
            Node newNode = new Node(data);
            size++;
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(int data){
        if(head==null){
            Node nn = new Node(data);
            size++;
            head = tail = nn;
        }else{
            Node nn = new Node(data);
            size++;
            nn.next=null;
            tail.next=nn;
            tail=nn;
        }
    }

    public void addInMiddle(int index , int data){
        if(head==null){
            System.out.println("Linked List is null");
            return;
        }
        Node nn = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(i==index-1){
                nn.next=temp.next;
                temp.next=nn;
                break;
            }
            temp=temp.next;
            i++;
        }
    }

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        Node ptr = head;
        while(ptr!=null){
            System.out.print(ptr.data+"->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        size--;
    }

    public void removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return;
        }else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        Node temp = head;
        int i = 0;
        while(i<size-2){
            temp=temp.next;
            i++;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public void search(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if((temp.data)==key){
                System.out.println(key+" found at index "+i);
                break;
            }
            temp = temp.next;
            i++;
        }
    }

    public int RecursiveSearch(int key){
        int flag = 0;
        if((head.data)==key){
            flag = 1;
        }else{
            head=head.next;
            RecursiveSearch(key , head);
        }
        System.out.println(flag);
    }

//    public void size(){
//        if(head==null){
//            System.out.println("Size is 0 ");
//            return;
//        }
//        int i = 0;
//        Node temp = head;
//        while (temp!=null){
//            temp=temp.next;
//            i++;
//        }
//        System.out.println(i+" is the size of this LL");
//    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(16);
        ll.addFirst(44);
        ll.addLast(10);
        ll.addLast(27);
        ll.printLL();
        ll.addInMiddle(2,5);
        ll.printLL();
        System.out.println(ll.size);
        System.out.println();
        ll.removeFirst();
        ll.printLL();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.size);
        ll.addFirst(55);
        ll.addFirst(99);
        ll.printLL();
        ll.search(5);
        System.out.println(ll.size);


    }
}
