public class SingleLinkedList {
    Node head;
    Node tail;
    int size;

    public SingleLinkedList() {
        System.out.println("List is creating");
    }

    //methods
    //insert element at first
    public void insertFirst(int value){
        Node node = new Node(value);
        if(head==null){
            head =node;
            tail =node;
        }else{
            node.next = head;
            head = node;
            size++;
        }

    }

    //insertlast
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    //insert at any index
    public void insert(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    //delete fist
    public void deletefirst(){
       head = head.next;

       if(head==null){
           tail= null;
       }
        size--;

    }

    public void deletelast(){
        if(size<=1){
            deletefirst();
            return;
        }
        Node secondlast = get(size-2);
        secondlast.next = null;
        secondlast = tail;
    }

    //delete at given index
    public void delete(int index){
        if(index==0){
            deletefirst();
            return;
        }
        if(index==size-1){
            deletelast();
            return;
        }

        Node temp = get(index-1);
        temp.next = temp.next.next;


    }

    //get node
    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }


    //Display method
    public void display(){
        try{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value+"->");
                temp = temp.next;
            }
            System.out.println("END");

        }catch(NullPointerException ex){
            System.out.println("list is empty");
        }


    }

}
