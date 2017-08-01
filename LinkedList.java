
public class LinkedList {

	Node	head;
	Node	tail;
	Node	curr;
	
	LinkedList() {
		
		head	= null;
		tail	= null;
		curr	= null;
	}
	
	
	// append a node to the tail node
	
	void appendNode( Node node ) {
		
		if( head == null ) {		// LinkedList has no node
			
			head	= node;
			tail	= node;		
		}
		else if( head == tail ) {	// LinkedList has only one node 
			
			head.next	= node;
			node.prev	= head;
			tail 		= node;
		}
		else {						// LinkedList has more than one node
			
			tail.next	= node;
			node.prev	= tail;
			tail 		= node;
		}	
	}
	
	
	// insert a node into the LinkedList
	
	void appendNode( Node node, int pos ) {
		
		Node curr = head;
		
		for( int i = 0 ; i < pos ; i++ )
			curr = curr.next;
		
		node.next		= curr;
		node.prev		= curr.prev;
		curr.prev		= node;
		node.prev.next	= node;
	}
	
	void removeNode( int pos ) {
		
		Node curr = head;
		
		if( head == null ) {		// LinkedList has no node
		
			// NO action
		}
		else if( head == tail ) {	// LinkedList has only one node 

			head = null;
			tail = null;
		}
		else {						// LinkedList has more than two nodes
			
			if( pos == 0 ) {
				
				head			= curr.next;
				curr.next.prev	= null;
				curr.next		= null;
			}
			else {
								
				for( int i = 0 ; i < pos ; i++ )
					curr = curr.next;
			
				
				if( curr == tail ) {
					
					tail		= curr.prev;
					curr.prev	= null;
					tail.next	= null;
				}
				else {
						
					curr.prev.next = curr.next;
					curr.next.prev = curr.prev;
				}
			}
		}
	}

	void printAllNodes() {
		
		System.out.println( "---begin---" );
		
		if( head == null ) {
			
			System.out.println( -1 );
		}
	
		else {
			
			curr = head;
		
			while( true ) {
				
				System.out.println( curr.obj );
					
				if( curr.next == null )
					break;
				
				curr = curr.next;
				
			}
		}
		
		System.out.println( "---end---" );
		curr = null;
	
	}	
}


class Node {
	
	Object obj;
	Node next;
	Node prev;
	
	Node( Object obj ) {
		
		this.obj	= obj;
		next		= null;
		prev		= null;
	}
}