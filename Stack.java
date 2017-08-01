
public class Stack {

	
	Node 	top;
	Node	bot;
	
	Stack() {
		
		top = null;
		bot = null;
	}
	
	Object pop() {
		
		if( top == null ) {		// stack is empty;
			
			return "Stack is empty.";
		}
		else if( top == bot ) {	// stack has only one node 
			
			Object ret = new Object();
			ret = top.obj;
			
			top = null;
			bot = null;
			
			return ret;
		}
		else {					// stack has more than two nodes
		
			Object ret = new Object();
			ret = top.obj;
			
			top = top.prev;
			top.next = null;
			
			return ret;
		}
	}
	
	void push( Node node ) {
	
		if( top == null ) {			// stack is empty
			
			top	= node;
			bot	= node;		
		}
		else {						// stack is not empty
			
			top.next	= node;
			node.prev	= top;
			top 		= node;
		}
	}
	
	boolean checkEmpty() {
		
		// true if stack is empty
		// false if stack is not empty 
		
		if( top == null )
			return true;
		
		return false;
	}
}
