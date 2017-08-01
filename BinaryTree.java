class TreeNode {
	
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode( int value ) {
		
		this.value	= value;
		left		= null;
		right		= null;
	}
	
}


public class BinaryTree {

	TreeNode root;
	TreeNode curr;
	
	BinaryTree() {
		
		root = null;
		curr = null;
	}
	
	boolean addNode( TreeNode pos, TreeNode newNode, int l_r ) {
		
		return true;
	}
	
	void addNode( TreeNode newNode ) {
		
		if( root == null ) {
			
			root = newNode;
			curr = root;
			return;
		}
		
		if( curr.value > newNode.value ) {			// to LEFT
			
			if( curr.left != null ) {
				
				curr = curr.left;
				addNode( newNode );
			}
			else {
				curr.left = newNode;
			}
		}
		else if( curr.value < newNode.value ) {		// to RIGHT
			
			if( curr.right != null ) {
				
				curr = curr.right;
				addNode( newNode );
			}
			else {
				curr.right = newNode;
			}
		}
	}
	
	void removeNode( int pos ) {
		
		
		
	}
}


