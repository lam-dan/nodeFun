 class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
        this.head = null;

    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {

        Node newNode = new Node(value);


        if(head == null) {
            head = newNode;

        } else {
            Node runner = head;//points runner to what head is pointing to
            while(runner.next != null) { //when runner.next is not equal to null
                // System.out.println(runner.value);
                runner = runner.next; //runners moves to next node
            }
            runner.next = newNode; //links new Node to Singly Linked List
            // System.out.println("****"+runner.next.value);
        }
    }

    public void remove() {

        Node runner = head;
        System.out.println(runner.value);
        while(runner.next.next != null){ //traverse through SList
            runner=runner.next;
            System.out.println(runner.value);
        }
        runner.next = null; //removes node
        System.out.println(runner.value);
    }


    public void printValues() {

        Node runner = head;
        System.out.println(runner.value);
        while(runner.next != null){
            runner = runner.next;
        System.out.println(runner.value);
        }

    }

    public insertAt(int val1, int val2){
        Node newNode = new Node(value,value);

        while ("")

    }
}