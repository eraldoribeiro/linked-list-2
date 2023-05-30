// List node 
class Node {
	int data;  // data to be stored in node
	Node next; // points to next node of the list
	
	// Constructor 
	Node(int d){
		this.data = d;
		next = null;
	} 
}

// Linked list 
class LinkedList {
	Node head; // head of list
	
	// Constructor 
    LinkedList(){
        head = null;
    }
    
    
    // Prints the entire list starting from the head
    public void printList()
    {
    	Node n = head;
    	while (n != null) {
    		System.out.print(n.data + " ");
    		n = n.next;
    	}
    }

}


public class testLinkedList {
  
  public static void main(String[] args) {

		/* Start with the empty list. */
	LinkedList llist = new LinkedList();

	llist.head = new Node(1);
	Node second = new Node(2);
	Node third = new Node(3);

	llist.head.next = second; // Link first node with the second node
	second.next = third; // Link second node with the third node

	llist.printList();

    
  }
}
